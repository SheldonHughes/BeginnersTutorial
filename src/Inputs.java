import java.util.Scanner;


public class Inputs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int num1;
		Scanner scan = new Scanner(System.in);
		try{
		
		System.out.println("Type any number");
		num = scan.nextInt();
		System.out.println("Type another number");
		num1 = scan.nextInt();
		if (num + num1 > 12){
			System.out.println((num + num1) +" is greater than 7");
		}
		else if(num + num1 < 7){
			System.out.println((num + num1) +" is less than 7.");
		}
		else {
			System.out.println("The number is not less than 7 or greater than 12.");
		}
		}finally{
			scan.close();
		}
	}	

}
