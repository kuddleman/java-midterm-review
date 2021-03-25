public class BachSciStudent extends Student {
    private String name, major;
    private int id;
    private boolean hasGraduated;
    private double gpa;

    public BachSciStudent(String name, String major, int id, boolean hasGraduated, double gpa) {
        super(name, major, id, hasGraduated);
        this.gpa = gpa;
    }

    @Override
    public void register() {

    }

    @Override
    public void tuition() {

    }
}
