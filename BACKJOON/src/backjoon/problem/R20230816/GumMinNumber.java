package backjoon.problem.R20230816;

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
 * @category 수학, 구현, 브루트포스 알고리즘
 * @updatedAt 김선우, 2023.08.16(문제풀이)
 * {@summary} 가장 큰 금민수(가장 큰 금민수 구하기)
 * - 입력 : 첫째줄 - 수
 * https://www.acmicpc.net/problem/1259
 */
public class GumMinNumber {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		
		for(int i = N; i > 0; i--) {
			String strNum = String.valueOf(i);
			boolean contain = strNum.contains("0") ||
							strNum.contains("1") ||
							strNum.contains("2") ||
							strNum.contains("3") ||
							strNum.contains("5") ||
							strNum.contains("6") ||
							strNum.contains("8") ||
							strNum.contains("9");
			if(!contain) {
				N = i;
				break;
			}
		}
		
		bw.write(N + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new GumMinNumber().solution();
	}
	
}
