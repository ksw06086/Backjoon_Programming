package backjoon.problem.R20230903;

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
 * @updatedAt 김선우, 2023.09.03(문제풀이)
 * {@summary} 이칙연산(세수 줄 때 *, / 한 번씩 사용해서 가장 큰 수 만들기)
 * - 입력 : 1째줄 - a,b,c
 * https://www.acmicpc.net/problem/15726
 */
public class BasicOperations {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.valueOf(st.nextToken());
		double b = Double.valueOf(st.nextToken());
		double c = Double.valueOf(st.nextToken());
		
		if((a*b)/c > (a/b)*c) sb.append((int)((a*b)/c));
		else sb.append((int)((a/b)*c));
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new BasicOperations().solution();
	}
	
}
