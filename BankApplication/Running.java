package BankApplication;
import java.util.*;
public class Running {
	static int  sbi=0,axis=0,hdfc=0,union=0;
	public static Bank application(Gpay g) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		System.out.println("Select the Account: \n1.SBI\n2.AXIS\n3.HDFS\n4.UNION Bank\n5.Exit");
		int option=sc.nextInt();
		while(flag==true) {
		if(option==1) {
			String s="SBI";
			if(sbi==0) {
			int sbiupi=UPI.settingUpi(s);
			g.setSbiupi(sbiupi);
			sbi++;
			}
			return new SBI();
		}
		else if(option==2) {
			String s="AXIS";
			if(axis==0) {
			int axisupi=UPI.settingUpi(s);
			g.setAxisupi(axisupi);
			axis=axis+1;
			}
			return new AXIS();
		} 
		else if(option==3) {
			String s="HDFC";
			if(hdfc==0) {
			int hdfcupi=UPI.settingUpi(s);
			g.setHdfcupi(hdfcupi);
			hdfc++;
			}
			return new HDFC(); 
		}
		else if(option==4) {
			String s="UNION BANK";
			if(union==0) {
			int unionupi=UPI.settingUpi(s);
			g.setUnionupi(unionupi);
			union++;
			}
			return new UNIONBANK(); 
		}
		else {
			flag=false;
			System.out.println("Thank you for Using Gpay................Come Again.........................");
			System.out.println("Share the Valuable Feedback.....");
			System.exit(0);
			
		}
	}
		
		return null;
}
}