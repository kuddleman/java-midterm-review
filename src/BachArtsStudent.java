public class BachArtsStudent extends Student {
    private String name, major;
    private int id;
    private boolean hasGraduated;
    private double gpa;

    public BachArtsStudent(String name, String major, int id, boolean hasGraduated, double gpa) {
        super(name, major, id, hasGraduated);
        this.gpa = gpa;
    }

    @Override
    public void register() {
        System.out.println("This BachStudent is registered.");
    }

    @Override
    public void tuition() {
        System.out.println("This bach student paid tuition");
    }
}
