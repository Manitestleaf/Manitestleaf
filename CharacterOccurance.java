package assignment.week2fully;

public class CharacterOccurance {

	public static void main(String[] args) {
	String input=" Welcome to chennai ";
	int count=0;
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)=='o') {
			count++;
		}
	}System.out.println(count);

	}

}