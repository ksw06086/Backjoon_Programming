package backjoon.problem.R20230904;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현
 * @updatedAt 김선우, 2023.09.04(문제풀이)
 * {@summary} CASIO(송찬이가 원하는 배터리를 선생님이 가져오셨나?)
 * - 입력 : 1째줄 - 송찬이가 원하는 배터리 종류, 선생님이 가져온 배터리 종류
 * https://www.acmicpc.net/problem/15963
 */
public class CASIO {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String wantBattery = st.nextToken();
		String teacherBattery = st.nextToken();
		
		if(wantBattery.equals(teacherBattery)) sb.append("1");
		else sb.append("0");
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CASIO().solution();
	}
	
}
