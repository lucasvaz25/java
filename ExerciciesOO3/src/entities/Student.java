package entities;

public class Student {
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	public double Final;

	public double SumNote() {
		return firstNote + secondNote + thirdNote;
	}

	public void PassOrFailed() {
		if (this.Final >= 60) {
			System.out.printf("FINAL GRADE = %.2f%n", this.Final);
			System.out.println("PASS");
		} else {
			double miss = (60 - this.Final);
			System.out.printf("FINAL GRADE = %.2f%n",  this.Final);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n POINTS", miss);
		}
	}
}
