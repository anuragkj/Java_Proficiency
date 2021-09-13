import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i =0; i<n; i++){
            arr.add(s.nextInt());
        }
        
        n = s.nextInt();
        for(int i =0; i<n;i++){
            if(s.next().toString().equals("Insert")){
                arr.add(s.nextInt(),s.nextInt());
                
            }
            else{
                arr.remove(s.nextInt());
                
            }
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}