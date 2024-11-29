package ex34_StringTokenizer;

public class StringTokenizerExample8 {
	public static void main(String args[]) {
		String phone = "010-1234-5678";
		String[] s = phone.split("-");
		for(int a=0; a <s.length;a++) {
		System.out.println(s[a]);
		}
		}
	}
