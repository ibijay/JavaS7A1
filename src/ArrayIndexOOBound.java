import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ArrayIndexOOBound {

	public static void main(String[] args) {
		
		
		int a,b;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter 2 integers, 1st:The range,& 2nd: The Display Value");
			a= input.nextInt();
			b= input.nextInt();
			for (int i=0; i<a;i++){
				al.add(i);
			}
			
			System.out.println("Element at Position " + al.get(b)+ "is :" + al.get(b));	
		}	
		catch(InputMismatchException e){
			System.out.println("Plese Enter Integer Values only");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Array Size is " + al.size() + "Entered Value is not Valid");
		}
		catch(Exception e){
				e.printStackTrace();
				System.out.println("Something wrong out there: "+e.getMessage());
		}

		finally{
			input.close();
		}
			
		
	}
	
}