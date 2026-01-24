import java.util.*;
public class TwoPointerPalindrome {
    //hi guys this is the first video of java programming in the strings using my laptop screen recorder further we wil start by recording with my voice
    //ignore the snoring sound in the background my friend is sleeping just focus oon the code
    //now the goal is to find whether the string or word is palindrome or not first we will do using StringBuilder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen;
        System.out.println("Enter the string or the word user:");
        sen = sc.nextLine();
        sen.replace(" ", "");
        //now we will see the two pointer approach we need to take the two pointers first we take left and right pointer and then we can check the first and last characters and if there is no match then we can simply print the given string is not a palindrome or else we continue
        int le = 0;
        int ri = sen.length() - 1;
        while (le < ri) {
            if (sen.charAt(le) != sen.charAt(ri)) {
                System.out.println("the given string is not a palindrome ");
                return;
            }
            le++;
            ri--;
        }
        System.out.println("the given string is palindrome");
    }
}
//thats it we can prove using two pointers approach if you liked this video subscribe and keep supporting guys thank you
// and good night -------------------:);