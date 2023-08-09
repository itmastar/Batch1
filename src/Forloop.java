import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        //print first n natural numbers 1, 2 3 , 4...
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value for 'n' :");
        int n=scan.nextInt();
        if(n<=0){
            System.out.println("Please enter a positive number ");
             n=scan.nextInt();
            for(int i=1;i<=n;i++){
           System.out.println(i);
        }

        }else{
                for(int i=1;i<=n;i++){
           System.out.println(i);
        }

        }
//1st approach
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }
//2nd approach
//        for(int i=0;i<=n-1;i++){
//            System.out.println(i+1);
//        }




    }

}
