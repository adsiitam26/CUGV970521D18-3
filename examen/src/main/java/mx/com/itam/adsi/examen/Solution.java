package mx.com.itam.adsi.examen;

public class Solution {
	public boolean gus(String str) {
		String s = str + str;
		return s.substring(1, s.length()-1).contains(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.gus("baccab"));
	}

}
