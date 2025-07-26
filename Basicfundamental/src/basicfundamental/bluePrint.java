
package basicfundamental;


public class bluePrint {
    
    
    
    String name;
    int age;
    String program;

    public bluePrint(String name, int age, String program) {
        this.name = name;
        this.age = age;
        this.program = program;
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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
  
    public void printInfo(){
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
    }
    
    
}
