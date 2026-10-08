package student;

public class Test {
    public static void main(String[] args) {
    // creation of a couple of majors
        Major MajorCs = new Major("23","Computer Science");
        Major Art = new Major("10","Art");
        Major Litterature = new Major("18","Litterature");
        Student student1= new Student("Rania","Moujahed","0623326599","rania.moujahed@um6p.ma","c123456",MajorCs);
        Student student2 = new Student("Mohamed","Taha","0732456378","mohamed.taha@gmail.com","D234567",Art);
        Student student3 = new Student("Benali", "Salma", "0698765432", "salma.benali@gmail.com", "D234569",Litterature);
        Student student4 = new Student("Chraibi", "Aymane", "0755443322", "aymane.chraibi@gmail.com", "D234570",MajorCs);
        // Display computer science students
        MajorCs.displayStudents();
        // display student1 with getFullNameFormatted()
        System.out.println(student1.getFullNameFormatted());
        // try to find student2 with its cne
        System.out.println(Art.findStudentByCNE("D234567").getFullNameFormatted());
        // testing remove student
        MajorCs.removeStudent("D234570");
        //now i will print the remaining students
        MajorCs.displayStudents();
        MajorCs.getOccupancyRate();

    }
}

