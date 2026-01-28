import java.util.*;
public class Anagrams {
    public static void main(String[] args){
        String word1,word2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words to check whether the words are anagrams or not: ");
        System.out.println("enter word1 : ");
        word1=sc.nextLine();
        System.out.println("enter word2 : ");
        word2=sc.nextLine();
        HashMap<Character,Integer>wordhash=new HashMap<>();
        HashMap<Character,Integer>wordhash2=new HashMap<>();
        if(word1.length()!=word2.length()){
            System.out.println("The words are not anagrams");
            return;
        }
        for(char ch:word1.toCharArray()){
            wordhash.put(ch,wordhash.getOrDefault(ch,0)+1);
        }
        for(char ch1: word2.toCharArray()){
            wordhash2.put(ch1,wordhash2.getOrDefault(ch1,0)+1);
        }

        for(char ch:word1.toCharArray()){
            if((wordhash.containsKey(ch) && wordhash2.containsKey(ch))&& wordhash.get(ch)==wordhash2.get(ch)){
                continue;
            }
            else{
                System.out.println("the given two words are not anagrams");
                return;
            }
        }

            System.out.println("The given two words are anagrams");




    }
}
