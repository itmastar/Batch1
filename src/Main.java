import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nested if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number");
        int num3 = sc.nextInt();
        if (num1 > num2) {//num1>num2
            if (num1 > num3) {
                System.out.println("The greatest number is :" + num1);
            } else {//num3>num1>num2
                System.out.println("The greatest number is :" + num3);
            }
        } else {//num2>num1
            if (num2 > num3) {//num2>num1 && num2 >num3
                System.out.println("The greatest number is :" + num2);
            } else {//num3>num2>num1
                System.out.println("The greatest number is :" + num3);
            }
        }
    }
}