import  java.util.*;
public class countcharacters {
    public static void main(String[] args){
        String sen;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String user");
        sen = sc.nextLine();
        for(char ch:sen.toCharArray()){
            if(ch!=' '){
                count++;
            }
        }
        System.out.println("THe number of characters in the given string without spaces is "+count);
    }


}
