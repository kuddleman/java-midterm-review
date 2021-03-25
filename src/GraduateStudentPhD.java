public class GraduateStudentPhD extends GraduateStudent {


    public GraduateStudentPhD(String name, int id, Major major, boolean graduated, String thesis) {
        super(name, id, major, graduated, thesis);
    }
    public GraduateStudentPhD(String name, int id, Major major, String thesis) {
        super(name, id, major, thesis);
    }

    @Override
    public void tuition() {
        System.out.println(super.getName() + " pays no tuition.");
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works in research and as a TA.");
    }

    public void defend() {
        System.out.println(super.getName() + " is defending their thesis.");
    }
}
