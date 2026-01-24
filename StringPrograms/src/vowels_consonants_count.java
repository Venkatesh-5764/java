import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class vowels_consonants_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sen;
        int vc=0,cc=0;
        List<Character> chh =Arrays.asList('a','e','i','o','u');

        System.out.println("enter the string for counting the consonants and vowels");
        sen=sc.nextLine();
        for (char ch:sen.replace(" ","").toCharArray()){
            if(chh.contains(ch)){

            vc++;
            }
            else {
                cc++;
            }
        }
        System.out.println("the count of vowels in the given string is "+vc);

        System.out.println("the count of consonants in the given string is "+cc);

    }
}
