package util.enums;

public enum HeaderContentType {
    OCTET_STREAM("application/octet-stream"), APPLICATION_JSON("application/json");

    private String value;
    HeaderContentType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}