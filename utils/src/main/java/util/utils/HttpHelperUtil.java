package util.utils;

import util.enums.HeaderContentType;
import util.http.Http;
import util.http.HttpGet;
import util.http.HttpPost;
import util.http.HttpPut;

import java.io.IOException;
import java.util.HashMap;

public class HttpHelperUtil {

    public <T, I> T httpPostCall(String url, I payload, Class<T> clazz, HeaderContentType headerContentType, String token, byte[] byteData) {
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost = setHeader(httpPost, token, headerContentType);
            if (headerContentType.equals(HeaderContentType.OCTET_STREAM)) {
                httpPost.setByteBody(byteData);
            } else {
                httpPost.setBody(ObjectMapperUtil.objectToJsonString(payload));
            }
            int responseCode = httpPost.execute();
            return responseControl(responseCode, httpPost, clazz);
        } catch (IOException exp) {
            throw new RuntimeException("Exception Occurred due to http call " + exp);
        } catch (Exception exp) {
            throw new RuntimeException("Unknown exception due in http call" + exp);
        }
    }


    public <T, I> T httpPutCall(String url, I payload, Class<T> clazz, HeaderContentType headerContentType, String token, byte[] byteData) {
        try {
            HttpPut httpPut = new HttpPut(url);
            httpPut = setHeader(httpPut, token, headerContentType);
            if (headerContentType.equals(HeaderContentType.OCTET_STREAM)) {
                httpPut.setByteBody(byteData);
            } else {
                httpPut.setBody(ObjectMapperUtil.objectToJsonString(payload));
            }
            int responseCode = httpPut.execute();
            return responseControl(responseCode, httpPut, clazz);
        } catch (IOException exp) {
            throw new RuntimeException("Exception Occurred due to http call " + exp);
        } catch (Exception exp) {
            throw new RuntimeException("Unknown exception due in http call" + exp);
        }
    }

    public <T> T httpGetCall(String url, String token, HeaderContentType headerContentType, Class<T> clazz) {
        try {
            HttpGet httpGet = new HttpGet(url);
            httpGet = setHeader(httpGet, token, headerContentType);
            int responseCode = httpGet.execute();
            return responseControl(responseCode, httpGet, clazz);
        } catch (IOException exp) {
            throw new RuntimeException("Exception Occurred due to http call " + exp);
        } catch (Exception exp) {
            throw new RuntimeException("Unknown exception due in http call" + exp);
        }
    }

    private <T, H extends Http> T responseControl(int responseCode, H http, Class<T> clazz) {
        if (responseCode == 200 || responseCode == 201 || responseCode == 202) {
            String responseBody = http.getResponseBody();
            return ObjectMapperUtil.jsonStringToObject(responseBody == null || responseBody.trim().equals("") ? responseCode + "" : responseBody, clazz);
        } else if (responseCode == 401) {
            throw new RuntimeException("Unauthorized Access");
        } else if (responseCode == 403) {
            throw new RuntimeException("Forbidden");
        } else if (responseCode == 500) {
            throw new RuntimeException("Internal Server Error");
        } else {
            throw new RuntimeException("Unsuccessful Response with code " + responseCode);
        }
    }

    private <H extends Http> H setHeader(H http, String token, HeaderContentType headerContentType) {
        if (token == null) {
            http.setHeader("Content-Type", headerContentType.getValue());
        } else {
            HashMap<String, String> headerMap = new HashMap<String, String>();
            headerMap.put("Content-Type", headerContentType.getValue());
            headerMap.put("Authorization", "Bearer " + token);
            http.setHeaders(headerMap);
        }
        return http;
    }
}
