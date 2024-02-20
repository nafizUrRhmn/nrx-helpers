package model.result;

public class VerificationResponse {
    private VoterInfo voterInfo;

    public VoterInfo getVoterInfo() {
        return voterInfo;
    }

    public void setVoterInfo(VoterInfo voterInfo) {
        this.voterInfo = voterInfo;
    }

    @Override
    public String toString() {
        return "VerificationResponse{" +
                "voterInfo=" + voterInfo +
                '}';
    }
}
