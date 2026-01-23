import java.util.*;
public class CountSentencewords {
    public static void main(String[] args ){
        String sen;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Sentence User: ");
        sen = sc.nextLine();
        for(int i=0;i<sen.length();i++){
            if((i==0 && sen.charAt(i)!=' ') ||(sen.charAt(i)!=' '&& sen.charAt(i-1)==' ')){
                count++;
            }
        }

        System.out.println("The number of words in the Given sentence is : "+count);
    }
}
