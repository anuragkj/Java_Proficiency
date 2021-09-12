import java.io.*;
import java.util.*;

public class Solution_35{

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
            
            
        }
        n = s.nextInt();
        for(int i =0; i<n; i++){
            
            int row = s.nextInt();
            int pos = s.nextInt();
            if(pos <= arr.get(row -1).size()){ 
                System.out.println(arr.get(row -1).get(pos -1));
            }
            else{ 
                System.out.println("ERROR!");
            }
            
        }
    }
}
