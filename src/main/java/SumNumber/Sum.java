package SumNumber;

public class Sum {
	int num1;
	int num2;
	
	public Sum(int a, int b) {
		this.num1 =a;
		this.num2 =b;
	}
	
	public Sum() {
		// TODO Auto-generated constructor stub
	}

	public int sumofnumbers(int a, int b)
	{
		return a+b;
	}
	
	public int sumofnumbers() {
		return this.num1 + this.num2;
	}
	
	public int subtract(int a, int b)
	{
		return a-b;
	}

}
