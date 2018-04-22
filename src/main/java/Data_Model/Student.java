package Data_Model;

public class Student {

    private int Student_id ;
    private String Student_name;
    private String Hall;
    private  String Fathers_name;
    private  String Mothers_name;

    public Student() {
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getHall() {
        return Hall;
    }

    public void setHall(String hall) {
        Hall = hall;
    }

    public String getFathers_name() {
        return Fathers_name;
    }

    public void setFathers_name(String fathers_name) {
        Fathers_name = fathers_name;
    }

    public String getMothers_name() {
        return Mothers_name;
    }

    public void setMothers_name(String mothers_name) {
        Mothers_name = mothers_name;
    }
}
