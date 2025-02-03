import java.util.Scanner;
class ForLoop1{
    public static void main(String[] args){
        Scanner rip = new Scanner(System.in);
        int  sum = 0 , grade;
        for(int counter = 1 ; counter <=6 ; counter++ )
        {
            System.out.println("Enter grade for student"+"("+counter+")");
            grade = rip.nextInt();
            sum += grade ;
        }
        System.out.println("Average Grade is : "+ (sum /6));
    }
}