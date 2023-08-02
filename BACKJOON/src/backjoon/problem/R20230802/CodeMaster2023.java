package backjoon.problem.R20230802;

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
 * @updatedAt 김선우, 2023.08.02(문제풀이)
 * {@summary} 코드마스터 2023(선창하면 후창 출력)
 * - 입력 : 첫째줄 - 선창
 * https://www.acmicpc.net/problem/28235
 */
public class CodeMaster2023 {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		if(str.equals("SONGDO")) { bw.write("HIGHSCHOOL"); }
		if(str.equals("CODE")) { bw.write("MASTER"); }
		if(str.equals("2023")) { bw.write("0611"); }
		if(str.equals("ALGORITHM")) { bw.write("CONTEST"); }
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new CodeMaster2023().solution();
	}
	
}
