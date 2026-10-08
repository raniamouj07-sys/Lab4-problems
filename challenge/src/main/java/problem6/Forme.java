package problem6;

public abstract class Forme {
    private double a;
    Forme(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public  abstract double getSurface();
    @Override
    public String toString(){
        return "Form of a= "+a;
    }
}
