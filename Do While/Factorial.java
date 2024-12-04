import java.util.Scanner;

class Factorial{
    public static void main(String[]args){
        Scanner Mody = new Scanner(System.in);
        int factorial = 1, counter , sum = 0 , number , j = 1  , num;
        
        System.out.println("How Many Factorial You Wany :");
        num = Mody.nextInt();

        for(;j <= num ; j++ ){
        System.out.println("Enter your number to get factorial");
        number = Mody.nextInt();
        
        if(number<0)
        System.out.println("Only negative number");

        else{

        for(int i = 1 ;i <= number ; i++)
        {
            factorial *= i; //! i increasment to equal number ---> i is a factorial 
            
        }
        
        System.out.println("Factorial is : " + factorial);
        factorial = 1;
    }
  }
 }
}