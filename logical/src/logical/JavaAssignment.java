package logical;
import java.util.Scanner;


public class JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the number Books");
		int numberofbooks = Scanner.nextInt();
		int totalpages = 0;
		int bookcount = 0;
		 for (int i = 0; 1 <= numberofbooks; i++)
		 { System.out.println("Enter the number of pages in book" + i +":");
		 int pages = Scanner.nextInt();
		 
		 if (pages <=0) {
			 System.out.println("Invalid input.Please enter a positive number of pages.");
			 break;
		 }
		 totalpages += pages;
		 bookcount ++;
		 }
		 
		 if (bookcount >0) { 
			 double averagePages = (double) 
					 totalpages / bookcount;
			 System.out.println("The average number of pages per book is:" + averagePages);
		 } else {
			 System.out.println("No valid books entered");
		 }
		 
		// double averagePages = (double) totalpages / numberofbooks;
		// System.out.println("The average number of pages per book is:" + averagePages);
		

	}

}
