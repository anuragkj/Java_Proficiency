import java.io.*;
import java.util.*;

public class Solution_22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int start = 0; int parsing =0;
        List<String> l = new ArrayList<String>();
        int i =0;
        for(i =0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c))
            {
                if(parsing == 0)
                {
                    start = i;
                    parsing = 1;
                }
            }
            else
            {
                if(parsing == 1)
                {
                    l.add(s.substring(start, i));
                    parsing = 0;
                }
            }
        }
        if(parsing == 1)
        {
            l.add(s.substring(start, i));
        }
        System.out.println(l.size());
        for(i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        scan.close();
    }
}
