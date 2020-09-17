package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5582_공통부분문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		int[][] table = new int[s1.length()+1][s2.length()+1];
		
		int max = 0;
		for (int i = 1; i < table.length; i++) {
			for (int j = 1; j < table[i].length; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					table[i][j] = table[i-1][j-1] + 1;
					max = Math.max(table[i][j], max);
				}
			}
		}
		System.out.println(max);
	}

}
