package model.result;

public class PresentAddress {

    private String division;
    private String district;
    private String rmo;
    private String upozila;
    private String cityCorporationOrMunicipality;
    private String unionOrWard;
    private String postOffice;
    private String postalCode;
    private String wardForUnionPorishod;
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

    public String getCityCorporationOrMunicipality() {
        return cityCorporationOrMunicipality;
    }

    public void setCityCorporationOrMunicipality(String cityCorporationOrMunicipality) {
        this.cityCorporationOrMunicipality = cityCorporationOrMunicipality;
    }

    public String getUnionOrWard() {
        return unionOrWard;
    }

    public void setUnionOrWard(String unionOrWard) {
        this.unionOrWard = unionOrWard;
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

    public String getWardForUnionPorishod() {
        return wardForUnionPorishod;
    }

    public void setWardForUnionPorishod(String wardForUnionPorishod) {
        this.wardForUnionPorishod = wardForUnionPorishod;
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
        return "PresentAddress{" +
                "division='" + division + '\'' +
                ", district='" + district + '\'' +
                ", rmo='" + rmo + '\'' +
                ", upozila='" + upozila + '\'' +
                ", cityCorporationOrMunicipality='" + cityCorporationOrMunicipality + '\'' +
                ", unionOrWard='" + unionOrWard + '\'' +
                ", postOffice='" + postOffice + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", wardForUnionPorishod='" + wardForUnionPorishod + '\'' +
                ", additionalMouzaOrMoholla='" + additionalMouzaOrMoholla + '\'' +
                ", additionalVillageOrRoad='" + additionalVillageOrRoad + '\'' +
                ", homeOrHoldingNo='" + homeOrHoldingNo + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
