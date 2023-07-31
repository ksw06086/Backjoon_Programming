package backjoon.problem.R20230731;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 기하학, 사칙연산
 * @updatedAt 김선우, 2023.07.31(문제풀이)
 * {@summary} 직사각형(직사각형의 넓이 구하기)
 * - 입력 : 첫째줄 - A(세로길이), 둘째줄 - B(가로길이)
 * https://www.acmicpc.net/problem/27323
 */
public class Rectangle {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		bw.write(A*B + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Rectangle().solution();
	}
	
}
