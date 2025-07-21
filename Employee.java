public class Employee{
    String name;
    int Age;
    String department;

    public Employee(String empName, int empAge, String empDept){
        name = empName;
        Age = empAge;
        department = empDept;
    }
    void info(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+Age);
        System.out.println("department: "+department);
    }

    public static void main(String[] args){
        Employee emp1 = new Employee("Eric", 34, "HR");
         Employee emp2 = new Employee("Joshua", 34, "IT");

         emp1.info();
         emp2.info();
    }
}
