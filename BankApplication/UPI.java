package BankApplication;
import java.util.*;
public class UPI {
     public static int settingUpi(String s){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Set the "+s+" Upi pin : ");
    	 boolean flag=true;
    	 int pin=0;
    	 while(flag) {
    		 try {
    			 int upipin=sc.nextInt();
    			 if(Integer.toString(upipin).length()==6) {
    			 System.out.println("Re-enter the Upipin to confirm: ");
    			 
    			 while(flag){
    				 try {
    					 int confirm_upi=sc.nextInt();
        				 if(upipin==confirm_upi) {
        					 pin=upipin;
        					 flag=false;
        				 }
        				 else {
        					 System.out.println("Re-enter the pin correctly: ");
        				 }	
    				 }
    				 catch(InputMismatchException e) {
    					 System.out.println("Upi pin should be number format\nRe-enter the Upipin to confirm: ");
    					 sc.nextLine();
    				 }
    				 
    				 
    			 }
    		 }
    		 else {
    			 System.out.println("Upi pin length should be 6");
    		 }}
    		 catch(InputMismatchException e){
    			 System.out.println("Upi pin should be number format\nSet the "+s+" Upi pin:");
    			 sc.nextLine();
    		 }
    		 
    		 
    	 }
    	return pin; 
     }
}
