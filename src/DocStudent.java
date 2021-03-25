public class DocStudent extends Student {

    private String name, major, thesisTopic;
    private int id;
    private boolean hasGraduated;


    public DocStudent(String name, String major, int id, boolean hasGraduated, String thesisTopic) {
        super(name, major, id, hasGraduated);
        this.thesisTopic = thesisTopic;
    }

    public void numberOfClassesTaught(int num) {
        System.out.println(name + " is currently teaching " + num + " classes.");
    }

    @Override
    public void register() {

    }

    @Override
    public void tuition() {

    }
}
