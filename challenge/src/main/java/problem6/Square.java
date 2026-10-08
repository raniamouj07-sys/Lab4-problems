package problem6;

public class Square extends Forme {
    Square(double width){
        super(width);
    }
    @Override
    public double getSurface(){
        return this.getA()*this.getA();
    }
    @Override
    public String toString(){
        return "Type: Square "+super.toString();
    }
}
