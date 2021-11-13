package Week3.Day1;

public class StringCompare {
	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="I am learning java";
		
		//Using == operator
		if (str1==str2) {
			System.out.println("Using == Operator");
			System.out.println("Same Text"); System.out.println();
			}
		else {
			System.out.println("Using == Operator");
			System.out.println("Different Text"); System.out.println();
			}
		
		//Using equals
		if (str1.equals(str2)) {
			System.out.println("Using equals");
			System.out.println("Same Text"); System.out.println();
			}
		else {
			System.out.println("Using equals");
			System.out.println("Different Text"); System.out.println();
			}
		
		//Using equalsignorecase
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Using equalsignorecase");
			System.out.println("Same Text"); System.out.println();
			}
		else {
			System.out.println("Using equalsignorecase");
			System.out.println("Different Text"); System.out.println();
			}		
		}
	}

