package backjoon.problem.R20230821;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.21(문제풀이)
 * {@summary} 특별한 날(2월 18일 전후인지 출력)
 * - 입력 : 첫째줄 - 월 / 둘째줄 - 일
 * https://www.acmicpc.net/problem/10768
 */
public class SpecialDay {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int month = Integer.valueOf(br.readLine());
		int day = Integer.valueOf(br.readLine());
		
		if(month*30+day == 78) { sb.append("Special"); }
		else if(month*30+day < 78) { sb.append("Before"); }
		else { sb.append("After"); }
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new SpecialDay().solution();
	}
	
}
