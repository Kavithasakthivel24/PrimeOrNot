
public class PrimeOrNot {
	
	public static void main(String args[]) {
		
		int n=13;
		int flag=0;
		if(n<=1)
		{
			flag=1;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0)
			{
				flag=1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(n+ " is prime");
		}else {
			System.out.println(n+ " is not prime");
		}
	}

}
