package backjoon.problem.R20230725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.25
 * ���� ������ : 2023.07.25
 * ���� : 23235�� - The Fastest Sorting Algorithm In The World(���� �˰���)
 * ���� �̷� : �輱��, 2023.07.25(����Ǯ��)
 * ���۱� : �輱��
 */
public class SortingAlgorithm {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if(n == 0) { break; }
			List<Integer> arr = new ArrayList<Integer>();
			while(n-- > 0) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			sb.append("Case " + cnt++ + ": Sorting... done!").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SortingAlgorithm().solution();
	}
}
