package backjoon.problem.R20230721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.21
 * 최초 변경일 : 2023.07.21
 * 목적 : 16170번 - 오늘의 날짜는(오늘 날짜 출력<UTC+0 기준>)
 * 개정 이력 : 김선우, 2023.07.21(문제풀이)
 * 저작권 : 김선우
 */
public class Today {
	private void solution() throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy\nMM\ndd")) + "\n");
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Today().solution();
	}
}
