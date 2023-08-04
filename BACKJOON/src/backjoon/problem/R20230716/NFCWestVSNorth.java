package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.16
 * 최초 변경일 : 2023.07.16
 * 목적 : 10170번 - NFC West vs North(NFC 서부 북부 디비전 순위 출력)
 * 개정 이력 : 김선우, 2023.07.16(문제풀이)
 * 저작권 : 김선우
 */
public class NFCWestVSNorth {
	private void solution() throws Exception {
		System.out.println("NFC West       W   L  T");
		System.out.println("-----------------------");
		System.out.println("Seattle        13  3  0");
		System.out.println("San Francisco  12  4  0");
		System.out.println("Arizona        10  6  0");
		System.out.println("St. Louis      7   9  0");
		System.out.println();
		System.out.println("NFC North      W   L  T");
		System.out.println("-----------------------");
		System.out.println("Green Bay      8   7  1");
		System.out.println("Chicago        8   8  0");
		System.out.println("Detroit        7   9  0");
		System.out.println("Minnesota      5  10  1");
	}
	
	public static void main(String[] args) throws Exception {
		new NFCWestVSNorth().solution();
	}
}