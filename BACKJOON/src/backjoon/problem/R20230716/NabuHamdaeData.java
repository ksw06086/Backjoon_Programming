package backjoon.problem.R20230716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 최초 작성자 : 김선우
 * 최초 작성일 : 2023.07.16
 * 최초 변경일 : 2023.07.16
 * 목적 : 9654번 - 나부 함대 데이터(나부 함대 데이터 출력)
 * 개정 이력 : 김선우, 2023.07.16(문제풀이)
 * 저작권 : 김선우
 */
public class NabuHamdaeData {
	private void solution() throws Exception {
		System.out.println("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE");
		System.out.println("N2 Bomber      Heavy Fighter  Limited    21        ");
		System.out.println("J-Type 327     Light Combat   Unlimited  1         ");
		System.out.println("NX Cruiser     Medium Fighter Limited    18        ");
		System.out.println("N1 Starfighter Medium Fighter Unlimited  25        ");
		System.out.println("Royal Cruiser  Light Combat   Limited    4         ");
	}
	
	public static void main(String[] args) throws Exception {
		new NabuHamdaeData().solution();
	}
}
