import java.util.Scanner;
class while_loop1 {
   public static void main(String[]args){
    Scanner pop = new Scanner(System.in);

    int grade = 0 , sum = 0 , counter = 1;

    System.out.println("Calculate Average of A Grade");

    while(counter <=6)
    {
    System.out.println("Enter Degree For Student" +"("+counter+")");
    grade = pop.nextInt();
    sum += grade;
    counter++ ; 
   } 
   System.out.println("Average Grade "+ (sum/6));
 }
}
