import java.util.Scanner;
class test1{
    public static void main(String[]args){
        Scanner pop = new Scanner(System.in);
        int degree;

        System.out.println("Enter your degree");
        degree = pop.nextInt();
        
        if (degree >=90 && degree <100)
        System.out.println("You got :+A");
        else if (degree >=80 && degree < 90)
        System.out.println("You got : B");
        else if (degree >=70 && degree < 80)
        System.out.println("You got :C");
        else if (degree >=50 && degree < 70)
        System.out.println("You got :D");
        else 
        System.out.println("You got :F");
    }
}