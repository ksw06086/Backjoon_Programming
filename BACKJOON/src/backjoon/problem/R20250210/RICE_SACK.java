package backjoon.problem.R20250210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현, 문자열 -> 숫자 배열로 바꾸기
 * @updatedAt 김선우, 2025.02.10(문제풀이)
 * {@summary} RICE SACK
 * https://www.acmicpc.net/problem/9699
 */
public class RICE_SACK {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			String input = br.readLine();
			int[] arr = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
			
			sb.append("Case #").append(i).append(": ").append(Arrays.stream(arr).max().orElseThrow()).append("\n");
			
		}
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new RICE_SACK().solution();
	}
	
}
