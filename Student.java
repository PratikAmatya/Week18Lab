public class Student{
    private String studentName;
    private String studentGroup;
    private String studentPhoneNumber;

    public Student(String studentName, String studentGroup, String studentPhoneNumber){
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentName (String studentName){
        this.studentName = studentName;
    }

    public String getStudentGroup(){
        return this.studentGroup;
    }

    public void setStudentGroup (String studentGroup){
        this.studentGroup = studentGroup;
    }

    public String getStudentPhoneNumber(){
        return this.studentPhoneNumber;
    }

    public void setStudentPhoneNumber (String studentPhoneNumber){
        this.studentPhoneNumber = studentPhoneNumber;
    }
}
