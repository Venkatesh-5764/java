class ConstructClass{
    int height;
    int weight;
    ConstructClass(int h,int w){
        height=h;
        weight=w;
    }

    void calculatebmi(){
        System.out.println("the bmi of the person with the height "+height+" and weight "
        +weight+" is "+height*weight/2);
    }
}


public class Constructorexample {
    public static void main(String[] args){
        ConstructClass c = new ConstructClass(170,67);
        c.calculatebmi();
    }
}