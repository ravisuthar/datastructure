package datastructure.array;

public class ReverseString {

	public static void main(String[] args) {

		String s = "77512";
		char[] ch = s.toCharArray();

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (i == Integer.parseInt(String.valueOf(ch[j]))) {
					count++;
				}
			}
			System.out.println(i + " " + count);
		}
	}
}
