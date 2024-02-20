package model.result;

public class VoterInfo {
    private String name;
    private String nameEn;
    private String bloodGroup;
    private String dateOfBirth;
    private String father;
    private String mother;
    private String spouse;
    private String nationalId;
    private String occupation;
    private PermanentAddress permanentAddress;
    private String photo;
    private PresentAddress presentAddress;

    public PermanentAddress getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(PermanentAddress permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public PresentAddress getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(PresentAddress presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "VoterInfo{" +
                "name='" + name + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", spouse='" + spouse + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", occupation='" + occupation + '\'' +
                ", permanentAddress=" + permanentAddress +
                ", photo='" + photo + '\'' +
                ", presentAddress=" + presentAddress +
                '}';
    }
}
