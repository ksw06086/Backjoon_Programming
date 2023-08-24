package backjoon.problem.R20230824;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.24(문제풀이)
 * {@summary} Identifying Tea(음미해서 티의 번호 정답을 맞춘 사람이 몇명인가여)
 * 배열에서 특정 값이 몇개 들었는지 확인
 * - 입력 : 첫째줄 - 정답의 티 번호 / 둘째줄 - 5명이 말한 정답
 * https://www.acmicpc.net/problem/11549
 */
public class IdentifyingTea {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = 5;
		String teaNum = br.readLine();
		String str[] = new String[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			str[i] = st.nextToken();
		}
		
		bw.write(Collections.frequency(Arrays.asList(str), teaNum) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new IdentifyingTea().solution();
	}
	
}
