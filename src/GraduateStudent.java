public abstract class GraduateStudent extends Student {
    private String thesis;

    //  new ThesisGraduator(thesis),
    public GraduateStudent(String name, int id, Major major, boolean graduated, String thesis) {
        super(name, id, major, graduated);
        checkMajor();
        this.thesis = thesis;
    }
    public GraduateStudent(String name, int id, Major major, String thesis) {
        // , new ThesisGraduator(thesis)
        super(name, id, major);
        checkMajor();
        this.thesis = thesis;
    }

    private final void checkMajor() {
        if(!this.getMajor().isAvailableForGraduateStudy()) {
            throw new IllegalArgumentException("Cannot create object. " +
                    this.getMajor() + " is not eligible for graduate study.");
        }
    }
    public String getThesis() {
        return thesis;
    }
    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public void setMajor(Major major) {
        checkMajor();
        super.setMajor(major);
    }

    @Override
    public String toString() {
        return super.toString() + "--Thesis:" + thesis;
    }

    public abstract void work();
}
