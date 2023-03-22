package com.ani;

public class RotationString {
    public boolean isRotationEqual(String one, String two) {
        StringBuilder sb = new StringBuilder();
        // abc cba
        sb.append( two.substring(1)); // 
        // System.out.println(sb.append( two.substring(1)));
        sb.append(two.charAt(0)); // s
        // System.out.println(sb.append(two.charAt(0)));
        String str = sb.toString();
        // System.out.println(str);
        if (str.equals(one)){
            return true;
        }
        return false;
    }
    
}
