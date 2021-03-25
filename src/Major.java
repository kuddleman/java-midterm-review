public enum Major {
    ART("Art", false),
    COMPUTER_SCIENCE("Computer Science", true),
    ENGLISH("English", true),
    MATHEMATICS("Mathematics", true),
    PHILOSOPHY("Philosophy", true);

    private String display;
    private boolean availableForGraduateStudy;

    private Major( String display, boolean availableForGraduateStudy) {
        this.display = display;
        this.availableForGraduateStudy = availableForGraduateStudy;
    }

    @Override
    public String toString() {
        return display;
    }

    private String enumName() {
        return super.toString();
    }

    public boolean isAvailableForGraduateStudy() {
        return availableForGraduateStudy;
    }

    public static Major getMajor(String majorString) {
        // this gets all the values of the enum
        Major[] majors = Major.values();
        for(Major major : majors) {
            if(major.enumName().equals(majorString)) {
                return major;
            }
        }
        return null;
    }
}
