import java.util.*;
class sumofdigits{
    public int operation(int val){
        int sum = 0;
        while(val!=0){
            int rem = (val%10);
            int sq = rem * rem;
            sum = sum+sq;
            val= val / 10;
        }
        return sum;
    }
    public int operation1(int val){
        int sum = 0;
        while(val!=0){
            int rem = (val%10);

            sum = sum+rem;
            val= val / 10;
        }
        return sum;
    }

}
public class happynumber {
    public static void main(String[] args){
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers for validation");
        val=sc.nextInt();
        int val1 = sc.nextInt();

        sumofdigits s = new sumofdigits();
        while(val>9){
            val = s.operation(val);
        }
        if(val==1){
            System.out.println("the given number is happy number");
        }
        else{
            System.out.println("this is not a happy number");
        }
        while(val1>9){
            val1 = s.operation1(val1);
        }
        if(val1==1){
            System.out.println("the given number is magic number");
        }
        else{
            System.out.println("this is not a magic number");
        }

    }
}
