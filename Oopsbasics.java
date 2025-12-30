class Student{
    int id;
    String name;
    public void greet(){
        System.out.println("hello "+ name);

    }

}
class Oopsbasics{
    public static void main(String[] args){
        Student s = new Student();
        s.id=12;
        s.name="MaheshBabu";
        s.greet();
    }
}