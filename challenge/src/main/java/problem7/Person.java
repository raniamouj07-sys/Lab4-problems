package problem7;

public class Person {
    private final String name;
    Person(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "I am "+name;
    }
    public  void display(){
        System.out.println(this.toString());
    }


}
