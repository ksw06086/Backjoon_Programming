package backjoon.problem.R20230818;

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
 * @category 수학, 구현, 기하학
 * @updatedAt 김선우, 2023.08.18(문제풀이)
 * {@summary} Quadrants(사분면 알아내기)
 * - 입력 : 첫째줄~ - x좌표, y좌표 / 마지막 - 0 0
 * https://www.acmicpc.net/problem/9772
 */
public class Quadrants {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double x = Double.valueOf(st.nextToken());
			double y = Double.valueOf(st.nextToken());
			if(x == 0.0 && y == 0.0) { sb.append("AXIS"); break; }
			
			if(x == 0 || y == 0) { sb.append("AXIS").append("\n"); }
			else if(x > 0 && y > 0) { sb.append("Q1").append("\n"); }
			else if(x < 0 && y > 0) { sb.append("Q2").append("\n"); }
			else if(x < 0 && y < 0) { sb.append("Q3").append("\n"); }
			else if(x > 0 && y < 0) { sb.append("Q4").append("\n"); }
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Quadrants().solution();
	}
	
}
