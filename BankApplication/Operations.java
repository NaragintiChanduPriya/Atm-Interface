package BankApplication;
import java.util.*;
public class Operations {
	static int sbi=1,union=1,axis=1,hdfc=1;
      public static void transactions(Bank b,Gpay g) {
    	  int count=0;String s="";
    	  Scanner sc=new Scanner(System.in);
    	  int Upipin=0;
    	  if(b instanceof SBI) {
    		  Upipin=g.getSbiupi();
    		  count=sbi;
    		  s="SBI";
    	  }
    	  else if(b instanceof AXIS){
    		  Upipin=g.getAxisupi();
    		  count=axis;
    		  s="AXIS";
    	  }
    	  else if(b instanceof HDFC){
    		  Upipin=g.getHdfcupi();
    		  count=hdfc;
    		  s="HDFC";
    	  }
    	  else if(b instanceof UNIONBANK){
    		  Upipin=g.getUnionupi();
    		  count=axis;
    		  s="UNION BANK";
    	  }
    	 
		  int loop=1;
		  while(loop==1) {
			  System.out.println("1.Check Balance\n2.Transfer\n3.Deposit\n4.Exit");
        	  int opt=sc.nextInt();
    	      boolean flag=true;
    	      if(opt<=3) {
    	      if(count<=3&&count>0) {
    	    	  while(flag==true) {
    	    		  if(opt==1) {
    	    			  System.out.println("Enter Your upi pin : ");
    	    			  boolean pin=true;
    	    			  int Upin=0;
    	    			  while(pin) {
    	    				  try {
    	    					  int uin = sc.nextInt();
    	    					  if(Integer.toString(uin).length()==6) {
    	    						  Upin=uin;
    	    						  pin=false;
    	    					  }
    	    					  else {
    	    						  System.out.println("Enter the pin\nUpi pin length should be 6");
    	    					  }
    	    				  }
    	    				  catch(InputMismatchException e) {
    	     					 System.out.println("Upi pin should be number format\nRe-enter the Upipin: ");
    	    					 sc.nextLine();
    	    				 }
    	    			  }
    	    			  
    	    			  
						if (Upin==Upipin) {
    	    				  System.out.println("Balance : "+b.Balance());
    	    				  break; 
    	    			  }
			    		  else {
			    			
			  				System.out.println("@Incorrect upi@Transaction failed");
			  				System.err.println(3-count +" chances is left ");
			  				count++;
			  			  }
	    		  
    	    		  }
	    	  else if(opt==2) {
	    		  System.out.println("Enter Your upi pin : ");
    			  boolean pin=true;
    			  int Upin=0;
    			  while(pin) {
    				  try {
    					  int uin = sc.nextInt();
    					  if(Integer.toString(uin).length()==6) {
    						  Upin=uin;
    						  pin=false;
    					  }
    					  else {
    						  System.out.println("Enter the pin\nUpi pin length should be 6");
    					  }
    				  }
    				  catch(InputMismatchException e) {
     					 System.out.println("Upi pin should be number format\nRe-enter the Upipin: ");
    					 sc.nextLine();
    				 }
    			  }
	    		  if (Upin==Upipin) {
	    			  System.out.println("Enter the phone number to transfer: ");
	    			  boolean phn=true;
	    				long number=0;
	    				while(phn) {
	    					System.out.print("91-");
	    					try {
	    						number=sc.nextLong();
	    						if(Long.toString(number).length()==10) {
	    							phn=false;	
	    						}
	    						else {
	    							System.out.println("Phone number length should be 10");
	    						}
	    					}
	    					catch(InputMismatchException e) {
	    						System.out.println("Enter the valid input\nPhone number should be in Number Format");
	    						sc.nextLine();
	    					}
	    					}
	        		  System.out.println("Enter amount to Transfer or withdraw: ");
	        		  int amt=sc.nextInt();
	        		  System.out.println(b.transfer(amt,number));
	        		  break; 
	    		  }
	    		  else {
	  				System.out.println("@Incorrect upi@Transaction failed");
	  				System.err.println(3-count +" chances is left ");
	  				count++;
	  			  }
	    		 
	    		  
	    	  }
	    	  else if(opt==3) {
	    		  System.out.println("Enter Your upi pin : ");
    			  boolean pin=true;
    			  int Upin=0;
    			  while(pin) {
    				  try {
    					  int uin = sc.nextInt();
    					  if(Integer.toString(uin).length()==6) {
    						  Upin=uin;
    						  pin=false;
    					  }
    					  else {
    						  System.out.println("Enter the pin\nUpi pin length should be 6");
    					  }
    				  }
    				  catch(InputMismatchException e) {
     					 System.out.println("Upi pin should be number format\nRe-enter the Upipin: ");
    					 sc.nextLine();
    				 }
    			  }
	    		  if (Upin==Upipin) {
	    			  System.out.println("Enter amount to Deposit: ");
	        		  int amt=sc.nextInt();
	        		  System.out.println("Balance : "+b.Deposit(amt));
	        		  
	        		  break;
	    		  }
	    			  
	    		  else {
	  				System.out.println("@Incorrect upi@Transaction failed");
	  				System.err.println(3-count +" chances is left ");
	  				count++;
	  			  }
	    		 	 
	    	  }
    	    	if(count==4) {
    	  	  	  if(b instanceof SBI) {
    				  sbi=count;
    				  
    				  
    			  }
    			  else if(b instanceof AXIS){
    				  axis=count;
    				  
    			  }
    			  else if(b instanceof HDFC){
    				  hdfc=count;
    				  
    			  }
    			  else if(b instanceof UNIONBANK){
    				  union=count;
    				  
    			  }
    	    		System.out.println(s+" account is blocked for 24 hours");
    	    		break;
    	    		}
	    	  }
	    	  
			}
	    else {
	    System.out.println(s+" account is blocked for 24 hours");
	    
	    }
       }
    	else {
	    	Running run=new Running();
	        Bank bu=run.application(g);
			Operations.transactions(bu,g);
	    	loop=2;
	    }
    	      
	
	 }
   }
}

      