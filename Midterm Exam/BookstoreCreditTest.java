
public class BookstoreCreditTest
{
    public static void main(String[] args)
    {
        BookstoreCredit student1 = new BookstoreCredit();
        student1.setStudentName("John Enrico");
        student1.setGradePointAverage(3.2);
        
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("GPA: " + student1.getGradePointAverage());
        System.out.println("Credit: ₱" + student1.getCredit());
        
        BookstoreCredit student2 = new BookstoreCredit("Enrico Lauron", 3.8);
        
        System.out.println("Student: " + student2.getStudentName());
        System.out.println("GPA: " + student2.getGradePointAverage());
        System.out.println("Credit: ₱" + student2.getCredit());
        
        System.out.println(student1.getCreditInfo("Lauron John", 4.0));
    }
}
