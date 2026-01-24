import java.util.*;
public class StringReverse {
    public static void main(String[] args){
        String sen;
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter tthe string for the reversal to the sentence");
        sen=sc.nextLine();
        for(int i=sen.length()-1;i>=0;i--){
            System.out.print(sen.charAt(i));
        }
        System.out.println();
        //using StringBuilder and methods inbuilt methods
        String newstring=new StringBuilder(sen).reverse().toString();
        System.out.println(newstring+" using String builder");
    }
}
