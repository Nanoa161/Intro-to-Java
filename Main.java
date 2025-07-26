class Person{
    int Age;
    String Name;

    Person(String Name,int Age){
        this.Name = Name;
        this.Age = Age;
    }
    void personalinfo(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
    }
}
class Student extends Person{
    String Grade;
    int StudentID;
    Student(String Name,int Age,String Grade,int StudentID){
        super(Name,Age);
        this.Grade=Grade;
        this.StudentID=StudentID;
    }
    void studentinfo(){
        super.personalinfo();
        System.out.println("Grade: "+Grade);
        System.out.println("Student ID:"+StudentID);
   }
}
public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Anna",15,"Grade 10",2314);
        student1.studentinfo();
    }
}