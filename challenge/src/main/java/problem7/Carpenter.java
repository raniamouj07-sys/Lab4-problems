package problem7;

public class Carpenter extends Person{
    Carpenter(String name){
        super(name);
    }
    @Override
    public String toString(){
        return super.toString()+" The Carpenter";
    }
}
