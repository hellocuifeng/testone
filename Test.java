package javaDomo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("(<[^>]*>)");
		System.out.print("������Ҫƥ����ַ���:");
		Matcher matcher = pattern.matcher(scanner.nextLine());
		boolean found = false;
		while (matcher.find()) {
			System.out.println("�����" + matcher.group());
			found = true;
		}
		if (!found) {
			System.out.println("ûƥ�䵽��");
		}
		scanner.close();
	}
}