import java.util.*;
public class FrequencyofaCharacter {
    public static void main(String[]args) {
        // Good morning friends today we are going to discuss about the frequency of characters in the given string with two approaches
        //lets begin with approach 1
        Scanner sc= new Scanner(System.in);
        HashMap<Character,Integer>charfreq=new HashMap<>();
        HashMap<Character,Integer>charrfreq=new HashMap<>();
        String sen;
        System.out.println("Enter the string here user: ");
        sen=sc.nextLine();
        sen.replace(" ","_");
        for(int i=0;i<sen.length()-1;i++){
            char c = sen.charAt(i);
            if(charfreq.containsKey(c)){
                charfreq.put(c,charfreq.get(c)+1);
            }
            else{
                charfreq.put(c,1);
            }
        }
        //approach 2 usig for each loop
        for(char chh:sen.replace(" ","").toCharArray()){
            charrfreq.put(chh,charrfreq.getOrDefault(chh,0)+1);
        }
        System.out.println(charrfreq);
       // today we will try to find the first non repeating character and also the first repeating character in the given string
        //now we will see the first non repeating character and here i am using the previous code variables like
        // the string variable name is sen and the hashmap variable is charfreq; lets do it

        for(char ch:sen.toCharArray()){
            if(charfreq.get(ch)==1){// just mmodify this we get the non repeating character;
                System.out.println("the first non repeating character of the given string is : "+ch);
                return;
            }
        }

        // so we can see here the first non repeating character is d and first repeating character is i so in this way we can find out the outuput and thank for today
        // see you in another string code and if you find any mistake in this code or if you can optimize this code you can mention in the comments thank you ..........................................:)
    }


    }

