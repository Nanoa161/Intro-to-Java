class person{
    protected String Name;
    protected int Age;

    public person(String name,int Age){
        this.Name=name;
        this.Age=Age;
    }

    public void displayInfo(){
        System.out.println("Person: " + ", Age: "+ Age);

    }
}
    
class Student extends person{
    private int Id;
    private float Stipend;

    public Student(String Name, int Age, int Id){
        super(Name,Age);
        this.Id=Id;
        this.Stipend=0.0f;
    }
    //overloading the constructor method
    public Student(String Name, int Age,  int Id, float Stipend){
        super(Name, Age);
        this.Id=Id;
        this.Stipend=Stipend;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Studrnt ID: " + ", Stipend: $" + Stipend);
    }

    void updateStipend(float newStipend){
        this.Stipend=newStipend;
    }
     
}

public class main{
    public static void main(String[] args) {
      Student s1 = new Student("Nana", 17, 101);
      Student s2 = new Student("Cody", 18, 102,5000.0f);

      s1.displayInfo();
      s2.displayInfo();
      
    }
}