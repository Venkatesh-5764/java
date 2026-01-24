import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sen;
        System.out.println("enter the string dear user : ");
        sen=sc.nextLine();
        String newstring=new StringBuilder(sen).reverse().toString();
        if(newstring.equals(sen)){
            System.out.println("the given Sgtring is palindrome)");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
