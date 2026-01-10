import java.util.Scanner;

public class GCDEUCLEDIAN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers for finding the GCD");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt() ;
        while(val2 !=0){
            int temp=val2;
            val2=val1%val2;
            val1=temp;
        }
        System.out.println("the Gcd of the two numbers is "+val1);

    }
}
