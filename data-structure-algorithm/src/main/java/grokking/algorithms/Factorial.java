package grokking.algorithms;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        //System.out.println(new Factorial().factorial(500));
        System.out.println(new Factorial().factorial(BigInteger.valueOf(5L)));
    }

    BigInteger factorial(BigInteger i){
        BigInteger fact=BigInteger.ONE;
        while(i.compareTo(BigInteger.ONE) >0){
            fact=i.multiply(i.min(BigInteger.ONE));
        }
        return fact;
    }

    long factorial(long i){
        long fact=1;
        while(i>=1){
            fact=fact*i--;
        }
        return fact;
    }

    //recursion
    long fact(long i){
        if(i==1)return 1;
        return i*fact(i-1);
    }
}
