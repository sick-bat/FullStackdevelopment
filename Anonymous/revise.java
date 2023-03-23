import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class revise{
public static void main(String[] argv){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a);
    if (a%2!=0){
        System.out.println("odd");
    }
    else {
        System.out.println("even");
    }
    
    System.out.println("Hello world \n");
    System.out.println();
    System.out.println();   

    for (int i=0;i<a;i++){
        for (int j=0;j<a;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=0;i<a;i++){
        for (int j=0;j<a;j++){
            if ((j==(a-1)) || (j==0)||(i==0)||(i==(a-1)))
           { System.out.print("*");}
           else 
           System.out.print(" ");
        }
        System.out.println();
    }

    System.out.println();

    for (int i=0;i<a;i++){
        for (int j=0;j<=i;j++){ 
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();

    for (int i=a;i>=0;i--){
        for (int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }


}

}

