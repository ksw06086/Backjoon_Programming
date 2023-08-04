package backjoon.problem.R20230713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.13
 * 최초 변경일 : 2023.07.13
 * 목적 : 4101번 - 크냐?(어떤 수가 더 큰지 비교)
 * 개정 이력 : 김선우, 2023.07.13(문제풀이)
 * 저작권 : 김선우
 */
public class CompareMax {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String cur = br.readLine();
			StringTokenizer st = new StringTokenizer(cur);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0)
				break;
			if(a>b)
				sb.append("Yes\n");
			else
				sb.append("No\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws Exception {
		new CompareMax().solution();
	}
}