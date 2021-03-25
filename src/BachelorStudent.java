public abstract class BachelorStudent extends Student {

    private double gpa;

    //Graduator graduator,
    public BachelorStudent(String name, int id, Major major,  boolean graduated, double gpa){
        // Graduator graduator
        super(name, id, major, graduated);
        this.gpa = gpa;
    }

    //Graduator graduator,
    public BachelorStudent(String name, int id, Major major, double gpa) {
        // graduator
        super(name, id, major);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if(gpa>=0 && gpa<=4.0) {
            this.gpa = gpa;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "--GPA:" + gpa;
    }

    @Override
    public void tuition() {
        System.out.println(super.getName() + " pays full tuition.");
    }


}
