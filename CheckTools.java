package tool;

public class CheckTools {
	
	/**
	 * 未入力ではないかをチェックする
	 * @param str	入力された情報
	 * @return		真：入力されている、偽：未入力
	 */
	public static boolean check(String str) {
		// 真：入力されている、偽：未入力
		return !(str == null || "".equals(str));
	}
	
	/**
	 * 数値以外が入力されていないかチェックする
	 * @param num	String型の入力された数値
	 * @return		チェックの結果を返す(真：正しく入力されている、偽：数値以外が入力されている)
	 */
	public static boolean numCheck(String num) {
		// チェックの結果を返す(真：正しく入力されている、偽：数値以外が入力されている)
		return num.matches("^[0-9]+$");
	}
	
	/**
	 * 語頭、語尾についた半角、全角スペースをすべて取り除く
	 * @param str	入力された情報
	 * @return		半角、全角スペースを取り除いた文字列を返す
	 */
	public static String allTrim(String str) {
		// 戻り値生成
		String st = str;
		// 語頭、語尾についた半角、全角スペースをすべて取り除く
		st = st.replaceFirst("^[\\h]+", "").replaceFirst("[\\h]+$", "");
		// 半角、全角スペースを取り除いた文字列を返す
		return st;
	}
	
}
