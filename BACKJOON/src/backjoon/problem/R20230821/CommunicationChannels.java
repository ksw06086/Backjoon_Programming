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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.21(문제풀이)
 * {@summary} Communication Channels(알파벳이 각각 몇개 있을까?)
 * - 입력 : 첫째줄 - 문자열
 * https://www.acmicpc.net/problem/11121
 */
public class CommunicationChannels {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			String output = st.nextToken();
			
			if(input.equals(output)) { sb.append("OK").append("\n"); }
			else { sb.append("ERROR").append("\n"); }
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CommunicationChannels().solution();
	}
	
}
