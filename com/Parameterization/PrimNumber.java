package com.Parameterization;

public class PrimNumber {

    static boolean isPrimenumber(int prime) {
        for (int i = 2; i < (prime / 2); i++) {
            if ((prime % i) == 0) {
                return false;
            }
        }
        return true;
    }
public static void main(String args[]){
        int num = 40;
        System.out.println( num+ "- Is Prime Number? "+isPrimenumber(num));
}
}
