package homework3;
import java.util.*;
public class h3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double x,y,z,l=0;
         System.out.print("ÇëÊäÈë±ß³¤£º");
         Scanner input = new Scanner (System.in);
         x= input.nextDouble();
         y=input.nextDouble();
         z=input.nextDouble();
         if(x+y>z && x+z>y && y+z>x) {
        	 l=x+y+z;
             System.out.println("the l is "+ l);
         }
        	 
         else
        	 System.out.println("the input is invalid");
         
         
	}

}
