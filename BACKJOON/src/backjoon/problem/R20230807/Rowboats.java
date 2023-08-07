package backjoon.problem.R20230807;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.07(문제풀이)
 * {@summary} Fill the Rowboats!(6명 탄 후 Go를 외치자)
 * - 입력 : 첫째줄 - 배에 탈 인원 수
 * https://www.acmicpc.net/problem/5300
 */
public class Rowboats {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			sb.append(i).append(" ");
			if(i%6 == 0 || i == N) { sb.append("Go!").append(" "); }
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Rowboats().solution();
	}
	
}
