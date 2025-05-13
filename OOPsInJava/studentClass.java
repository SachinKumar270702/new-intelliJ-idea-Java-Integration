package OOPsInJava;

public class studentClass {
    //creating a new data type

    public static void printObjects(Student x) {
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percentage);
        return;
    }

    public static void main(String[] args) {
        Student x=new Student();//declaration
        x.name="Sachin";
        x.rno=32;
        x.percentage=96.2872;
//        System.out.println(x.name);

        Student s=new Student();
        s.name="Sahil";
        s.rno=13;
        s.percentage=85.234;
        printObjects(x);
    }
}
