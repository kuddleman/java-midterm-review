public abstract class BachelorStudent extends Student {

    private double gpa;


    public BachelorStudent(String name, int id, Major major, Graduator graduator,  boolean graduated, double gpa){

        super(name, id, major,  graduator,  graduated);
        this.gpa = gpa;
    }


    public BachelorStudent(String name, int id, Major major, Graduator graduator, double gpa) {

        super(name, id, major, graduator);
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
