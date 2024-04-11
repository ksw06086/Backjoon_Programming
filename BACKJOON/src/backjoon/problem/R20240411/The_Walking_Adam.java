package backjoon.problem.R20240411;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author swkim
 * @category 구현, 문자열
 * @updatedAt 김선우, 2024.02.29(문제풀이)
 * {@summary} The Walking Adam
 * https://www.acmicpc.net/problem/18698
 */
public class The_Walking_Adam {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String str = br.readLine();
			int pos = str.indexOf('D');
			
			if(pos == -1)
				sb.append(str.length()).append("\n");
			else
				sb.append(pos).append("\n");
		}
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new The_Walking_Adam().solution();
	}
	
}
