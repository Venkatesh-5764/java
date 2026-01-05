import java.util.*;

class Calculatoroperations {
    int val1,val2;
    Calculatoroperations(int a , int b){
        this.val1=a;
        this.val2=b;
    }
    public int addfunction(){
        int su;
        su = this.val1 + this.val2;
        return su;
    }
    public int difference(){
        int dif;
        dif = this.val1-val2;
        return dif;
    }
    public int multiplication(){
        int mul;
        mul=this.val1*this.val2;
        return mul;
    }

}

class BasicCalculatorProject{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  operands so that we can perform operations");
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        Calculatoroperations c = new Calculatoroperations(operand1,operand2);
        System.out.println("enter the choice we can proceed 1. 2. 3.");
        int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("the addition of the two numbers is " + c.addfunction());
                    break;
                case 2:
                    System.out.println("the difference of the two numbers is " + c.difference());
                    break;
                case 3:
                    System.out.println("the multiplication of the two numbers is " + c.multiplication());
                    break;
                default:
                    System.out.println("you have entered the wrong option please check once");
                    break;

        }
        }

    }

