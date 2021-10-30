package homework3;

public class h3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10000以下的完全数有：");
		for(int n=2;n<=10000;n++) {
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) sum+=i;
			}
			if(sum==n)
				System.out.println(n+" ");
		}
	}

}
