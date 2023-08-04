package backjoon.problem.R20230728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현
 * @updatedAt 김선우, 2023.07.28(문제풀이)
 * {@summary} 코딩은 체육과목 입니다.(바이트 크기에 맞는 자료형 출력)
 * - 입력 : 첫째줄 - 바이트 크기 입력
 * https://www.acmicpc.net/problem/25314
 */
public class CodingIsSports {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int byteSize = Integer.parseInt(br.readLine());
		String str = "long ";
		
		bw.write(str.repeat(byteSize/4) + "int");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CodingIsSports().solution();
	}
}