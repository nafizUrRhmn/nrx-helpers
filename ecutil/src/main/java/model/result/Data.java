package model.result;

public class Data {
    private String jobId;
    private String result;
    private String errorReason;
    private VerificationResponse verificationResponse;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public VerificationResponse getVerificationResponse() {
        return verificationResponse;
    }

    public void setVerificationResponse(VerificationResponse verificationResponse) {
        this.verificationResponse = verificationResponse;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public String toString() {
        return "Data{" +
                "jobId='" + jobId + '\'' +
                ", result='" + result + '\'' +
                ", verificationResponse=" + verificationResponse +
                '}';
    }
}
