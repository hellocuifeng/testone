package javaDomo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("(<[^>]*>)");
		System.out.print("输入你要匹配的字符串:");
		Matcher matcher = pattern.matcher(scanner.nextLine());
		boolean found = false;
		while (matcher.find()) {
			System.out.println("输出：" + matcher.group());
			found = true;
		}
		if (!found) {
			System.out.println("没匹配到！");
		}
		scanner.close();
	}
}