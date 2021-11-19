package homework6;
import java.util.Random;
public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(1000);
		System.out.println("from random 1:");
		for(int i=0;i<50;i++) {
			System.out.print(random.nextInt(100)+" ");
		}
		Random random2 = new Random(1000);
		System.out.println("\nfrom random 2:");
		for(int i=0;i<50;i++) {
			System.out.print(random2.nextInt(100)+" ");
		}
	}

}
