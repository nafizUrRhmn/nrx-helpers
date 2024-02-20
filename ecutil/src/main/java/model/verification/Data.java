package model.verification;

import java.util.List;

public class Data {
    private List<FingerUploadUrls> fingerUploadUrls;
    private String resultCheckApi;

    public List<FingerUploadUrls> getFingerUploadUrls() {
        return fingerUploadUrls;
    }

    public void setFingerUploadUrls(List<FingerUploadUrls> fingerUploadUrls) {
        this.fingerUploadUrls = fingerUploadUrls;
    }

    public String getResultCheckApi() {
        return resultCheckApi;
    }

    public void setResultCheckApi(String resultCheckApi) {
        this.resultCheckApi = resultCheckApi;
    }
}
