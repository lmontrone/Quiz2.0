import java.util.Scanner;

public class Problem1 {
	
	Scanner input = new Scanner(System.in);
	public int ITC;
	public int percent;
	public int APR;
	public int loanTerm;
	public int paymentAmount;
	public int tuition;
	
	public int tuitionSolver(int ITC)
	{
		System.out.println("What is the initial tuition cost?");
		int x = input.nextInt();
				ITC = x;
		System.out.println("What is the annual percentage increase for the tuition?");
		int y = input.nextInt();
				percent = y;
		System.out.println("What is your APR?");
		int z = input.nextInt();
				APR = z/1200;
		System.out.println("What is the loan term?");
		int w = input.nextInt();
				loanTerm = w;
		
		int paymentAmount = loanTerm * 12;
		
		tuition = 0;
		for (int i = 0; i < 4;i++){
			double monthlyPayment = (ITC)*Math.exp(percent * i);
			tuition += monthlyPayment;
		}
		return tuition;
		
		}
	}

