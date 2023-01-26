package prelimactivities;
import java.util.*;
public class GradeMidterm {

	public static void main(String[] args) {
		
		Grade [] midterm = new Grade [3];
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter student 01 Midterm Grade: ");
		 System.out.print("Assignment Grade: ");
		 int midterm1assign = sc.nextInt();
		 
		 System.out.print("Attendance Grade: ");
		 int midterm1attedance = sc.nextInt();
		 
		 System.out.println("Machine Problem: ");
		 int midterm1mcprob = sc.nextInt();
		 
		 System.out.println("Project Grade: ");
		 int midterm1proj = sc.nextInt();
		 
		 System.out.println("");
		 
		 System.out.println("Enter student 02 Midterm Grade: ");
		 System.out.print("Assignment Grade: ");
		 int midterm2assign = sc.nextInt();
		 
		 System.out.print("Attendance Grade: ");
		 int midterm2attedance = sc.nextInt();
		 
		 System.out.println("Machine Problem: ");
		 int midterm2mcprob = sc.nextInt();
		 
		 System.out.println("Project Grade: ");
		 int midterm2proj = sc.nextInt();
		 
		 System.out.println("");
		 
		 System.out.println("Enter student 03 Midterm Grade: ");
		 System.out.print("Assignment Grade: ");
		 int midterm3assign = sc.nextInt();
		 
		 System.out.print("Attendance Grade: ");
		 int midterm3attedance = sc.nextInt();
		 
		 System.out.println("Machine Problem: ");
		 int midterm3mcprob = sc.nextInt();
		 
		 System.out.println("Project Grade: ");
		 int midterm3proj = sc.nextInt();
		 
		midterm[0] = new Grade (midterm1assign, midterm1attedance, midterm1mcprob, midterm1proj); 
		midterm[1] = new Grade (midterm2assign, midterm2attedance, midterm2mcprob, midterm2proj); 
		midterm[2] = new Grade(midterm3assign, midterm3attedance, midterm3mcprob, midterm3proj); 
		
		for (int i = 0; i < midterm.length; i++) {
			int count = i+1; 
			
			System.out.println("Assignment: " + midterm[i].getAssignment());
			System.out.println("Attendance: " + midterm[i].getAttendance());
			System.out.println("Machine Problem: " + midterm[i].getMachineProblem());
			System.out.println("Project: " + midterm[i].getProject());		
			
			System.out.println("Student Number." + count);
			System.out.println("");
		}	

	}

}
