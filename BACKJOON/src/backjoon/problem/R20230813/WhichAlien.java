package backjoon.problem.R20230813;

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
 * @category 구현
 * @updatedAt 김선우, 2023.08.13(문제풀이)
 * {@summary} Which Alien?(에일리언 종류 알아내기)
 * - 입력 : 첫째줄 - 외계인 안테나 수, 둘째줄 - 외계인 눈 수
 * https://www.acmicpc.net/problem/6778
 */
public class WhichAlien {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int antenna = Integer.valueOf(br.readLine());
		int eye = Integer.valueOf(br.readLine());
		
		if(antenna >= 3 && eye <= 4) {
			sb.append("TroyMartian").append("\n");
		}
		if(antenna <= 6 && eye >= 2) {
			sb.append("VladSaturnian").append("\n");
		}
		if(antenna <= 2 && eye <= 3) {
			sb.append("GraemeMercurian").append("\n");
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new WhichAlien().solution();
	}
	
}
