
public class BookstoreCredit
{
    private String studentName;
    private double gradePointAverage;
    private double credit;

    public BookstoreCredit()
    {
        this.studentName = null;
        this.gradePointAverage = 0.0;
        this.credit = 0.0;
    }

    public BookstoreCredit(String studentName, double gradePointAverage)
    {
        this.studentName = studentName;
        this.gradePointAverage = gradePointAverage;
        this.credit = calculateCredit();
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public double getGradePointAverage()
    {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage)
    {
        this.gradePointAverage = gradePointAverage;
        this.credit = calculateCredit();
    }

    public double getCredit()
    {
        return credit;
    }

    public double calculateCredit()
    {
        return 75 * gradePointAverage;
    }

    public String getCreditInfo(String name, double gpa)
    {
        this.studentName = name;
        this.gradePointAverage = gpa;
        this.credit = calculateCredit();
        return String.format("Student: %s | GPA: %.2f | Credit: ₱%.2f", studentName, gradePointAverage, credit);
    }
}
