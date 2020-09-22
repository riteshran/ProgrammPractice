public class How_to_reverse_a_String {

	public static void main(String[] args) {
		String s1 = "Ritesh";
		reverseString(s1);

	}

	public static void reverseString(String s1) {
		int n = s1.length();
		StringBuffer sb = new StringBuffer();
		for(int i=n-1;i>=0;i--) {
			sb.append(s1.charAt(i));
		}
		System.out.println(sb.toString());
	}

}


