package homework6;
import java.util.*;
public class TestCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GregorianCalendar g = new GregorianCalendar();
			System.out.println(g.get(GregorianCalendar.YEAR)+"/"+(g.get(GregorianCalendar.MONTH)+1)+"/"+g.get(GregorianCalendar.DAY_OF_MONTH));
			g.setTimeInMillis(1234567898765L);
			System.out.println(g.get(GregorianCalendar.YEAR)+"/"+g.get(GregorianCalendar.MONTH)+"/"+g.get(GregorianCalendar.DAY_OF_MONTH));
			
		

	}

}
