/*
 * A java program that generates the fibonacci sequence
 */
package practice;

import java.math.BigInteger;

/**
 *
 * @author Olubunmi
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("0");
        System.out.println(num1);
        BigInteger num2 = new BigInteger("1");
        System.out.println(num2);
        int i = 1;
        while(true){
            i++;
            num1 = num1.add(num2);
            System.out.printf("\n%d:\t", i);
            System.out.print(num1);
            num2 = num2.add(num1);
            System.out.printf("\n%d:\t", i+1);
            System.out.print(num2);
            i++;
        }
    }
}
