package backjoon.problem.R20230804;

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
 * @category ����, ���ڿ�
 * @updatedAt �輱��, 2023.08.03(����Ǯ��)
 * {@summary} ������ ����(a,i,u,e,o ���� ���)
 * - �Է� : ù°��~ - ���ڿ�, �������� - #
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
