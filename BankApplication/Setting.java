package BankApplication;
import java.util.*;
class Setting {	
	//Creating Object for Singleton class
	Gpay g=Gpay.getInstance();
	Scanner sc = new Scanner(System.in);
	public void register() {
		Running run=new Running();
		Bank b=run.application(g);
		Operations.transactions(b,g);
}
}