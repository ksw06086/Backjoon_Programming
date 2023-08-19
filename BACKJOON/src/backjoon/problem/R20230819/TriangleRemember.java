package backjoon.problem.R20230819;

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
 * @category 구현, 기하학
 * @updatedAt 김선우, 2023.08.19(문제풀이)
 * {@summary} 삼각형 외우기(삼각형 상태 구분)
 * - 입력 : 첫째줄~셋째줄 - 한 각의 크기
 * https://www.acmicpc.net/problem/10101
 */
public class TriangleRemember {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		int c = Integer.valueOf(br.readLine());
		
		if(a == 60 && b == 60 && c == 60) { sb.append("Equilateral"); }
		else if(a+b+c == 180 && ( a == b || b == c || a == c)) { sb.append("Isosceles"); }
		else if(a+b+c == 180 && ( a != b && b != c && a != c)) { sb.append("Scalene"); }
		else { sb.append("Error"); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TriangleRemember().solution();
	}
	
}
