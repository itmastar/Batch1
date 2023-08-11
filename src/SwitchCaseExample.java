import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to enroll in our course. Please enter 'y' or 'n'");
        char choice=sc.next().charAt(0);
        switch(choice){
            case 'y':
                System.out.println("Thanks for enrolling !!");
                break;
            case 'n':
                System.out.println("Its ok.Reach out to us when you are interested ");
                break;
            default:
                System.out.println("You have entered wrong choice.Please try again !! ");

        }

    }
}
