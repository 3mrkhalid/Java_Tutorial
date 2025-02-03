import java.util.Scanner;

public class Factorial_Method {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      
        Menu(input);
    }

    public static void Factorial(Scanner input){
       int number , factorial , Calc = 1 , num ;
       
       System.out.println("How many of factorial do you want:");
       num = input.nextInt();

       for(int i = 1 ; i <=num ; i++) {
         
            System.out.println("Enter number to get a factorial:");
            number = input.nextInt();

                for(int j = 1 ; j <=number ; j ++ ){

                        Calc *=j ;
                }

                System.out.println("Factorial Number["+i+"]is: "+ Calc);
                System.out.println("---------------------------------");

                Calc = 1 ;
       }
  }
    
  public static void Verify(Scanner input){
    int num1 , num2 , total ; 
    char ch;

    System.out.println("Enter your operation");

    num1 = input.nextInt();
    num2 = input.nextInt();
    ch = input.next().charAt(0);
    total = input.nextInt();

        if(ch == '+'){
            if((num1 + num2) == total )
                System.out.println("correct");
                else
                System.out.println("Not Correct");
            
        }
        if(ch == '-'){
            if((num1 - num2) == total )
                System.out.println("correct");
                else
                System.out.println("Not Correct");
            
        }
        if(ch == '/'){
            if((num1 / num2) == total )
                System.out.println("correct");
                else
                System.out.println("Not Correct");
            
        }
        if(ch == '*'){
            if((num1 * num2) == total )
                System.out.println("correct");
                else
                System.out.println("Not Correct");
            
        }
  }

  public static void Game(Scanner input ){
    double game = Math.random()*100;
    int Number ;
    boolean Flag = true;

    System.out.println("Random Game(:");
    System.out.println("---------------------");
    System.out.println("Enter Number");
    Number = input.nextInt();
   while(Flag){
    if(Number < game){
        System.out.println("Number is a smaller");
        System.out.println("Try again");
        Number = input.nextInt();
    }
    else if(Number > game){
        System.out.println("Number is a bigger");
        System.out.println("Try again");
        Number = input.nextInt();
    }
    else {
        System.out.println("You Won (:");
    break;
        }
  }
}

  public static void Menu(Scanner input){
    int option;
    boolean Flag = true;
        do{
            System.out.println("1)To Calc Factorial");
            System.out.println("2)To Verify any operation");
            System.out.println("3)Game");
            System.out.println("4)To Exit");
            option = input.nextInt();
        switch (option) {
            case 1:
                Factorial(input);
                break;
            case 2 :
                Verify(input);
            case 3 :
                Game(input);  
                System.out.println("--------------------------");
                break;
            case 4 :
             System.out.println("Good Bye (:"); 
             break;    
            default:
            System.out.println("Invalid option"); 
                break;
        }    
        }while(Flag);
  }
}


