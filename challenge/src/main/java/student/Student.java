package student;

public class Student extends Person {
    private String cne;
    private Major major;
    private Major MajorCs= new Major();

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
    this.cne=cne;
    MajorCs.addStudent(this);
    this.major= MajorCs;
    }

    // Getters
    public String getCne(){return this.cne;}
    public Major getMajor(){return this.major;}

    // Setters
    public void setCne(String newCne){this.cne=newCne;}
    public void setMajor(Major newMajor){this.major=newMajor;}
    @Override
    public String toString(){
        return super.toString()+"cne: "+cne+"Major: "+major.toString();
    }
    public String getFullNameFormatted(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getFirstName().toUpperCase());
        sb.append(",");
        sb.append(this.getSecondName());
        return sb.toString();
    }


}

