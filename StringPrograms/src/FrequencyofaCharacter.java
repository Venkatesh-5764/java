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

    }

    }

