package backjoon.problem.R20230803;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.03(문제풀이)
 * {@summary} 모음의 개수(a,i,u,e,o 개수 출력)
 * - 입력 : 첫째줄~ - 문자열, 마지막줄 - #
 * https://www.acmicpc.net/problem/1264
 */
public class VowelsCount {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine().toLowerCase();
			if(str.equals("#")) { break; }
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
					case 'a': case 'i': case 'u': case 'e': case 'o':
						count++;
				}
			}
			sb.append(count).append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new VowelsCount().solution();
	}
	
}
