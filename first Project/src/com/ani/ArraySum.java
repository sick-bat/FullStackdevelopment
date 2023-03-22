package com.ani;

import java.util.Arrays;

public class ArraySum {
    public int arraySum(){
        int sum =0;
      int array [][]=   {{ 1, 2, 3 },{ 4, 5,6  },	{7, 8,5 ,4 }};

      sum = Arrays.stream(array).flatMapToInt(Arrays :: stream).sum();
        
        return sum;
    }
    
}
