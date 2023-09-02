package backjoon.problem.R20230902;

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
 * @category 수학, 기하학
 * @updatedAt 김선우, 2023.09.02(문제풀이)
 * {@summary} Abbey Courtyard(공원의 한줄로 테두리를 감싸는 배선 길이)
 * - 입력 : 1째줄 - 공원의 넓이
 * https://www.acmicpc.net/problem/15610
 */
public class AbbeyCourtyard {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double n = Math.sqrt(Double.valueOf(br.readLine()));
		double result = n*4;
		
		
		bw.write(String.format("%.8f", result) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AbbeyCourtyard().solution();
	}
	
}
