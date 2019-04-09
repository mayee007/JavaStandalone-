

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

public class CheckPrime {

	public static void main(String[] args) {
		try{
			//BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=10;
			int n2=45;
			int n3=677;
			int n4=3;
			int n5=7;
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

class Prime { 
	public void checkPrime(int... nums) { 
		for (int num: nums) {
			System.out.println("num : " + num ); 
			isPrime(num); 
		}
	}
	
	public void isPrime(int num) { 
		
	}
}

