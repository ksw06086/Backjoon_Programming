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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.14(문제풀이)
 * {@summary} 세제곱의 합(1~N의 세제곱의 합과 합의 제곱이 같은가?)
 * - 입력 : 첫째줄 - N
 * https://www.acmicpc.net/problem/28701
 */
public class ThreeSquare {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.valueOf(br.readLine());
		long sum = 0, square = 0, threeSquare = 0;
		
		for(int i = 1; i<=N; i++) {
			sum += i;
			square += i;
			threeSquare += i*i*i;
		}
		
		sb.append(sum).append("\n");
		sb.append(square*square).append("\n");
		sb.append(threeSquare).append("\n");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ThreeSquare().solution();
	}
	
}
