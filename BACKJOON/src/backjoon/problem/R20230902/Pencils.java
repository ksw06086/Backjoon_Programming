package backjoon.problem.R20230902;

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
 * @category 수학, 사칙연산
 * @updatedAt 김선우, 2023.09.02(문제풀이)
 * {@summary} Pencils(내가 원하는 연필 개수에 대한 최소 가격)
 * - 입력 : 1째줄 - 필요한 연필, a 연필 개수, a 연필 가격, b 연필 개수, b 연필 가격
 * https://www.acmicpc.net/problem/15474
 */
public class Pencils {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int aPenCnt = Integer.valueOf(st.nextToken());
		int aPenPrice = Integer.valueOf(st.nextToken());
		int bPenCnt = Integer.valueOf(st.nextToken());
		int bPenPrice = Integer.valueOf(st.nextToken());
		
		int aTotalPrice = (int) (aPenPrice * Math.ceil(n * 1.0 / aPenCnt));
		int bTotalPrice = (int) (bPenPrice * Math.ceil(n * 1.0 / bPenCnt));
		
		bw.write(Math.min(aTotalPrice, bTotalPrice) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Pencils().solution();
	}
	
}
