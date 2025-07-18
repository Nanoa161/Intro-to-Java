import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        String results;
        System.out.print("Enter the number of subjects; ");
        int noOfSubjects = sc.nextInt();
        System.out.println("Enter marks for each subject (0 to 100);");
        int [] marks = new int[noOfSubjects];

        for(int i=0;i<noOfSubjects;i++){
            System.out.println("Subject " + (i+1) + ": ");
         marks[i] = sc.nextInt();
        }

        for(int i = 0; i <noOfSubjects; i++) {
            sum += marks[i];}

            int percentage = sum / noOfSubjects;
            System.out.println("Your percentage: " + percentage + "%");
        
        if(percentage>=90){
                results = "You Scored an A, ";
        }else if(percentage>=80){
            results = "You Scored a B";
        }else if (percentage>=70){
            results = "You Scored a C";
        }else if(percentage>=60){
            results = "You Scored a D"; 
        }else{
            results = "You Scored an F";
        }

        System.out.println(results);
    }
}