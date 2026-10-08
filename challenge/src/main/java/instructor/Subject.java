package instructor;

public class Subject extends Instructor{
    private int id;
    private String code;
    private String title;
    Subject(int id, String code,String title,String employeeNumber,String firstName, String secondName, String telephone, String email){
        super( employeeNumber,firstName,  secondName,  telephone,  email);
        this.id=id;
        this.code=code;
        this.title=title;
    }
    public String normalizedCode(){
        return code.replace(" ","").toLowerCase();
    }
    public String properTitle(){
        String[] substrings = title.split(" ");
        StringBuilder build = new StringBuilder();
        for(String s: substrings){
            build.append(s.substring(0,1).toUpperCase());
            build.append(s.substring(1));
            build.append(" ");
        }
        return build.substring(0,build.length()-1);// returns without the last appended space
    }
    public boolean isIntroCourse(){
        if(title.toLowerCase().contains("intro")){
            return true;
        }
        if(code.toLowerCase().contains("intro")){
            return true;
        }
        return false;
    }
    public String toCard(){
            StringBuilder builder = new StringBuilder();
            builder.append("Instructor\n----------\n");
            builder.append("Employee #: ");
            builder.append(this.getEmployeeNumber());
            builder.append("\nName : ");
            builder.append(secondName);
            builder.append(", ");
            builder.append(firstName);
            builder.append("\nEmail : ");
            builder.append(email);
            builder.append("\nPhone: ");
            builder.append(phone);
            return builder.toString();
    }
    public String syllabusLine(){
        StringBuilder builder = new StringBuilder();
        builder.append(code);
        builder.append("-");
        builder.append(title);
        builder.append("(Instructor: ");
        builder.append(secondName);
        builder.append(" ");
        builder.append(firstName);
        builder.append(")");
        return builder.toString();
    }
}
