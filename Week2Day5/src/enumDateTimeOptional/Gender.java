package enumDateTimeOptional;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String genderType;

    Gender(String genderType) {
        this.genderType = genderType;
    }

}
