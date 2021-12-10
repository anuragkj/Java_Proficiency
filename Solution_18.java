import java.io.*;11
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.print(S.substring(start, end));
    }
}
