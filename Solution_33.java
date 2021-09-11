import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution_33 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int [][] arr = new int[6][6];
        for(int i=0; i<6; i++){
            for(int j =0; j<6; j++){
                arr[i][j] = s.nextInt();
            }
        }
        int max = -99;
        for(int i =0; i<4; i++){
            int temp =0;
            for(int j = 0; j<4; j++){
                temp  = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(temp>max) max = temp;
            }
        }
        System.out.print(max);

        s.close();
    }
}