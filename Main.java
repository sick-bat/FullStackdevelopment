public class Main {

    int m=20;
    int n=30;
    void add(){
        int x = m+n;
        System.out.println(x);

    }

    public static void main(String [] argv){

        Main f1 = new Main();
        f1.add();
        System.out.println("Hello");
        System.out.println("another class from another file");
        another t1 = new another();


    }


}