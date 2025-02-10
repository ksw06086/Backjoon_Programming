package backjoon.problem.R20250210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author swkim
 * @category 구현, 문자열 중 e의 개수 2배로 늘리기
 * @updatedAt 김선우, 2025.02.10(문제풀이)
 * {@summary} Greetings!
 * https://www.acmicpc.net/problem/17548
 */
public class Greetings {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		Pattern pattern = Pattern.compile("e+"); // 하나 이상의 'e' 찾기
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String eGroup = matcher.group(); // "e" 그룹 찾기
            matcher.appendReplacement(sb, "e".repeat(eGroup.length() * 2));
        }
        matcher.appendTail(sb);
			
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Greetings().solution();
	}
	
}
