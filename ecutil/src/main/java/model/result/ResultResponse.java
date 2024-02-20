package model.result;


public class ResultResponse {

    private String status;
    private String statusCode;

    private Success success;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Success getSuccess() {
        return success;
    }

    public void setSuccess(Success success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "status='" + status + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", success=" + success +
                '}';
    }
}
