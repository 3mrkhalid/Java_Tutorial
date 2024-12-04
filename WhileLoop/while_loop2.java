import java.util.Scanner;

import org.w3c.dom.css.Counter;

class while_loop2{
    public static void main(String[]args){
        Scanner pop = new Scanner(System.in);
        int counter = 1 , degree = 0 , sum = 0;

        System.out.println("Calculate Average Of Grade & To Exit Enter(-1)");
        while(counter <= 6 && counter != -1)

        {
            System.out.println("Enter degree for first" +"("+counter+")");
            degree = pop.nextInt();
            sum += degree ;
            counter++;
        }
        System.out.println("Your Average Grade is : "+ (sum/6));
    }
}
