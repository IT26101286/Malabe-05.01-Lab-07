import java.util.Scanner;

public class IT26101286Lab7Q1A {

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter mark 1: ");
		 double mark1= input.nextDouble();
		
		System.out.print("Enter mark 2: ");
		 double mark2= input.nextDouble();
		
		System.out.print("Enter mark 3: ");
		 double mark3= input.nextDouble();
		
		System.out.print("Enter mark 4: ");
		 double mark4= input.nextDouble();
		
		double average = (mark1 + mark2 + mark3 + mark4) / 4;
		
		
		System.out.println("Average= " + average);
		
		  if (average >= 75) {
            System.out.println("Grade = Distinction");
        } else if (average >= 50) {
            System.out.println("Grade = Credit");
        } else {
            System.out.println("Grade = Fail");
        }
    }
}
		