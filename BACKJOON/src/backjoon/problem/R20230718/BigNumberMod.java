package backjoon.problem.R20230718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.18
 * 최초 변경일 : 2023.07.18
 * 목적 : 14928번 - 큰 수(큰 수<10^1000000>를 나눈 나머지 구해라)
 * 개정 이력 : 김선우, 2023.07.18(문제풀이)
 * 저작권 : 김선우
 */
public class BigNumberMod {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*BigInteger N = new BigInteger(br.readLine());
		BigInteger birth = new BigInteger("20000303");		
		System.out.println(N.remain(birth));*/
		
		// 나머지 연산이 위로 하면 매우 길어서 시간초과가 걸림
		// 그래서 문자열로 나누어서 하는 방식으로 실행해주어야 시간초과가 안됨
		// 1. remain * 10 : 자리수 올려줌
		// 2. '0'을 뺀 이유 : charAt을 쓰면 문자열이 출력되니 문자열 '0'을 빼서 숫자로 만들어줌
		//                  '1'은 49, '0'은 48임
		String N = br.readLine();
		long remain = 0;
		for(int i = 0; i < N.length(); i++) {
			remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		bw.write(remain + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new BigNumberMod().solution();
	}
}
