package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.16
 * 최초 변경일 : 2023.07.16
 * 목적 : 10699번 - 오늘 날짜(오늘 날짜를 YYYY-MM-DD로 출력)
 * 개정 이력 : 김선우, 2023.07.16(문제풀이)
 * 저작권 : 김선우
 */
public class Today {
	private void solution() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ZonedDateTime today = ZonedDateTime.now();
		System.out.println(today.format(formatter));
	}
	
	public static void main(String[] args) throws Exception {
		new Today().solution();
	}
}