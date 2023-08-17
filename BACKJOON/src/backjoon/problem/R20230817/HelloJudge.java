package backjoon.problem.R20230817;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.17(문제풀이)
 * {@summary} Hello Judge(테스트 케이스에 인사해라)
 * - 입력 : 첫째줄 - 테스트 케이스
 * https://www.acmicpc.net/problem/9316
 */
public class HelloJudge {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			sb.append("Hello World, Judge " + i + "!").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new HelloJudge().solution();
	}
	
}
