public class Course {

    private String name, professorName, location, textbook;
    private int maxStudents, numStudents, numberCredits;

    private Course(CourseBuilder builder) {
        this.name = builder.name;
        this.professorName = builder.professorName;
        this.location = builder.location;
        this.textbook = builder.textbook;
        this.maxStudents = builder.maxStudents;
        this.numStudents = builder.numberStudents;
        this.numberCredits = builder.numberCredits;
    }

    public String getName() {
        return name;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getLocation() {
        return location;
    }

    public String getTextbook() {
        return textbook;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public int getNumberCredits() {
        return numberCredits;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", professorName=" + professorName + ", location=" + location + ", textbook="
                + textbook + ", maxStudents=" + maxStudents + ", numberStudents=" + numStudents + ", numberCredits="
                + numberCredits + "]";
    }

    public static class CourseBuilder {

        private String name, professorName = "", location = "", textbook = "";
        private int maxStudents = 0, numberStudents = 0, numberCredits = 0;

        //Constructor
        public CourseBuilder(String name) {
            this.name = name;
        }

        public CourseBuilder professorName(String var) {
            this.professorName = var;
            return this;
        }

        public CourseBuilder location(String var) {
            this.location = var;
            return this;
        }

        public CourseBuilder textbook(String var) {
            this.textbook = var;
            return this;
        }

        public CourseBuilder maxStudent(int var) {
            this.maxStudents = var;
            return this;
        }

        public CourseBuilder numberStudents(int var) {
            this.numberStudents = var;
            return this;
        }

        public CourseBuilder numberCredits(int var) {
            this.numberCredits = var;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }







}
