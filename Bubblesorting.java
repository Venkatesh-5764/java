import java.util.*;
class Bubblesort{

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
class Bubblesorting{
    public static void main(String[] args) {
        Bubblesort bs = new Bubblesort();
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(21);
        ar.add(2);
        ar.add(56);
        ar.add(43);
        ar.add(6);
        ArrayList<Integer> arrr = bs.bsort(ar);
        for(int i=0;i<arrr.size();i++){
            System.out.print(arrr.get(i)+" ");
        }
    }
}