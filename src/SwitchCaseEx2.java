import java.util.Scanner;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the colour of the traffic  signal " );
        String color=sc.next();
        //rED, grEEN
        switch(color){
            case "RED":
            case "Red":
                System.out.println("STOP !!");
                break;
            case "GREEN":
            case "Green":
                System.out.println("GO !!!");
                break;
            case "YELLOW":
            case "Yellow":
                System.out.println("GET READY !");
                break;
            default:
                System.out.println("Please look at the traffic signal color ");
        }
    }
}
