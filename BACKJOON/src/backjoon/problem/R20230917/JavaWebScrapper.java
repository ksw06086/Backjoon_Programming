package backjoon.problem.R20230917;

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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @author swkim
 * @category 구현, 문자열
 * @updatedAt 김선우, 2023.09.12(문제풀이)
 * {@summary} Basketball One-on-One(문자열로 주는 게임 결과 점수 계산해서 승리자 구하기)
 * - 입력 : 1째줄 - 각 게임 팀별 점수를 하나의 문자열로 입력받음
 * https://www.acmicpc.net/problem/18198
 */
public class JavaWebScrapper {
	private void solution() {
		String url = "https://newsroom.daewoong.co.kr/archives/13618";
		
		// JSOUP 라이브러리를 통해 사이트 접속되면, 그 사이트의 전체 HTML소스 저장할 변수
		Document doc = null;
		
		try {
			// 사이트 접속(http프로토콜만 가능, https 프로토콜은 보안상 안됨)
			doc = Jsoup.connect(url).get();
			Elements elements = doc.select("img[class^='wp-image-']");
			elements.stream().forEach(name -> System.out.println("img = " + name.attr("src")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		new JavaWebScrapper().solution();
	}
	
}
