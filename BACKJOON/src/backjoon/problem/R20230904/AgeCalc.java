package backjoon.problem.R20230904;

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
 * @category 구현, 수학, 사칙연산
 * @updatedAt 김선우, 2023.09.04(문제풀이)
 * {@summary} 나이 계산하기(나 몇살이니?(만나이, 세는나이, 연나이))
 * - 입력 : 1째줄 - 태어난 년월일 / 2째줄 - 기준 년월일
 * https://www.acmicpc.net/problem/16199
 */
public class AgeCalc {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer birth = new StringTokenizer(br.readLine());
		StringTokenizer now = new StringTokenizer(br.readLine());
		
		int myYear = Integer.valueOf(birth.nextToken());
		int myday = Integer.valueOf(birth.nextToken())*100 + Integer.valueOf(birth.nextToken());
		int nowYear = Integer.valueOf(now.nextToken());
		int nowday= Integer.valueOf(now.nextToken())*100 + Integer.valueOf(now.nextToken());
		
		if(myYear > nowYear) sb.append("0\n");
		else if(myYear < nowYear && myday <= nowday) sb.append(nowYear-myYear).append("\n");
		else sb.append(nowYear-myYear-1).append("\n");
		sb.append(nowYear-myYear+1).append("\n");
		sb.append(nowYear-myYear);
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new AgeCalc().solution();
	}
	
}
