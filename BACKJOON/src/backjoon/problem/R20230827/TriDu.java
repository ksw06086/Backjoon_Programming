package backjoon.problem.R20230827;

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
 * @updatedAt 김선우, 2023.08.27(문제풀이)
 * {@summary} Tri-du(카드게임 이길 수 있는 숫자는?)
 * - 입력 : 1째줄 - 내가 뽑은 카드 2장
 * https://www.acmicpc.net/problem/13597
 */
public class TriDu {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int first = Integer.valueOf(st.nextToken());
		int second = Integer.valueOf(st.nextToken());
		int result = 0;
		
		if(first == second) {
			result = first;
		} else {
			result = first>second?first:second;
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TriDu().solution();
	}
	
}
