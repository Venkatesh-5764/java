class Multiple{
    int weight;
    int height;
    Multiple(int h, int w){
        weight=w;
        height=h;
        System.out.println("the bmi of the person is "+weight*height);
    }
    Multiple(int h){
        weight=75;
        height=h;
        System.out.println("the weight is not mentioned thats why the default weight is 75kg" +
                "and the total bmi of the given details is "+weight*height);
    }
    Multiple(){
        System.out.println("since no weight and height is given so the bmi is 0");
    }
}




public class MultipleConstructor {
    public static void main(String[] args){
        Multiple m = new Multiple();
        Multiple n = new Multiple(169);
        Multiple w = new Multiple(170,68);
    }
    }

