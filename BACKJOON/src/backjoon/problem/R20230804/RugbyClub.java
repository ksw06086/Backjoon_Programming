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
 * {@summary} 럭비 클럽(성인인지 청소년인지 출력)
 * - 입력 : 첫째줄~ - 이름, 나이, 몸무게, 마지막줄 - # 0 0
 * https://www.acmicpc.net/problem/2083
 */
public class RugbyClub {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			if(name.equals("#")) { break; }
			if(Integer.valueOf(st.nextToken()) > 17 || Integer.valueOf(st.nextToken()) >= 80) {
				sb.append(name + " Senior").append("\n");
			} else {
				sb.append(name + " Junior").append("\n");
			}
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new RugbyClub().solution();
	}
	
}
