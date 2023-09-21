package javapackage;

public class javaDemo1 {
	public static void main(String[] args) {

		String str = "RohiniMaske";
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Length of the given string" + count);
		System.out.println("Given number of total count ::::");
	}
}
 