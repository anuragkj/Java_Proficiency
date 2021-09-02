import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution_6 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        for(;i<=10;i++)
        {
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }

        s.close();
    }
}