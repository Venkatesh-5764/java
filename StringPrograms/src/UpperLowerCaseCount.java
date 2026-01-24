import java.util.Scanner;

public class UpperLowerCaseCount {
    public static void main(String[] args){
        String sen;
        int uc=0,lc=0,dc=0,spc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence user");
        sen=sc.nextLine();
        for(char ch:sen.replace(" ","").toCharArray()){
            if(Character.isUpperCase(ch))
                uc++;
            else lc++;
        }
        System.out.println("The uppercase letters count is "+uc);

        System.out.println("The lowercase letters count is "+lc);
        for (char ch:sen.replace(" ","").toCharArray()){
            if(Character.isDigit(ch)){
                dc++;
            }
        }
        for(char ch:sen.toCharArray()){
            if(ch==' '){
                spc++;
            }
        }
        System.out.println("The digits count is "+dc);
        System.out.println("The space count is "+spc);
        System.out.println("the Lowercase of the sentence is :"+sen.toLowerCase());

        System.out.println("the Lowercase of the sentence is :"+sen.toUpperCase());
    }

}
