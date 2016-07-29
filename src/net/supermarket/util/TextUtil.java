package net.supermarket.util;

public final class TextUtil {
	public static String firstToUpperCase(String args) {
		String result = "set";
		String[] data = args.toLowerCase().split("_");
		for (int i = 0; i < data.length; i++) {
			char[] ch = data[i].toCharArray();
			ch[0] -= 32;
			result += String.valueOf(ch);
		}
		return result;
	}
}
