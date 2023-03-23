import javax.sql.rowset.spi.SyncResolver;

class Student{
    String name;
    int age ;

    public void info(){
        System.out.println("name is "+ name + " age is" + age);
    }
    public int info (int age){
        return age;
    }
    public String info(String name){
        return name;
    }
    Student(){
        System.out.println("non paramaterised constructor ");
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }


}
class shape{
    public int area(){
        System.out.println("The area of the shape is ");
    return 0;
    }

}


class Triangle extends shape {
    public int area(int l ,int h){
        return (1/2 *(l*h));
    }
}

class equilateral extends Triangle{
    public float area(float side){
        return (0.43)*side *side;
    }
}



public class oops {
    public static void main(String [] args){
        Student s1 = new Student("Sachin", 54);
        s1.info();
        Student s2 = new Student(s1);
        s2.info();
    System.out.println(s1.info(53));
    System.out.println(s1.info("sACHIN"));
    equilateral t1 = new equilateral();
    System.out.println(t1.area(3.2));

    }

    
}
