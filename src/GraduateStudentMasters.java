public class GraduateStudentMasters extends GraduateStudent {


    public GraduateStudentMasters(String name, int id, Major major, boolean graduated, String thesis) {
        super(name, id, major, graduated, thesis);
    }
    public GraduateStudentMasters(String name, int id, Major major, String thesis) {
        super(name, id, major, thesis);
    }

    @Override
    public void tuition() {
        System.out.println(super.getName() + " pays partial tuition.");
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " works as a TA.");
    }
}
