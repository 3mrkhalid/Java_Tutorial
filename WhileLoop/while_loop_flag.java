import java.util.Scanner;
//! Random Game
class while_loop_flag {
    public static void main(String[]args){
    Scanner pop = new Scanner(System.in);

    int guess , rand ;
    rand = (int)(Math.random() * 100); 
    boolean still_playing = true;

    // System.out.println("Number is"+rand); To show number
    while(still_playing)
    {
        System.out.println("Enter number between 0 and 100");
        guess = pop.nextInt();

        if(guess > rand)
        System.out.println("Guess too large");
     
        else if(guess < rand)
        System.out.println("Guess too small");
     
        else
        {
        System.out.println("You Win");
        still_playing = false;
    }
    }

    }
}
