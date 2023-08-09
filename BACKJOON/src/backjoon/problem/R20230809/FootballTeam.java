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
 * @category 문자열, 구현
 * @updatedAt 김선우, 2023.08.09(문제풀이)
 * {@summary} Football Team(픗볼 팀 이름을 잘못 작성함)
 * - 입력 : 첫째줄 - 배에 탈 인원 수
 * https://www.acmicpc.net/problem/5358
 */
public class FootballTeam {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String name = br.readLine();
			if(name == null) { break; }
			for(int i = 0; i < name.length(); i++) {
				switch (name.charAt(i)) {
				case 'i': sb.append('e'); break;
				case 'e': sb.append('i'); break;
				case 'I': sb.append('E'); break;
				case 'E': sb.append('I'); break;
				default: sb.append(name.charAt(i)); break;
				}
			}
			sb.append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new FootballTeam().solution();
	}
	
}
