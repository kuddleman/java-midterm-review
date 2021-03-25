import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new BachelorArtsStudent("BachArtStudentA", 123, Major.ART, 3.9));
        studentList.add(new BachelorArtsStudent("BachArtStudentB", 345, Major.ENGLISH, 2.7));
        studentList.add(new BachelorScienceStudent("BachSciStudentC", 433, Major.COMPUTER_SCIENCE, 3.9));
        studentList.add(new BachelorScienceStudent("BachSciStudentD", 678, Major.MATHEMATICS, 3.4));
        studentList.add(new GraduateStudentMasters("MastersStudentA", 789, Major.PHILOSOPHY, "What is?"));
        studentList.add(new GraduateStudentMasters("MastersStudentB", 567, Major.PHILOSOPHY, true, "What was?"));
        studentList.add(new GraduateStudentPhD("PhDStudentA", 234, Major.COMPUTER_SCIENCE, "The Influence of Java"));
        studentList.add(new GraduateStudentPhD("PhDStudentB", 890, Major.ENGLISH, "The Effects of Grammar"));

        System.out.println("Size of the student lists is: " + studentList.size() + " students.");
        System.out.println("");

        System.out.println("Here are the students' tuition details: ");
        for(Student student : studentList) {
            student.tuition();
        }

        for(Student student : studentList) {
            if(student instanceof BachelorArtsStudent) {
                ((BachelorArtsStudent)student).exhibit();
            }
            if(student instanceof GraduateStudent) {
                ((GraduateStudent) student).work();
            }
        }

        System.out.println("before sort");
        Collections.shuffle(studentList);
        for(Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("");

        System.out.println("after sort:");
        Collections.sort(studentList);
        for(Student student : studentList) {
            System.out.println(student);
        }



    }
}
