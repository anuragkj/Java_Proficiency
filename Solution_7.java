import java.util.*;
import java.io.*;

class Solution_7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int k = 1;
        for(int p=0;p<t;p++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int i =1; i<=n; i++)
            {
                int sum = a;
                k =1;
                for(int j = 1; j<=i; j++)
                {
                    sum += k*b;
                    k *= 2;
                }
                System.out.printf("%d ",sum);
            }
            System.out.print("\n");
            
        }
        in.close();
    }
}