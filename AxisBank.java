package Week3.Day1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Accessing deposit method of AxisBank Class - Override");
	}

	public static void main(String[] args) {
		AxisBank dep=new AxisBank();
		BankInfo dep_bnkinfo=new BankInfo();
		dep.saving();
		dep.fixed();
		
		dep.deposit();
		dep_bnkinfo.deposit();
	}
}
