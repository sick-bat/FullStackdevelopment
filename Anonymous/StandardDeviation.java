import java.util.Scanner;



public class StandardDeviation {

    private double data[] ;
    private int size;

    public StandardDeviation(int n){
        data = new double[n];
    }

    public static void main(String [] argvc){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arrsize = sc.nextInt();
        int array[] = new int[arrsize];
        double sum = 0.0, mean, standarddev  = 0.0;
        System.out.print("Enter " + arrsize + " elements: ");
        for(int i = 0; i < arrsize; i++){
           array[i] = sc.nextInt();
           sum =sum + array[i];
        }
        mean = sum / arrsize;
        for(int i = 0; i < arrsize; i++){
           standarddev = standarddev + Math.pow(array[i] - mean, 2);
        }
        System.out.printf("standard deviation is %.7f", Math.sqrt(standarddev / arrsize));
        sc.close();


    }
    
}
