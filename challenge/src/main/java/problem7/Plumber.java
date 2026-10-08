package problem7;

public class Plumber extends Person{
    Plumber(String name){
        super(name);
    }
    @Override
    public String toString(){
        return super.toString()+" The plumber";
    }
}
