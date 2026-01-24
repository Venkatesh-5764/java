import java.util.Scanner;

public class CountofSentencewords{
    public static void main(String[] args) {
        String sen;
        int count=0,cnt=0,c=0;
        //using for loop finding the count of words in the given string
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the String User");
        sen=sc.nextLine();
        for(int i=0;i<sen.length();i++){
            if((i==0 && sen.charAt(i)!=' ' ) || (sen.charAt(i)!=' ' && sen.charAt(i-1)==' ')){
                count++;
            }
        }
        for(char ch:sen.toCharArray()){
            c++;
        }
        cnt=sen.trim().split("\\s+").length;
        System.out.println("the count of words in the given Sentence is "+count+cnt);

    }
}