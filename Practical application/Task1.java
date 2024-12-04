import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int F, B, E, More, option, number;
        
        System.out.println("How Many of passanger :");
        number = input.nextInt();

        for(int i = 1 ; i<=number ; i++){
            System.out.println("*******************");
            System.out.println("For passanger Number "+ i);
            System.out.println("Chosse Option");
            System.out.println("(1) First Calss");
            System.out.println("(2) For Business");
            System.out.println("(3) For Economy");
            System.out.println("(0) To Exit");
            System.out.println("*******************");
            option = input.nextInt();
            
            if(option == 0)
            {
            System.out.println("Good Bye (:");
            break;
            }
            switch(option)
            {

                case 1:
                    System.out.println("Enter your Weight");
                    F = input.nextInt();
                    if (F >30){
                        More = (F - 30)*10;
                        System.out.println("You have to pay an amount of money: "+More+" SR");
                        break;
                    }
                    else
                    System.out.println("OK , you can pass");
                    break;
                case 2 :
                    System.out.println("Enter your Weight");
                    B = input.nextInt();
                    if (B >25){
                        More = (B - 25)*10;
                        System.out.println("You have to pay an amount of money: "+More+" SR");
                        break;
                    }
                    else
                    System.out.println("OK , you can pass");   
                    break;
                case 3 :
                    System.out.println("Enter your Weight");
                    E = input.nextInt();
                    if (E >20){
                        More = (E - 20)*10;
                        System.out.println("You have to pay an amount of money: "+More+" SR");
                        break;
                    }
                    else
                    System.out.println("OK , you can pass");    
                    break;

                default :
                {
                 System.out.println("Invalid Option ,Try again");
                 i--;
                }

            }
    
        }
    }
}
