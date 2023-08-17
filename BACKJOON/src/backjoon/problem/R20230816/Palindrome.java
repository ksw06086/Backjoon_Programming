package backjoon.problem.R20230816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.16(문제풀이)
 * {@summary} 팰린드롬수(앞뒤 똑같은지?)
 * - 입력 : 첫째줄~ - 수 / 마지막 - 0
 * https://www.acmicpc.net/problem/1259
 */
public class Palindrome {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String result = "yes";
		
		while(true) {
			String palindrome = br.readLine();
			if(palindrome.equals("0")) break;
			result = "yes";
			for(int i = 0; i < palindrome.length()/2; i++) {
				if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-(i+1))) {
					result = "no";
					break;
				}
			}
			sb.append(result).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Palindrome().solution();
	}
	
}
