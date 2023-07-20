package backjoon.problem.R20230720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.20
 * ���� ������ : 2023.07.20
 * ���� : 16099�� - Larger Sport Facility(��� ������� ũ��?)
 * ���� �̷� : �輱��, 2023.07.20(����Ǯ��)
 * ���۱� : �輱��
 */
public class LargerSportFacility {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long Tl = Long.parseLong(st.nextToken());
			long Tw = Long.parseLong(st.nextToken());
			long El = Long.parseLong(st.nextToken());
			long Ew = Long.parseLong(st.nextToken());
			
			if( El*Ew == Tl*Tw ) { sb.append("Tie").append("\n"); }
			else if( El*Ew > Tl*Tw ) { sb.append("Eurecom").append("\n"); }
			else { sb.append("TelecomParisTech").append("\n"); }
		}
		
		bw.write( sb + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new LargerSportFacility().solution();
	}
}
