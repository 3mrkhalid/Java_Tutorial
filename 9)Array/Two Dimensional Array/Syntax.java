import java.util.Scanner;

public class Syntax {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int [][]arr =new int[3][4];

       System.out.println(arr.length);
       System.out.println(arr[0].length);

       int[][] mark = {{1,2,3},{4,3,5},{6,7,6}};
       System.out.println(mark.length);
       System.out.println(mark[0].length);
      
      for(int i=0 ; i<mark[2].length;i++){
        mark[2][i]=10;
      }
      for(int i=0 ; i<mark[2].length;i++){
        System.out.println(mark[2][i]);
      }
    }
}
