import java.util.Scanner;
public class ProjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Input input = new Input();
		Process process;
		Output out;
		
		System.out.print("ID : ");
		String id = input.inString();
		System.out.print("Name : ");
		String name = input.inString();
		System.out.print("Salary : ");
		double salary = in.nextInt();
		System.out.print("Compensation : ");
		double compensation = in.nextInt();
		System.out.println("--------------------------------------");
		
		out = new Output(id,name);
		process = new Process(id,salary,compensation);
		System.out.println("Total Salary : " + process.compensation());
		//System.out.println(out);
	}

}