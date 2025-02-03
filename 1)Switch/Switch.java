import java.util.Scanner;

class  Switch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int option;

        System.out.println("Enter your choice (1 to 3)");
        System.out.println("(1)Area of circle \n" + "(2)Area of square\n" + "(3)Area of rectengle");
        option = input.nextInt();

        switch (option) {
            case 1:
               System.out.println("Enter your radius:");
                Calc_C(input);
                break;
            case 2 :
               System.out.println("Enter your length and width");
               Calc_Ar(input);
               break;
            case 3 :
            System.out.println("Enter your length");
            Calc_Sq(input);   
            default:
            System.out.println("Invalid Value");
                break;
        }
       
    }
    public static void Calc_Ar(Scanner input) {
        double Area  , length = input.nextDouble() , width = input.nextDouble(); 
        Area = length * width ;
        System.out.println("Area of rectengle = " + Area);
    }

    public static void Calc_C(Scanner input){
     double Area , radius = input.nextDouble() , PI = 3.14;
     Area = radius * radius * PI ; 
     if( radius ==0){
        System.out.println("Math Error : undefinded number");
     }
     else
     System.out.println("Area of circle = " + Area);
    
    }

     public static void Calc_Sq(Scanner reader){
        double Area , length = reader.nextDouble();
        Area = length *length ; 
        System.out.println("Area of sqare = "+Area);
     }
    
}