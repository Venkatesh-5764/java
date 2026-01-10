import java.util.Scanner;

public class spyNumber {
    public static void main(String[] args){
        int val;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number for checking purpose ");
        val=sc.nextInt();
        int summ=0, prod=1;
        while(val!=0){
           int rem =  val%10;
           summ = summ+rem;
           prod = prod *rem;
           val=val/10;
        }
        if(summ==prod){
            System.out.println("Given number is spy number");
        }
        else{
            System.out.println("the given number is not a spy number");
        }

    }
}
