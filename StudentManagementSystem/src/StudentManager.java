
import java.util.ArrayList;
public class StudentManager {
    
  

ArrayList <Students> students = new ArrayList<>();


    public void addstudent(String name,int age,String studentId,double [] grade){
        
       students.add(new Students(name, age, studentId, grade ));

    }



    public void showallstudents(){


        if (students.isEmpty()){

            System.out.println("No Student Info Data");


        }
        else {

            for(Students std : students){
         
                std.printdetails();

          }

        }
        

    }

    public void findstudentById(String id){

          if (students.isEmpty()){

            System.out.println("No students Data");
          }

          else{

            for(Students std : students){

                if(id.equalsIgnoreCase(std.getStudentID())){

                    System.out.println("Student found!");
                    std.printdetails();

                }             
          }
          
          }

    }



}
