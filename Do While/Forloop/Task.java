import java.util.Scanner;

public class Task {
    public static void main(String[] args){
        Scanner pop  = new Scanner(System.in);
        int number , sum_even = 0 , sum_odd = 0 ,counter = 0 ;

        for(; counter++ <=9 ;)
        {
          System.out.println("Enter your Number"+"("+counter+")");
          number = pop.nextInt();
            if(number % 2 == 0)//! Number is even
            sum_even += number;//! even + even = even
            else
            sum_odd += number;//! even + odd = odd
        }
        System.out.println("The sum even number: " + sum_even);
        System.out.println("The sum odd number: " + sum_odd);
    }
}
