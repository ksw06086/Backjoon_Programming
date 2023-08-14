package backjoon.problem.R20230814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.08.14(문제풀이)
 * {@summary} I Speak TXTMSG(번역표를 사용하여 성인용 번역을 출력)
 * - 입력 : 첫째줄~ - 암호 / 마지막줄 - TTYL
 * https://www.acmicpc.net/problem/6841
 */
public class TXTMSG {
	private void solution() throws Exception {
		String shortForm[] = { "CU", ":-)", ":-(", ";-)", ":-P", "(~.~)", "TA", "CCC", "CUZ", "TY", "YW", "TTYL" };
		String translation[] = { "see you", "I’m happy", "I’m unhappy", "wink"
								, "stick out my tongue", "sleepy", "totally awesome"
								, "Canadian Computing Competition", "because"
								, "thank-you", "you’re welcome", "talk to you later" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		List<String> shortFormList = new ArrayList<>(Arrays.asList(shortForm));
		
		while(true) {
			String str = br.readLine();
			if(shortFormList.contains(str)) {
				if(shortFormList.indexOf(str) == shortForm.length-1) {
					sb.append(translation[shortFormList.indexOf(str)]).append("\n");
					break;
				} else {
					sb.append(translation[shortFormList.indexOf(str)]).append("\n");
				}
			} else {
				sb.append(str).append("\n");
			}	
		}
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TXTMSG().solution();
	}
	
}
