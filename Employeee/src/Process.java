
public class Process {
	private String id;
	private double salary;
	private double compensation;

	public Process(String id, double salary,double compensation) {
		this.id = id;
		this.salary = salary;
		this.compensation = compensation;
	}
	
	public double getCompensation() {
		return this.compensation;
	}
	
	public double compensation() {
		double total = 0;
		if(this.compensation<50000) {
			total = this.compensation*0.05;
			total = this.salary + total;
		}
        else if (this.compensation>50001){
        	total = this.compensation*0.10;
        	total = this.salary + total;
        }
		
		if(this.salary < 15000) {
			if(this.compensation > 100001 ) {
				total = total + 5000;
			}
		}
		return total;		
	}
	
}