package backjoon.problem.R20230910;

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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.09.10(문제풀이)
 * {@summary} Piece of Cake!(가장 큰 케이크 조각의 부피)
 * - 입력 : 1째줄 - n, h, v
 * https://www.acmicpc.net/problem/17874
 */
public class PieceOfCake {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int h = Integer.valueOf(st.nextToken());
		int v = Integer.valueOf(st.nextToken());
		
		int result = Math.max(h, n-h)*Math.max(v, n-v)*4;
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PieceOfCake().solution();
	}
	
}
