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
 * @category 수학, 구현
 * @updatedAt 김선우, 2023.08.17(문제풀이)
 * {@summary} Balwanek(눈덩이 만들기)
 * - 입력 : 첫째줄 - 쌓인 눈, 눈덩이 1개의 크기(L)
 * https://www.acmicpc.net/problem/8718
 */
public class Balwanek {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long maxSnow = Long.valueOf(st.nextToken());
		long oneSnow = Long.valueOf(st.nextToken());
		
		if(oneSnow * 7000 <= maxSnow * 1000) { sb.append(oneSnow * 7000); } 
		else if(oneSnow * 3500 <= maxSnow * 1000) { sb.append(oneSnow * 3500); } 
		else { sb.append(oneSnow * 1750); }
		
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Balwanek().solution();
	}
	
}
