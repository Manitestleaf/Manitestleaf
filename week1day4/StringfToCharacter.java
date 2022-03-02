package week1day4;

public class StringfToCharacter {
	public static void main(String[] args) {
		
		String text="naveen nemo";
		
		char[] array=text.toCharArray();
		
		for(int i=0;i<text.length();i++)
		{
			System.out.println(array[i]);
		}
	}

}
