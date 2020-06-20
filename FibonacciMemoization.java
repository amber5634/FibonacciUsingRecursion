import java.io.*;
public class FibonacciMemoization
{
	static long[] mm=new long[200];
	public static long F(int N)
	{
	if(N==0)
	return 0;
	if(N==1)
	return 1;
	if(mm[N]==0)
	return F(N-1)+F(N-2);
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		System.out.println(F(N));	
	}

}