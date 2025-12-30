class Student{
    int id;
    String name;
    public void greet(){
        System.out.println("hello "+ name);

    }
    public void describe(){
        System.out.println("hey you are "+name+" right and your id is "+id+" right");
    }

}
class Oopsbasics{
    public static void main(String[] args){
        Student s = new Student();
        s.id=12;
        s.name="MaheshBabu";
        s.greet();
        s.describe();
    }
}