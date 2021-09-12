import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();
        int n = s.nextInt();
        for(int i =0; i<n; i++){
            List<Integer> temp = new ArrayList<>();
            int size = s.nextInt();
            for(int j = 0; j<size; j++){
                temp.add(s.nextInt());
            }
            arr.add(temp);
            temp.clear();
        }
        n = s.nextInt();
        for(int i =0; i<n; i++){
            
            int row = s.nextInt();
            List<Integer> temp = arr.get(row - 1);
            System.out.println(temp.get(s.nextInt() -1));
            temp.clear();
        }
    }
}
