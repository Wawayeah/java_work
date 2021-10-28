package homework3;

public class h3_14 {

	public static void main(String[] args) {
		int count=0,num=0;
		// TODO Auto-generated method stub
        for(int i=101;i<=2100;i++) {
        	if((i%4==0&&i%100!=0)||i%400==0) {
        		count++;
        		num++;
        		System.out.print(i+" ");
        		if(count%10==0) {
        			System.out.println();
        		}
        	}
        }
        System.out.println();
        System.out.println("从101到2100之间的闰年有"+num+"个");
	}

}
