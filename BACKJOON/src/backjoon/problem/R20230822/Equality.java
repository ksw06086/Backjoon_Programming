package backjoon.problem.R20230822;

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
 * @category 수학, 문자열, 사칙연산
 * @updatedAt 김선우, 2023.08.22(문제풀이)
 * {@summary} Equality(하나의 식이 맞는 식인지 확인)
 * - 입력 : 첫째줄 - 식
 * https://www.acmicpc.net/problem/13985
 */
public class Equality {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.valueOf(st.nextToken());
		String op = st.nextToken();
		int b = Integer.valueOf(st.nextToken());
		String eq = st.nextToken();
		int c = Integer.valueOf(st.nextToken());
		int res = 0;
		
		if(op.equals("+")) {
			res = a + b;
		} else if(op.equals("-")) {
			res = a - b;
		} else if(op.equals("*")) {
			res = a * b;
		} else if(op.equals("/")) {
			res = a / b;
		}
		
		if(res == c) { sb.append("YES"); }
		else { sb.append("NO"); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Equality().solution();
	}
	
}
