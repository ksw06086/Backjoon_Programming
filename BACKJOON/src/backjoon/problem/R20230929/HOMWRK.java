package backjoon.problem.R20230929;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.09.29(문제풀이)
 * {@summary} HOMWRK(숙제 도와주기)
 * - 입력 : 1째줄 - 테스트 케이스 수, n-1째줄 - 문제 수, n-m-1~k줄 - 두 수
 * https://www.acmicpc.net/problem/18398
 */
public class HOMWRK {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		
		while(n-- > 0) {
			int examCnt = Integer.valueOf(br.readLine());
			while(examCnt-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken());
				int b = Integer.valueOf(st.nextToken());
				
				sb.append((a+b) + " " + (a*b) + "\n");
			}
		}
		
		bw.write(sb+ "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new HOMWRK().solution();
	}
	
}
