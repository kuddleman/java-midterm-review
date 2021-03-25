import java.util.Comparator;

public abstract class Student implements Comparable<Student> {
    private String name;
    private Major major;
    private int id;
    //private Graduator graduator;
    private boolean graduated;

    public static final boolean DEFAULT_GRADUATED = false;
    //public static final MajorNameComparator MAJOR_NAME_COMPARATOR = new MajorNameComparator();
    private static int totalStudents = 0;

    // Graduator graduator,
    public Student( String name, int id, Major major,  boolean graduated) {
        this.name = name;
        this.major = major;
        this.id = id;
        //this.graduator = graduator;
        this.graduated = graduated;

        Student.totalStudents ++;
    }
    //, Graduator graduator
    public Student(String name, int id, Major major) {
        //graduator,
        this(name, id, major,  DEFAULT_GRADUATED);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        }
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public static int getTotalStudents() {
        return Student.totalStudents;
    }

    @Override
    public String toString() {
        return name + "---" + id + "---" + major +
                (graduated ? "--Graduated" : "--Not yet graduated");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student other = (Student) obj;
            return this.name.equals(other.name) &&
                    this.major.equals(other.major) &&
                    this.id == other.id &&
                    this.graduated == other.graduated;
        } else {
            return false;
        }
    }



    @Override
    // lexicological ordering (e.g. alphabetical ordering)
    public int compareTo(Student other) {
        if(this.name.equals(other.name)) {
            return Integer.compare(this.id, other.id);
        } else {
            return this.name.compareTo(other.name);
        }
    }

    public void register() {
        System.out.println(name + " is registering.");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

//    public void graduationRequirements() {
//        graduator.graduationRequirements();
//    }

    public abstract void tuition();

    // the Comparator provides MULTIPLE SORTING SEQUENCES.
    //  It lets us compare on the basis of multiple elements such as id, name, etc.
    // for the main differences between Comparable and Comparator, see
       // https://www.javatpoint.com/difference-between-comparable-and-comparator

    public static class MajorNameComparator implements Comparator<Student> {

        public int compare(Student s1, Student s2) {
            int majorCompare = s1.getMajor().compareTo(s2.getMajor());
            if(majorCompare == 0) {
                return s1.getName().compareTo(s2.getName());
            } else {
                return majorCompare;
            }
        }
    }
}
