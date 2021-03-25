public class MastersStudent extends Student {
    private String name, major, thesisTopic;
    private int id;
    private boolean hasGraduated;


    public MastersStudent(String name, String major, int id, boolean hasGraduated, String thesisTopic) {
        super(name, major, id, hasGraduated);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void register() {

    }

    @Override
    public void tuition() {

    }
}
