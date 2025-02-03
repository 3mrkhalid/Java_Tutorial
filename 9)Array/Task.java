import java.util.Scanner;

class Task{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int Size  , sum = 0; 

    System.out.println("Enter Size of Array");
    Size = input.nextInt();
    int arr [] = new int[Size];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter Salary For Empoly " + (i+1));
            arr [i] = input.nextInt();
        }
        for(int j = 0 ; j < arr.length ; j++){
          
            if(arr[j] > 0){
                sum += arr[j];
            }
        }

        System.out.println("Sum number is " + sum);
        System.out.println("Average number is "+ sum/arr.length);
  }
}