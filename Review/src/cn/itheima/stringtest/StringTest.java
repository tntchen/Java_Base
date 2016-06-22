package cn.itheima.stringtest;

/*
题目：
	编程列出一个字符串的全部字符组合情况。原始字符串中没有重复字符。
	例如：
	原始字符串是“abc”，打印得到下列所有组合情况：
	“a” “b” “c”
	"ab" "ac" "ba" "bc" "ca"  "cb" 
	"abc"  "acb"  "bac" "bca"  "cab" "cba"
                
 *思路：
 *1，发现组合的最小长度是单个字符，且就是原始字符串的每个字符，而最长长度则和字符串一样
 *2，每行新组合都是在前一行旧组合的基础上，将每个旧组合与原始字符串中每个不同字符单独组合一次，获得新组合
 *3，新一行组合有多少个，无法马上确定，因为都是字符串，
 *        所以可以先用StringBuilder接收每个新组合，最后再切割获得每个新组合
 * */

public class StringTest {
	public static void main(String[] args) {
		// 调用方法，传入字符串
		show("abcd");
	}

	// 编写方法，接收字符串
	public static void show(String str) {

		// 将原始字符串转成原始字符数组
		char[] chs = str.toCharArray();
		// 获得原始字符串数组，即每个字符串只有一个字符
		String[] strs = chsToStrs(chs);
		// 按指定格式输出原始字符串数组，即单个字符的组合情况
		printString(strs);
		// x为每行单个字符串的长度，第一行已经输出，所以从2开始，最长为原始字符串长度，循环输出每行组合
		for (int x = 2; x <= str.length(); x++) {
			// 调用方法，传入 原始字符数组 和 前一次的字符串数组，获得新的字符串数组
			strs = addChar(chs, strs);
			// 按指定格式输出新的字符串数组
			printString(strs);
		}
	}

	// 定义方法，接收 原始字符数组 和 前一次的字符串数组，并返回新字符串数组
	public static String[] addChar(char[] chs, String[] oldStrs) {
		// 因为新字符数组长度暂时无法确定，也为了转换方便，所以使用StringBuilder来接收每个新字符串
		StringBuilder sb = new StringBuilder();
		// 定义新字符串数组
		String[] newStrs = null;
		// 外循环，遍历每个字符串数组
		for (int x = 0; x < oldStrs.length; x++) {
			// 内循环，遍历每个原始字符，将每个字符串把每个不同字符都单独添加一次
			for (int y = 0; y < chs.length; y++) {
				// 判断字符串是否包含该字符，通过indexOf()的返回值>=0来确定已包含
				if (oldStrs[x].indexOf(chs[y]) >= 0)
					// 已包含该字符，则不操作，继续下次循环
					continue;
				// 不包含该字符，则添加该字符
				String s = oldStrs[x] + chs[y];
				// 添加新字符串到StringBuilder对象并用','隔开
				sb.append(s).append(',');
			}
		}
		// 删除StringBuilder对象最后的一个','，并转成字符串，再将字符串按','切割，获得新字符串数组
		newStrs = sb.deleteCharAt(sb.length() - 1).toString().split(",");
		// 返回新字符串数组
		return newStrs;
	}

	// 将指定字符串数组按指定格式输出并换行
	public static void printString(String[] strs) {
		for (String s : strs) {
			System.out.print("\"" + s + "\"");
		}
		System.out.println();
	}

	// 将指定字符数组转成字符串数组，即每个字符串只有一个字符，并返回
	public static String[] chsToStrs(char[] chs) {
		// 字符串数组长度和字符数组长度一致
		String[] strs = new String[chs.length];
		for (int x = 0; x < chs.length; x++)
			// 将单个字符转成单个字符的字符串
			strs[x] = chs[x] + "";
		return strs;
	}
}
