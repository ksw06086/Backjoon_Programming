package backjoon.problem.R20230812;

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
 * @category 수학, 구현
 * @updatedAt 김선우, 2023.08.12(문제풀이)
 * {@summary} Next in line(장남의 나이)
 * - 입력 : 첫째줄 - 막내 나이, 둘째줄 - 중간 나이
 * https://www.acmicpc.net/problem/6749
 */
public class NextInLIne {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int lowAge = Integer.valueOf(br.readLine());
		int middleAge = Integer.valueOf(br.readLine());
		
		sb.append((middleAge-lowAge) + middleAge);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new NextInLIne().solution();
	}
	
}
