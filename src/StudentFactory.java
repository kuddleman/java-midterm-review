public class StudentFactory {

    // Basic explanation of Factory method design pattern:
      // https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/

    public static enum StudentType { BACHELOR_ARTS, BACHELOR_SCIENCE, MASTERS, PHD};
    public static enum BachelorStudentType { ARTS, SCIENCE };
    public static enum GraduateStudentType { MASTERS, PHD}

    // Graduator graduator
    public static Student newStudent(StudentType type, String name,
                                     int id, Major major, boolean graduated,
                                     Object ... otherParameters) {
        Student student = null;
        String message = "";
        if(type == StudentType.BACHELOR_ARTS || type == StudentType.BACHELOR_SCIENCE) {
            if(otherParameters[0] instanceof Double) {
                double gpa = (Double)(otherParameters[0]);

                if(type == StudentType.BACHELOR_ARTS) {
                    student = new BachelorArtsStudent(name, id, major, graduated, gpa);
                } else if( type == StudentType.BACHELOR_SCIENCE) {
                    // graduator
                    student = new BachelorScienceStudent(name, id, major, graduated, gpa);
                }
            } else {
                message = "Bachelor Student object requires a double gpa. Cannot process " + otherParameters[0];
            }
        } else if (type == StudentType.MASTERS || type == StudentType.PHD) {
            if(otherParameters[0] instanceof String) {
                String thesis = (String)(otherParameters[0]);
                if(type == StudentType.MASTERS) {
                    student = new GraduateStudentMasters(name, id, major, graduated, thesis);
                } else if(type == StudentType.PHD) {
                    student = new GraduateStudentPhD(name, id, major, graduated, thesis);
                }
            } else {
                message = "A Graduate Student requires a String thesis.  Cannot process " + otherParameters[0];
            }
        }
        if(student == null) {
            throw new IllegalArgumentException("Cannot create Student. " + message);
        } else {
            return student;
        }


    }








}
