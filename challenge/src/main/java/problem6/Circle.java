package problem6;

public class Circle extends Forme {
    Circle(double radius){
        super(radius);
    }
    @Override
    public double getSurface(){
        return Math.PI*this.getA()*this.getA();
    }
    @Override
    public String toString(){
        return "Type: Circle "+super.toString();
    }
}
