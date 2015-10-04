import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void permute(int[] in,int n){
		if (n == 1) {
        	System.out.println(Arrays.toString(in));
        	return;
    	}
    	for (int i = 0; i < n; i++) {
        	swap(in, i, n-1);
        	permute(in, n-1);
        	swap(in, i, n-1);
    	}
	}
	public static void swap(int[] in,int a,int b){
		int temp = in[a];
		in[a]=in[b];
		in[b]=temp;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		permute((new int[] {4,2,7,1,3}),5);
	}
}
