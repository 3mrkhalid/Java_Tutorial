import java.util.Scanner;
class break1{
    public static void main(String[]args){
        Scanner DOP = new Scanner(System.in);
        int sum = 0 , num , counter = 0 ;

        
        for(; counter++ <= 6 ; )
        {
            System.out.println("Enter Positive Integer "+counter+":");
            num = DOP.nextInt();

                if(num<0)
                {
                    System.out.println("Only Positive Number");
                    break;
                }
                else{
                    sum +=num;
                }
        }System.out.println("Sum Number is :"+sum);
    }
}