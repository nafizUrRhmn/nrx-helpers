package model.result;

public class PermanentAddress {

    private String division;
    private String district;
    private String rmo;
    private String upozila;
    private String postOffice;
    private String postalCode;
    private String additionalMouzaOrMoholla;
    private String additionalVillageOrRoad;
    private String homeOrHoldingNo;
    private String region;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRmo() {
        return rmo;
    }

    public void setRmo(String rmo) {
        this.rmo = rmo;
    }

    public String getUpozila() {
        return upozila;
    }

    public void setUpozila(String upozila) {
        this.upozila = upozila;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAdditionalMouzaOrMoholla() {
        return additionalMouzaOrMoholla;
    }

    public void setAdditionalMouzaOrMoholla(String additionalMouzaOrMoholla) {
        this.additionalMouzaOrMoholla = additionalMouzaOrMoholla;
    }

    public String getAdditionalVillageOrRoad() {
        return additionalVillageOrRoad;
    }

    public void setAdditionalVillageOrRoad(String additionalVillageOrRoad) {
        this.additionalVillageOrRoad = additionalVillageOrRoad;
    }

    public String getHomeOrHoldingNo() {
        return homeOrHoldingNo;
    }

    public void setHomeOrHoldingNo(String homeOrHoldingNo) {
        this.homeOrHoldingNo = homeOrHoldingNo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    @Override
    public String toString() {
        return "PermanentAddress{" +
                "division='" + division + '\'' +
                ", district='" + district + '\'' +
                ", rmo='" + rmo + '\'' +
                ", upozila='" + upozila + '\'' +
                ", postOffice='" + postOffice + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", additionalMouzaOrMoholla='" + additionalMouzaOrMoholla + '\'' +
                ", additionalVillageOrRoad='" + additionalVillageOrRoad + '\'' +
                ", homeOrHoldingNo='" + homeOrHoldingNo + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
