package com.ani;

import java.util.Scanner;
import com.ani.ArraySum;

public class App {

    // public static void countChars() {
    //     CharacterCount cc = new CharacterCount();
    //     String op1 = cc.countChars("aaatttaeee");
    //     String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
    //     System.out.println(sts1);

    //     String op2 = cc.countChars("qwqwwwqw");
    //     String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
    //     System.out.println(sts2);

    //     System.out.println(op1 + " "+ op2);
    // }

    /////////////////////////////// Rotation String /////////////////////////////////////////////////////
    // public static void rotationEquality() {

    //     RotationString roEq = new RotationString();

    //     String sts1 = roEq.isRotationEqual("abc", "bbc") ? "bbc is rotation of abc" : "bbc is not a roatation of abc";
    //     System.out.println(sts1);

    //     String sts2 = roEq.isRotationEqual("aa", "aa") ? "aa is rotation of aa" : "aa is not a roatation of aa";
    //     System.out.println(sts2);

    //     String sts3 = roEq.isRotationEqual("a", "b") ? "b is rotation of a" : "b is not a roatation of a";
    //     System.out.println(sts3);

    //     String sts4 = roEq.isRotationEqual("a", "a") ? "a is rotation of a" : "a is not a roatation of a";
    //     System.out.println(sts4);

    //     String sts5 = roEq.isRotationEqual("abcpqr", "rqpcba") ? "rqpcba is rotation of abcpqr" : "rqpcba is not a roatation of abcpqr";
    //     System.out.println(sts5);
    // }

    /////////////////////////////////// Removing nth character ////////////////////////////////////


    // public static void remChar() {

    //     RemoveN rc = new RemoveN();
        
    //     System.out.println("Answer (abcpqr)"+ rc.remChar("abcxpqr", "x"));
    //     System.out.println("There is no x in string"+ rc.remChar("abcpqr", "x"));
    //     System.out.println("Invalid String"+ rc.remChar("", "x"));
    //     // System.out.println("1 here is the problem");

    //     System.out.println("Specify the character to be removed"+ rc.remChar("abcxpqr", ""));
    //     // System.out.println(" here is the problem");
    //     System.out.println("Answer (ab) "+ rc.remChar("axb", "x"));
    //     System.out.println("Answer (nothing remains) "+ rc.remChar("x", "x"));
    //     System.out.println("Answer (x) (my error :/) "+ rc.remChar("xx", "x"));
    //     System.out.println("Answer (abcpqr)"+ rc.remChar("axbcxpqr", "x"));
    // }
    
/////////////////////////////////////////character count //////////////////////////////////////////


    // public static void countChars() {
    //     CharacterCount cc = new CharacterCount();
    //     String op1 = cc.countChars("aaatttaeee");
    //     String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
    //     System.out.println(sts1);

    //     String op2 = cc.countChars("qwqwwwqw");
    //     String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
    //     System.out.println(sts2);
    // }
    // public static void uniqueCommon() {
    //     CommonUnique cu = new CommonUnique();

    //     Integer[] arr1 = {1, 2, 3, 4, 5};
    //     Integer[] arr2 = {4, 5, 6, 7, 8};

    //     ;
    //     System.out.println(cu.unique(arr1, arr2));
    //     System.out.println(cu.common(arr1, arr2));
    // }
    
    public static void main(String[] args) throws Exception {
        ArraySum s = new ArraySum();
        s.arraySum();
        System.out.println(s.arraySum());
        
        
        // StreamsApi d = new StreamsApi();
        // d.demo1();
        // d.demo2();
        // d.demo3();
        // d.demo4();
        // d.demo5();
        // System.out.println("Demo 6");
        // d.demo6();
        // d.demo7();

        // OptionalDemos od = new OptionalDemos();
        // od.demo1();
        // od.demo2();

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // // if (str.equals("")){
        // //     System.out.println("invalid string");
        // //     return ;
        // // }
        // char n = sc.next().charAt(0);
   

        
        // int ind = str.indexOf(n);
        // // if (ind == -1){
        // //     System.out.println("Specify the character to be removed");
        // //     return ;
        // // }
        // // int freq=0;
        // // for (int i=0;i<str.length();i++){
        // //     if (n == str.charAt(i)){
        // //         freq++;
        // //     }
        // // }


        // RemoveN strN = new RemoveN();
        // // String joinedStr = "";
        // // for (int i=0;i<=freq;i++){
        // // joinedStr = strN.removeCharacter(str,ind,n);}
        // String joinedStr = strN.removeCharacter(str, ind, n);

        // if (joinedStr.equals("")){
        //     System.out.println("nothing remains");
        // }

        // System.out.println(joinedStr);arrnia


        // Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();
    //    rotationString st = new rotationString();
    //    boolean k =  st.isRotationEqual("bca", "abc");

    //    System.out.println(k);

        // CollectionDemo cd = new CollectionDemo();
        // cd.demo2();


        //collection

        // countChars();
        // rotationEquality();
        // remChar();
        // uniqueCommon();


    }
}
