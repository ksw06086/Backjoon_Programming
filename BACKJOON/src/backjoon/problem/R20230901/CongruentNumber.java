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
 * {@summary} Congruent Numbers(삼각형의 넓이가 정수인지 확인)
 * - 입력 : 1째줄 - p1, q1, p2, q2
 * https://www.acmicpc.net/problem/15128
 */
public class CongruentNumber {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long p1 = Long.valueOf(st.nextToken());
		long q1 = Long.valueOf(st.nextToken());
		long p2 = Long.valueOf(st.nextToken());
		long q2 = Long.valueOf(st.nextToken());
		long congruentNumber = (p1*p2)%(q1*q2*2);
		
		int res = 0;
		if(congruentNumber == 0) { res = 1; }
		
		bw.write(res + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CongruentNumber().solution();
	}
	
}
