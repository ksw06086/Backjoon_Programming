package backjoon.problem.R20230712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대소문자 바꾸기
public class UpperLowerCase {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// 대문자면 소문자로 바꾸기
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		
		System.out.println(sb);
		
	}
}
