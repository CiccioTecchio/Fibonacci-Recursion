import java.util.Scanner;

public class Test{
	
	public static void main (String[]args){
		Scanner in=new Scanner(System.in);
		//System.out.println("Inserisci l'n-mo numero di Fibonacci che vuoi calcolare\nn= ");
		System.out.println("Witch Fibonacci's number do you want calcolate: ");
		int n;
		n=in.nextInt();
		try{
		Fibonacci fib=new Fibonacci(n);
		System.out.println("Fibonacci's("+n+")= "+fib.calcolate(n));
		}catch(NegativeArraySizeException e){
			System.err.println("Length of Array < 0");
			e.printStackTrace();
			System.exit(0);
		}

	}
}