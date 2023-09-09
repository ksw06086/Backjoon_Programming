package backjoon.problem.R20230909;

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
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.09.09(문제풀이)
 * {@summary} FYI(전화번호의 앞 3자리가 555인지 확인)
 * - 입력 : 1째줄 - 전화번호 7자리    
 * https://www.acmicpc.net/problem/17863
 */
public class FYI {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String phoneNumber = br.readLine();
		String res = "";
		
		if(phoneNumber.substring(0, 3).equals("555")) {
			res = "YES";
		} else {
			res = "NO";
		}
		
		bw.write(res + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new FYI().solution();
	}
	
}
