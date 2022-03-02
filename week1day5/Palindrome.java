package week1day5;

public class Palindrome {

		
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String input = new String("MALAYALAM");
		String pal = "";
		// char[] chararray=input.toCharArray();

		for (int i = input.length() - 1; i >= 0; i--) {

			pal = pal + input.charAt(i);

		}
		if (input.equals(pal)) {
			System.out.println(pal + " " + "this is pallindrom");
		} else {
			System.err.println(pal + " " + "this is not pallindrom");
		}

		// for (int i =name.length()-1; i>=0; i--)

	}

}
