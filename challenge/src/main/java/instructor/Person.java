package instructor;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        // add others
        this.phone= telephone;
        this.email=email;
        this.secondName=secondName;
    }
    public Person(){
        this("","","","");
    }
    public int getId(){return this.id;}
    public String getFirstName(){return this.firstName;}
    public String getSecondName(){return this.secondName;}
    public String getPhone(){return this.phone;}
    public String getEmail(){return this.email;}
    public void setFirstName(String firstName1){this.firstName= firstName1;}
    public void setSecondName(String secondName1){this.secondName=secondName1;}
    public void setPhone(String phone1){this.phone=phone1;}
    @Override
    public String toString(){
        return "Id: "+id+" first Name: "+firstName+" second Name: "+secondName+" email:"+email+" Phone number: "+phone;
    }
}
