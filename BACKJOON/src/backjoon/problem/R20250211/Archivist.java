package backjoon.problem.R20250211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 해당 년도 승리자 구하기
 * @updatedAt 김선우, 2025.02.11(문제풀이)
 * {@summary} Archivist
 * https://www.acmicpc.net/problem/19944
 */
public class Archivist {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Map<Integer, String> winners = new HashMap<>();
        
        winners.put(1995, "ITMO");
        winners.put(1996, "SPbSU");
        winners.put(1997, "SPbSU");
        winners.put(1998, "ITMO");
        winners.put(1999, "ITMO");
        winners.put(2000, "SPbSU");
        winners.put(2001, "ITMO");
        winners.put(2002, "ITMO");
        winners.put(2003, "ITMO");
        winners.put(2004, "ITMO");
        winners.put(2005, "ITMO");
        winners.put(2006, "PetrSU, ITMO");
        winners.put(2007, "SPbSU");
        winners.put(2008, "SPbSU");
        winners.put(2009, "ITMO");
        winners.put(2010, "ITMO");
        winners.put(2011, "ITMO");
        winners.put(2012, "ITMO");
        winners.put(2013, "SPbSU");
        winners.put(2014, "ITMO");
        winners.put(2015, "ITMO");
        winners.put(2016, "ITMO");
        winners.put(2017, "ITMO");
        winners.put(2018, "SPbSU");
        winners.put(2019, "ITMO");
		
		
		sb.append(winners.get(Integer.parseInt(br.readLine())));
		
		bw.write(sb + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new Archivist().solution();
	}
	
}
