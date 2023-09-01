package backjoon.problem.R20230901;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.09.01(문제풀이)
 * {@summary} A Simple Problem.(제곱수를 출력하라)
 * - 입력 : 1째줄 - 테스트 케이스 수, 2째줄~N째줄 - N
 * https://www.acmicpc.net/problem/15372
 */
public class ASimpleProblem {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int testCnt = Integer.valueOf(br.readLine());
		
		while(testCnt-- > 0) {
			long n = Long.valueOf(br.readLine());
			sb.append((long)Math.pow(n, 2) + "\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ASimpleProblem().solution();
	}
	
}
