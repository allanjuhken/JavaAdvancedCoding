package task1;

public enum Gender {
    Male("Male"),
    Female("Female");

    private String gender;
    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
