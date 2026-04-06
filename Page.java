package tool;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;

/**
 * HTMLファイルの先頭と末尾を出力する
 */
public class Page {
	
	/**
	 * ヘッダー（先頭）を出力する
	 * @param out	PrintWriter
	 */
	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0' charset='UTF-8'>");
		out.println("<link rel='stylesheet' href='../css/standard.css'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
	}

	/**
	 * ヘッダー（先頭）を出力する
	 * @param out	PrintWriter
	 */
	public static void header(HttpServletRequest request, PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0' charset='UTF-8'>");
		out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/css/standard.css'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
	}
	
	/**
	 * フッター（末尾）を出力する
	 * @param out	PrintWriter
	 */
	public static void footer(PrintWriter out) {
		out.println("<script src='../script/tools.js' charset='UTF-8'></script>");
		out.println("</body>");
		out.println("</html>");
	}
	
	/**
	 * フッター（末尾）を出力する
	 * @param out	PrintWriter
	 */
	public static void footer(HttpServletRequest request, PrintWriter out) {
		out.println("<script src='" + request.getContextPath() + "/script/tools.js' charset='UTF-8'></script>");
		out.println("</body>");
		out.println("</html>");
	}
}