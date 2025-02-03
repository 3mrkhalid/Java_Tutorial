import java.util.Scanner;

class Task{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[][] arr = new int[5][3];
        int sum = 0;

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; i<arr[j].length ; i++){
               arr [i][j] = input.nextInt();
               sum +=arr[i][j];
            }
        
        }
        System.out.println(sum);
    }
}