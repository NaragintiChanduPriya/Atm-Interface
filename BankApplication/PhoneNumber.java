package BankApplication;
import java.util.*;

public class PhoneNumber {
	static String s = "";
	static int ranNo;

	// Use getOTP( ) method to generate random OTP
	public static int getOTP(int len) {
		// Use for loop to iterate 4 times and generate random OTP
		for (int i = 0; i < len; i++) {
			// Generate random digit within 0-9
			ranNo = new Random().nextInt(9);
			s = s.concat(Integer.toString(ranNo));
		}
		// Return the generated OTP
		return Integer.parseInt(s);
	}
	public static void Phonenumber() throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		boolean phn=true;
		long phnum=0;
		System.out.println("Enter the phone number: ");
		while(phn) {
		System.out.print("91-");
		try {
			phnum=sc.nextLong();
			if(Long.toString(phnum).length()==10) {
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
		int sysOTP=getOTP(4);
		String message = "OTP generated Successfully for the phonenumber: "+phnum+" OTP is : "+sysOTP;
        char[] chars = message.toCharArray();

        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(100);
        }
		System.out.println("\nEnter the OTP: ");
		boolean otp=true;
		while(otp) {
		try {
			int userOTP=sc.nextInt();
			if(userOTP==sysOTP) {
				System.out.println("!!!!!!!!!!!!!!!!!Successfully Registered with Google pay!!!!!!!!!!!!!!!!!!!!");
				System.out.println("Your phonenumber linked with the following banks\n1.SBI\n2.AXIS\n3.HDFC\n4.UNION BANK");
				otp=false;
			}
			else {
				System.out.println("Enter valid OTP");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter the OTP\nOTP should be in Number Format");
			sc.nextLine();
		}
			
	}
	}
}
