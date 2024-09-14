import java.util.*;
public class Array_elements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.print("Enter your array size:" );
		int n = input.nextInt();
		int number1[] = new int[n];
		int number2[] = new int[n];
		int result[] = new int[n];
		System.out.println("Enter your array elements: ");
		for(i =0;i<n;i++) {
			number1[i] = input.nextInt();
		}
		for(i=0;i<n;i++) {
			number2[i]=input.nextInt();
		}
		for(i=0;i<n;i++) {
			result[i]=number1[i]+number2[i];
			System.out.println(result[i]);
			
		}
		
	}

}