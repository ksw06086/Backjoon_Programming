package backjoon.problem.R20230904;

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
 * @category 구현
 * @updatedAt 김선우, 2023.09.04(문제풀이)
 * {@summary} Telemarketer or not?(텔레마케터의 번호냐 아니냐?)
 * - 입력 : 1째줄~4째줄 - 4자리 번호 
 * https://www.acmicpc.net/problem/16017
 */
public class TelemarketerOrNot {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nums[] = new String[4];
		for(int i = 0; i<nums.length; i++)
			nums[i] = br.readLine();
		
		String result = "answer";
		if(nums[0].equals("8") || nums[0].equals("9"))
			if(nums[3].equals("8") || nums[3].equals("9"))
				if(nums[1].equals(nums[2]))
					result = "ignore";
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new TelemarketerOrNot().solution();
	}
	
}
