import java.util.Scanner;

public class UpperLowerCaseCount {
    public static void main(String[] args){
        String sen;
        int uc=0,lc=0;
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
    }

}
