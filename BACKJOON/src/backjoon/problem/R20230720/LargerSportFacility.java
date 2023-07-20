package backjoon.problem.R20230720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.20
 * 최초 변경일 : 2023.07.20
 * 목적 : 16099번 - Larger Sport Facility(어느 경기장이 크냐?)
 * 개정 이력 : 김선우, 2023.07.20(문제풀이)
 * 저작권 : 김선우
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
