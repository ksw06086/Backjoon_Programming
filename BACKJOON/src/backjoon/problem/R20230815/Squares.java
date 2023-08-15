package backjoon.problem.R20230815;

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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.08.15(문제풀이)
 * {@summary} Squares(한 변의 길이 구하기)
 * - 입력 : 첫째줄 - 타일의 개수
 * https://www.acmicpc.net/problem/6887
 */
public class Squares {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		
		int sideLength = (int) Math.sqrt(N);
		
		bw.write("The largest square has side length " + sideLength + ".");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Squares().solution();
	}
	
}
