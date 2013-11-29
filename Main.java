import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static String guid;
	private static String password;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("\n============== Welcome to UTSBS ==============\n");
		System.out.print("GUID : ");

		guid = sc.next();
		
		System.out.print("Password : ");
		
		password = sc.next(); 
		
		if(guid.equals("admin") && password.equals("admin")) {
			
			System.out.println("\n======================== Login Success =========================\n");

		} else if (guid.equals("tutor") && password.equals("tutor")) {
			
			System.out.println("\n======================== Login Success =========================\n");
			
		} else {
			System.out.println("Invalid User !");
			System.exit(1);
		}
		
		
		System.out.println("Welcome " + guid + ",");
		
		int choice = 0;
		
		if (guid.equals("admin")) {
			
			System.out.println("1. export all grades for a single student");
			System.out.println("2. export all student grades for specific assignment");
			
			choice = Integer.parseInt(sc.next());
			
			switch(choice) {
			case 1:
				Student.getAllGradesForSingleStudent();
				break;
			case 2:
				Student.getAllGradesForAssignment();
				break;
			}
			
		}
		
		if (guid.equals("tutor")) {
			
			System.out.println("1. View list of expected students for your sessions");
			System.out.println("2. Key in attendance manually");
			System.out.println("3. Key in attendance by Upload CSV file");
			
			choice = Integer.parseInt(sc.next());
			
			switch(choice) {
			case 1:
				Session.getAllSession();
				break;
			case 2:
				Attendance.keyAttendance();
				break;
			case 3:
				Attendance.uploadCSVAttendance();
				break;
			}
		}
		
	}
	
}
