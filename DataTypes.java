import java.util.*;

public class DataTypes{
    public static void Average(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println("The average is : " + (a+b+c)/3);
    }   

    public static void squareArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the side os a square: ");
        int a = sc.nextInt();
        double b = Math.pow(a,2);

        System.out.println("The area of square is : " + b);
        
    }

    public static void bill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of ball: ");
        int a = sc.nextInt();
        System.out.println("Price of bat :");
        int b = sc.nextInt();
        double c = a*0.18;
        double d = b*0.18;
        System.out.println("The bill is : " + (a+c+b+d));
    }

    public static void main(String[] args){
        bill();
        
        
    }
}