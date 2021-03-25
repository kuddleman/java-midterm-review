public class BachelorArtsStudent extends BachelorStudent {


    public BachelorArtsStudent(String name, int id, Major major, boolean graduated, double gpa) {
        // new CourseRequirementGraduator(),
        super(name, id, major,  graduated, gpa);
    }
    public BachelorArtsStudent(String name, int id, Major major, double gpa) {
        //  new CourseRequirementGraduator(),
        super(name, id, major, gpa);
    }

    @Override
    public void study() {
        super.study();
        System.out.println("\tLocation: Art Studio");
    }

    public void exhibit() {
        System.out.println(super.getName() + " is having an exibit.");
    }
}
