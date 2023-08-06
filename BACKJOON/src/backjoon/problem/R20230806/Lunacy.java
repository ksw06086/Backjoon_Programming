package backjoon.problem.R20230806;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.06(문제풀이)
 * {@summary} Lunacy(지구와 달의 무게 차이)
 * - 입력 : 첫째줄~ - 지구의 무게, 마지막줄 - -1.0
 * https://www.acmicpc.net/problem/4714
 */
public class Lunacy {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			double n = Double.valueOf(br.readLine());
			if(n < 0.0) { break; }
			sb.append(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.", n, n*0.167)).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Lunacy().solution();
	}
	
}
