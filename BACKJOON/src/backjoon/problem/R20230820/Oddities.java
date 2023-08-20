package backjoon.problem.R20230820;

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
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.08.20(문제풀이)
 * {@summary} Oddities(홀수인지 짝수인지 확인)
 * - 입력 : 첫째줄 - 테스트 케이스 수 / 둘째줄~ - 수
 * https://www.acmicpc.net/problem/10480
 */
public class Oddities {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while(N-- > 0) {
			int number = Integer.valueOf(br.readLine());
			if(Math.abs(number)%2 == 0) { sb.append(number + " is even").append("\n"); }
			else { sb.append(number + " is odd").append("\n"); }
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Oddities().solution();
	}
	
}
