package BankApplication;
import java.util.*;
public class MainBank {

	public static void main(String[] args) {
	System.out.println("............................Welcome to the Gpay...............................");
	Scanner sc=new Scanner(System.in);
	//setting pin
	Setting pin=new Setting();
	System.out.println("1.Register\n2.Exit");
	int opt=sc.nextInt();
	if(opt==1) {
		pin.register();
	}
	else {
		
		System.exit(0);
	}
	}

}
