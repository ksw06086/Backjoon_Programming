package backjoon.problem.R20230826;

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
 * @category 수학 사칙연산
 * @updatedAt 김선우, 2023.08.26(문제풀이)
 * {@summary} Do Not Touch Anything(CCTV 몇 개 필요한가?)
 * - 입력 : 1째줄 - R, C, N(대회장 가로, 세로 / CCTV 크기) 
 * https://www.acmicpc.net/problem/13136
 */
public class DoNotTouchAnything {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double R = Double.valueOf(st.nextToken());
		double C = Double.valueOf(st.nextToken());
		double N = Double.valueOf(st.nextToken());
		
		long RCCTV = (long) Math.ceil(R/N);
		long LCCTV = (long) Math.ceil(C/N);
		
		bw.write((RCCTV * LCCTV) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new DoNotTouchAnything().solution();
	}
	
}
