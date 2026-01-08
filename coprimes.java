
import java.util.*;
class Bubbllesort{

    public void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);

    }
    public ArrayList bsort(ArrayList<Integer> arr){
        int si = arr.size();
        for(int i=0;i<si;i++){
            boolean swapped = false;
            for(int j=0;j<si-1-i;j++){
                if(arr.get(j)>arr.get(j+1)){
                    swap(arr,j,j+1);
                    swapped = true;
                }

            }
            if(!swapped) break;
        }
        return arr;
    }

}
class primelogic{
    public boolean check(int val){
        int mid = val/2;
        boolean isprime=false;
        for(int i=2;i<=mid;i++){
            if(val%i==0){
                isprime=true;
                break;
            }

        }

        return !isprime;
    }

}
class coprimes {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        lst.add(13);
        lst.add(19);
        lst.add(23);
        lst.add(83);
        lst.add(97);
        lst.add(17);
        primelogic l = new primelogic();
        System.out.println("the elements in the given list");

        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
        for(int i=0;i<lst.size();i++){
            if(l.check(lst.get(i))&& l.check(lst.get(i)+2)&&
                    lst.contains(lst.get(i)+2)){
                int val = lst.get(i);
                int coval=val+2;
                System.out.println(val+" "+ coval);
            }
        }

    }
}
