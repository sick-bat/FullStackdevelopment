package com.ani;

public class mean {

    int arr[];
    int arrsize;
    int sum = 0;

    public  mean(int arr[],int arrsize){
        this.arr = arr;
        this.arrsize = arrsize;
    }
    public int arrsum(int arr[],int arrsize){
        
        
        for (int i=0;i<arrsize;i++){

            sum += arr[i];
        }
        return sum;
    }




    
}
