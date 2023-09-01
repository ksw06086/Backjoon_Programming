package backjoon.problem.R20230831;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.31(문제풀이)
 * {@summary} Every Second Counts(택시 탄 초 구하기)
 * - 입력 : 1째줄 - 고객 탑승 시간 / 2째줄 - 고객 나간 시간 
 * https://www.acmicpc.net/problem/15080
 */
public class EverySecondCounts_LocalTime {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String startTime = br.readLine();
		String endTime = br.readLine();
		
		int startSecond = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("H : m : s")).toSecondOfDay();
		int endSecond = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("H : m : s")).toSecondOfDay();
		
		int result = 0;
		if(startSecond < endSecond) { result = endSecond - startSecond; }
		else { result = endSecond - startSecolnd + 86400; }
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new EverySecondCounts_LocalTime().solution();
	}
	
}
