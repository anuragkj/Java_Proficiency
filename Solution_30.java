import java.math.BigDecimal;
import java.util.*;
class Solution_30{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        String temp;
        BigDecimal a,b;
        for (int i =0; i< n; i++)
        {
            for(int j = 1; j< n-i ; j++)
            {
                a = new BigDecimal(s[i]);
                b = new BigDecimal(s[j]);
                if(b.compareTo(a)>0)
                {
                    temp = s [i];
                    s[i] = s[j];
                    s[j] = temp ;
                }
                
            }
        }
        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}