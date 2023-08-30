package backjoon.problem.R20230830;

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
 * @category 수학, 구현, 애드 혹
 * @updatedAt 김선우, 2023.08.30(문제풀이)
 * {@summary} FA(X의 첫자리수, X의 자리 수 곱을 반복했는데 마지막에 입력값과 결과값이 같은 수라면 FA 출력)
 * - 입력 : 1째줄 - X
 * https://www.acmicpc.net/problem/14935
 */
public class FA {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String FA = br.readLine();
		
		bw.write("FA");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new FA().solution();
	}
	
}
