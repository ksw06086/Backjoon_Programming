package backjoon.problem.R20230719;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.19
 * 최초 변경일 : 2023.07.19
 * 목적 : 15733번 - 나는 누구인가(I'm Sexy 출력)
 * 개정 이력 : 김선우, 2023.07.19(문제풀이)
 * 저작권 : 김선우
 */
public class Whoami {
	private void solution() throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("I'm Sexy");
		bw.flush();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Whoami().solution();
	}
}