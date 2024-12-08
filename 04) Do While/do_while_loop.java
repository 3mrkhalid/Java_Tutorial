import java.util.Scanner;
public class do_while_loop {
    public static void main(String[]args){
        Scanner cop = new Scanner(System.in);
        
        int counter = 1 , grade, sum = 0;
        //! We used Do_While For Make menu
        do{
            System.out.println("Enter Grade For Student"+"("+counter+")");
            grade = cop.nextInt();
            sum += grade;
            counter++;
        }
        while(counter <= 6);
        System.out.println("Average Grade is : "+(sum/counter));
    }
}
