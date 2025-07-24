public class StudentGrade{
    String name;
    int Age;
    char Grade;

    public Student(String stuName, int stuAge, char stuGrade){
        name = stuName;
        Age = stuAge;
        Grade = stuGrade;
    }
    void info(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+Age);
        System.out.println("Grade: "+Grade);
    }

    public static void main(String[] args){
        Student stu1 = new student("Ginny", 15, 'A');
        Student stu2 = new student("Austin", 16, 'B');

         stu1.info();
         stu2.info();
    }
}
