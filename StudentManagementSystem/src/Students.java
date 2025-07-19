public class Students {
    


    String name;
    int age;
    String studentID;
   double []grades;

    public Students(String name, int age, String studentID,double []grades) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;   
        this.grades = grades;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getStudentID() {
        return studentID;
    }


    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public double[] getGrades() {
        return grades;
    }


    public void setGrades(double[] grades) {
        this.grades = grades;
    }


    
    

    public double calculateAverageGrade (){

        double sum = 0;
        for(double grade : grades){

            sum +=grade;
        }
       
       return sum/grades.length;


    }
    public void printdetails (){

        double avg = calculateAverageGrade();

        System.out.printf("\nName: %s\n ",name );
        System.out.printf("Age: %d\n ",age );
        System.out.printf("StudentId: %s\n ",studentID);
        System.out.printf("Average: %.1f\n ", avg);

    }
    
}
