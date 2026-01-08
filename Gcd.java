import java.util.*;
public class Gcd {
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int val1,val2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for the gcd calculation");
        val1= sc.nextInt();
        val2= sc.nextInt();
        for(int i=1;i<=val1;i++){
            if(val1%i==0){
                s1.add(i);
            }
        }
        System.out.println(" ");
        for(int i=1;i<=val2;i++){
            if(val2%i==0){
                s2.add(i);
            }
        }
        System.out.println("The set 1 elements are ");
        System.out.println(s1);
        System.out.println();
        System.out.println("The set 2 elements are ");
        System.out.println(s2);
        for(int i: s1){
          System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("The set 2 elements are ");
        for(int i: s2){
            System.out.print(i+" ");
        }
        TreeSet<Integer> newset = new TreeSet<>(s1);
        newset.retainAll(s2);
        System.out.println();
        System.out.println("the common elements are ");
        System.out.println();
        System.out.println(newset.last());

    }
}
