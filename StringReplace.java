package Week3.Day1;

public class StringReplace {
	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		System.out.println("Replaced 8 to 11");
		System.out.println(sentence.replace("8", "11")+'#'); System.out.println();
		System.out.println("Print the characters from 5 to 14");
		System.out.println(sentence.substring(5, 15));
	}
}
