package backjoon.problem.R20230731;

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
 * @category ����, �ùķ��̼�
 * @updatedAt �輱��, 2023.07.31(����Ǯ��)
 * {@summary} ���?(�ʹ� �� �� ���� ���)
 * - �Է� : ù°�� - �ʹ� �����ð�, �� ���� 
 * https://www.acmicpc.net/problem/27294
 */
public class WhatCount {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int eatTime = Integer.parseInt(st.nextToken());
		int alcoholYN = Integer.parseInt(st.nextToken());
		
		if(eatTime >= 12 && eatTime <= 16 && alcoholYN == 0) {
			bw.write("320");
		} else {
			bw.write("280");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new WhatCount().solution();
	}
	
}
