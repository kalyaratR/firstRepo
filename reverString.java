public class CharAndReverse {

	public static void main(String[] args) {
		strBychar("cat");
		strRev("dog");
		System.out.println(reverseString("Patitta"));

	}

	public static void strBychar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void strRev(String str1) {			// this method have void 
		for (int j = str1.length() - 1; j >= 0; j--) {
			System.out.println(str1.charAt(j));
		}
	}
	public static String reverseString(String str) {    // this method no void have to show print on main method
		String reverse = "";
		for(int i = str.length() - 1; i >= 0 ; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
