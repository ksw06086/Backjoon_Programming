package backjoon.problem.R20230802;

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
 * @updatedAt �輱��, 2023.08.02(����Ǯ��)
 * {@summary} Ư���� �б� �̸�(�б� ��Ī���� ���ĸ�Ī ���)
 * - �Է� : ù°�� - �б���Ī
 * https://www.acmicpc.net/problem/27889
 */
public class UniqueSchoolName {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		if(str.equals("NLCS")) {
			bw.write("North London Collegiate School");
		}
		if(str.equals("BHA")) {
			bw.write("Branksome Hall Asia");
		}
		if(str.equals("KIS")) {
			bw.write("Korea International School");
		}
		if(str.equals("SJA")) {
			bw.write("St. Johnsbury Academy");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new UniqueSchoolName().solution();
	}
	
}
