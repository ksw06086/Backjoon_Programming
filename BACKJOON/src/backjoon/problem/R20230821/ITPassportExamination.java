package backjoon.problem.R20230821;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 구현, 사칙연산
 * @updatedAt 김선우, 2023.08.21(문제풀이)
 * {@summary} IT Passport Examination(시험 합격했는지?)
 * - 입력 : 첫째줄 - 후보 수 / 둘째줄~ - 후보정보, 전략점수, 관리점수, 기술점수
 * https://www.acmicpc.net/problem/11257
 */
public class ITPassportExamination {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String number = st.nextToken();
			int strategy = Integer.valueOf(st.nextToken());
			int management = Integer.valueOf(st.nextToken());
			int technology = Integer.valueOf(st.nextToken());
			
			sb.append(number + " " + (strategy+management+technology) + " ");
			if(strategy < 35*0.3 || management < 25*0.3 || technology < 40*0.3 || strategy+management+technology < 55)
				sb.append("FAIL\n");
			else
				sb.append("PASS\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ITPassportExamination().solution();
	}
	
}
