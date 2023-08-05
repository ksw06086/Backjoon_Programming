package backjoon.problem.R20230805;

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
 * @updatedAt 김선우, 2023.08.05(문제풀이)
 * {@summary} R2(R1 구하기)
 * - 입력 : 첫째줄~ - R2, S(평균)
 * https://www.acmicpc.net/problem/3046
 */
public class R2 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R1 = Integer.valueOf(st.nextToken());
		int S = Integer.valueOf(st.nextToken());
		sb.append(S*2-R1);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new R2().solution();
	}
	
}
