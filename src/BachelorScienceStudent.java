public class BachelorScienceStudent extends BachelorStudent {
    // Graduator graduator,
    public BachelorScienceStudent(String name, int id, Major major,  boolean graduated, double gpa) {
        // graduator,
        super(name, id, major,  graduated, gpa);
    }

    // Graduator graduator,
    public BachelorScienceStudent(String name, int id, Major major,  double gpa) {
        //graduator,
        super(name, id, major,  gpa);
    }

    @Override
    public void study() {
        super.study();
        System.out.println("\tLocation: Lab");
    }

}
