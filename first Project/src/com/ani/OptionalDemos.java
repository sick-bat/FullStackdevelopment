package com.ani;


import java.util.Optional;

public class OptionalDemos {
    
    public void demo1() {
        String str = null;
        if(str != null)
            System.out.println(str.charAt(0));
    }

    public void demo2() {

        System.out.println("Demo 2");
        Optional<String> opStr1 = Optional.of("abc");
        Optional<String> opStr2 = Optional.ofNullable(null);

        System.out.println("Is Null " + opStr2.isPresent());
        String nm1 = opStr2.get();
        String alternate1 = opStr2.orElse("this alternate value");
        String nm2 = opStr2.orElseThrow();
        
        opStr2.ifPresent( n -> System.out.println(n));
    }
}