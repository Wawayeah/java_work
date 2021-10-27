package homework4;
import java.util.*;
public class h4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生个数:");
		int n=input.nextInt();
		String name[]=new String[n];
		double score[]=new double[n];
		
		System.out.println("请输入学生姓名及成绩：");
		for(int i=0;i<n;i++) {
			name[i]=input.next();
			score[i]=input.nextDouble();
		}
		Sort(name,score);
		System.out.println("name\t score\t");
		System.out.println("----------------");
		for(int i = 0; i < n; i++)
			System.out.printf("%-9s%-5.2f\n",name[i],score[i]);
	}
	public static void Sort(String name[],double score[]) {
		double tempScore=0;
		String tempName;
		for(int i=0;i<score.length-1;i++) {
			int k;
			k=i;
			for(int j=i+1;j<score.length;j++) {
				if(score[j]>score[k])
					k=j;
					
			}
			tempScore=score[k];
		    score[k]=score[i];
		    score[i]=tempScore;
		    tempName=name[k];
		    name[k]=name[i];
		    name[i]=tempName;
		}
	}

}
