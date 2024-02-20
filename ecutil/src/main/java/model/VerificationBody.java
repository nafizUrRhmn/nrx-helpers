package model;

import java.util.List;

public class VerificationBody {

    private String nid10Digit;
    private String nid17Digit;
    private String dateOfBirth;
    private List<String> fingerEnums;

    public String getNid10Digit() {
        return nid10Digit;
    }

    public void setNid10Digit(String nid10Digit) {
        this.nid10Digit = nid10Digit;
    }

    public String getNid17Digit() {
        return nid17Digit;
    }

    public void setNid17Digit(String nid17Digit) {
        this.nid17Digit = nid17Digit;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getFingerEnums() {
        return fingerEnums;
    }

    public void setFingerEnums(List<String> fingerEnums) {
        this.fingerEnums = fingerEnums;
    }
}
