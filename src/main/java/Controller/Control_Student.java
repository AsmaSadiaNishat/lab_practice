package Controller;
import Data_Model.Student;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "Control_Student")
public class Control_Student {

  public Student student=new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

   public String IsNextPage(){
        return "success";
   }


}
