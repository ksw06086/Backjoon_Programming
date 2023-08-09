package backjoon.problem.R20230809;

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
 * @updatedAt 김선우, 2023.08.09(문제풀이)
 * {@summary} 방학숙제(픗볼 팀 이름을 잘못 작성함)
 * - 입력 : 첫째줄 - 입실 기록 수, 둘째줄~ - 입실 기록
 * https://www.acmicpc.net/problem/5532
 */
public class VacationHomework {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int vacationDate = Integer.valueOf(br.readLine());
		int korTotalPage = Integer.valueOf(br.readLine());
		int mathTotalPage = Integer.valueOf(br.readLine());
		int korFinishDay = (int) Math.ceil(korTotalPage/(Integer.valueOf(br.readLine())*1.0));
		int mathFinishDay = (int) Math.ceil(mathTotalPage/(Integer.valueOf(br.readLine())*1.0));
		
		sb.append(vacationDate - ((korFinishDay > mathFinishDay)?korFinishDay:mathFinishDay));
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new VacationHomework().solution();
	}
	
}
