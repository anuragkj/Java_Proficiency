import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution_29 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(mul);
    }
}