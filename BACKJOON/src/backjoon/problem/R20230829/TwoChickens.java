package backjoon.problem.R20230829;

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
 * @category 수학, 사칙연산, 구현
 * @updatedAt 김선우, 2023.08.29(문제풀이)
 * {@summary} 치킨 두 마리(...)(치킨 두 마리 사고 난 금액)
 * - 입력 : 1째줄 - A 께좌, B 계좌 / 2째줄 - 치킨 1마리 가격
 * https://www.acmicpc.net/problem/14489
 */
public class TwoChickens {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer bankMoney = new StringTokenizer(br.readLine());
		int NHBankMoney = Integer.valueOf(bankMoney.nextToken());
		int KBBankMoney = Integer.valueOf(bankMoney.nextToken());
		int twoChickens = Integer.valueOf(br.readLine())*2;
		
		int result = 0;
		if(NHBankMoney + KBBankMoney >= twoChickens) {
			result = NHBankMoney + KBBankMoney - twoChickens;
		} else {
			result = NHBankMoney + KBBankMoney;
		}
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TwoChickens().solution();
	}
	
}
