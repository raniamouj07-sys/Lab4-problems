package instructor;

public class Instructor extends Person{
    private String employeeNumber;
    Instructor(String employeeNumber,String firstName, String secondName, String telephone, String email){
        super( firstName,  secondName,  telephone,  email);
        this.employeeNumber=employeeNumber;
    }
    public String getEmployeeNumber(){
        return this.employeeNumber;
    }
    public String cleanEmployeeNumber(){
        return this.employeeNumber.replace(" ","");
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber,secondName,firstName);
    }
    public String displayName(){
        StringBuilder builder = new StringBuilder();
        if(firstName!=null){
            builder.append("First Name: ");
            builder.append(firstName);
        }
        if(secondName!=null){
            builder.append(" Second Name: ");
            builder.append(secondName);
        }
        return builder.toString();
    }
}
