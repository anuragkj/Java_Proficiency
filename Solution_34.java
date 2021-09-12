import java.io.*;
import java.util.*;

public class Solution_34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int total = 0;
        for(int i =0; i<n; i++){
            int sum =0;
            for (int j =i; j<n; j++){
                sum += arr[j];
                if(sum<0) total++;
            }
        }
        System.out.print(total);
    }
}