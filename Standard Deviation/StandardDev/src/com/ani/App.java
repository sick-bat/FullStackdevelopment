package com.ani;
import java.util.*;
import com.ani.mean;




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array size");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
            mean m = new mean(arr,a);
            System.out.println(m.show_mean());
            
            
            
        }
    

   
      
    }
}
