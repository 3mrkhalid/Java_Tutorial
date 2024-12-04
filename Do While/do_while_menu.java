import java.util.Scanner;
public class do_while_menu {
    public static void main(String[]args){
        Scanner pop = new Scanner(System.in);

        int num1 , num2 , option;

        do{
            System.out.println("                   ");
            System.out.println("Smart Calculator (:");
            System.out.println("(1) Sum 2 Number");
            System.out.println("(2) Subtract 2 Number");
            System.out.println("(3) divid 2 Number");
            System.out.println("(4) sqare Number");
            System.out.println("(0) To exit");
            option = pop.nextInt();
            
            switch(option)
            {
               case 1 :
               System.out.println("Enter Number :");
               num1 = pop.nextInt(); num2 = pop.nextInt();
               System.out.println("Sum Number is : "+num1+num2);
               break;
               
               case 2 :
               System.out.println("Enter Number :");
               num1 = pop.nextInt(); num2 = pop.nextInt();
               System.out.println("Subtract Number is :" + (num1-num2));
               break;

               case 3 :
               System.out.println("Enter Number :");
               num1 = pop.nextInt(); num2 = pop.nextInt();
               System.out.println("divid Number is : "+num1/num2);
               break;

               case 4 :
               System.out.println("Enter Number :");
               num1 = pop.nextInt();
               System.out.println("Sqare Number is : "+Math.pow(num1,2));
               break;

               case 0 :
               System.out.println("Good Bye (:");
               break;
            }
        }while(option !=0);
    }
 }

