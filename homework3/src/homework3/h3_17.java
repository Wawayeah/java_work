package homework3;
import java.util.*;
public class h3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int computerWin = 0;
		int playerWin = 0;
		while(true) {
			int n = (int)(Math.random()*3);
			
			System.out.print("scissor (0), rock (1),paper (2):");
			int m = input.nextInt();
			System.out.print("The computer is ");
			if(n == 0)
			{
				System.out.print("scissor. ");
				switch(m) {
				case 0:
					System.out.println("You are scissor too. It is a draw");break;
				case 1:
					System.out.println("You are rock. You won");
					playerWin++;break;
				case 2:
					System.out.println("You are paper. You lost");
					computerWin++;break;
				}
				
			}
			if(n == 1)
			{
				System.out.print("rock. ");
				if(m == 0) {
					System.out.println("You are scissor. You lost");
					computerWin++;
				}
				if(m == 1) System.out.println("You are rock too. It is a draw");
				if(m == 2) {
					System.out.println("You are paper. You won");
					playerWin++;
				}
			}
			if(n == 2)
			{
				System.out.print("paper. ");
				if(m == 0) {
					System.out.println("You are scissor. You won");
					playerWin++;
				}
				if(m == 1) {
					System.out.println("You are rock. You lost");
					computerWin++;
				}
				if(m == 2) System.out.println("You are paper too. It is a draw");
			}
			if(computerWin == 2) {
				System.out.println("Game Over! You lost");
				break;
			}
			if(playerWin == 2) {
				System.out.println("Game Over! You win");
				break;
			}
		}
	}

}
