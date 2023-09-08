package backjoon.problem.R20230908;

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
 * @updatedAt 김선우, 2023.09.08(문제풀이)
 * {@summary} 욱 제(욱이 제를 이길 확률을 구해라)
 * - 입력 : 1째줄 - A, B    
 * https://www.acmicpc.net/problem/17356
 */
public class Wook_Je {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		double m = (b-a)/400;
		
		bw.write(1/(1+Math.pow(10, m)) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Wook_Je().solution();
	}
	
}
