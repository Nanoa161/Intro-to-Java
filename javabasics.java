public class javabasics{
    public static void main(String[] args){
        //Data Types
        int age=17;
        double score=88.93;
        char grade='A';
        String Name="Penguin";

        //operators
        int newage=age + 1;//addition
        double halfscore= score/2; //division
        great(Name);
        
    }
    public static void great(String studentName){System.out.println("Hello, " + studentName);}
}
