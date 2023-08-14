package backjoon.problem.R20230814;

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
 * @updatedAt 김선우, 2023.08.14(문제풀이)
 * {@summary} HI-ARC=?(HI-ARC 값 구하기)
 * - 입력 : 첫째줄 - H,I,A,R,C 값
 * https://www.acmicpc.net/problem/28444
 */
public class HI_ARC {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.valueOf(st.nextToken());
		int I = Integer.valueOf(st.nextToken());
		int A = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		sb.append(H*I - A*R*C);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new HI_ARC().solution();
	}
	
}
