package util.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {

    public static <T> String objectToJsonString(T obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException exp) {
            throw new RuntimeException("Exception occurred due to object to json parsing " + exp);
        }
    }

    public static <T> T jsonStringToObject(String jsonString, Class<T> clazz) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonString, clazz);
        } catch (JsonProcessingException exp) {
            throw new RuntimeException("Exception occurred due to json to object parsing " + exp);
        }

    }
}
