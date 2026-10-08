package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
    this.id=nextId++;
    this.code=code;
    this.students= new Student[50];
    this.name=name;
    studentCount=0;
    }
    public Major(){
        this("29","Computer Science");
    }
    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount<49){
            students[studentCount]=s;
            studentCount++;
        }
        else{
            System.out.println("The major cannot exceed more than 50 student");
        }
    }

    // Getters
    public String getCode(){return this.code;}
    public String getName(){return this.name;}
    public int getId(){return this.id;}
    public int getStudentCount(){return this.studentCount;}
    @Override
    public String toString(){
        return "Major : "+name+"code : "+code;
    }

    // Display all students in the major
    public void displayStudents() {
        for(int i=0;i<studentCount;i++){
            System.out.println(students[i].toString());
        }
    }
    public Student findStudentByCNE(String cne){
        for(int i =0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }
    public boolean removeStudent(String cne){
        Student studentFound= findStudentByCNE(cne);
        boolean flag= false;
        for(int i = 0;i<studentCount;i++){
            if(students[i]==studentFound){
                flag = true;
            }
            if(flag&&i<(studentCount-1)){
                students[i]=students[i+1];
            }
        }
        studentCount--;
        students[studentCount]=null;
        return flag;
    }
    public void getOccupancyRate(){
         double rate =  100*(studentCount/50.0);
         System.out.println(String.format("Occupancy rate=%.2f %%",rate));
    }
    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();
        sb.append("The students enrolled int this major are: \n");
        for(int i = 0;i<studentCount;i++){
            sb.append(students[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
