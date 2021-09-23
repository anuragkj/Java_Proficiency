//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution_38{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int abcv;
		int n=in.nextInt();
		in.nextLine();
        HashMap <String,Integer> dict = new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            Integer p =new Integer(phone);
			in.nextLine();
            dict.put(name,p);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(dict.containsKey(s)){
                System.out.println(s+"="+dict.get(s));
            }
            else{
                System.out.println("Not found");
            }
		}
	}
}
