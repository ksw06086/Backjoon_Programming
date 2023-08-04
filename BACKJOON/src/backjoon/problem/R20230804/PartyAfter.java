package backjoon.problem.R20230804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현
 * @updatedAt 김선우, 2023.08.04(문제풀이)
 * {@summary} 파티가 끝나고 난 뒤(파티안에 사람 수가 기사랑 얼마나 차이나는지)
 * - 입력 : 첫째줄 - 1m당 사람 수, 총 길이, 둘째줄 - 기사 5개별 총 인원
 * https://www.acmicpc.net/problem/2845
 */
public class PartyAfter {
	private void solution() throws Exception {
		final int NEWS_LENGTH = 5;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int SanggeunCount = Integer.valueOf(st.nextToken()) * Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < NEWS_LENGTH; i++) {
			int newsCount = Integer.valueOf(st.nextToken());
			sb.append(newsCount - SanggeunCount).append(" ");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PartyAfter().solution();
	}
	
}
