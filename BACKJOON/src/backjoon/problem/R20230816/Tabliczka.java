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
 * @category 수학
 * @updatedAt 김선우, 2023.08.16(문제풀이)
 * {@summary} Tabliczka(둘이서 최대한 차이 없이 쪼개기)
 * - 입력 : 첫째줄 - 가로, 세로 폭
 * https://www.acmicpc.net/problem/8674
 */
public class Tabliczka {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long width = Long.valueOf(st.nextToken());
		long height = Long.valueOf(st.nextToken());
		
		long mod = ((width*height)%2)*Math.min(width, height);
		
		bw.write(mod + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Tabliczka().solution();
	}
	
}
