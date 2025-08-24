public class CaseValue {

	public static void main(String[] args) {
		int num = 10;
		final int NUM = 100;

		switch (num) {
		case 'A' -> {}			//OK（char定数 → intに拡張）
		case (byte) 1 -> {}		// OK（byte定数 → intに拡張）
		case 10 -> {}			// OK（int定数）
		case NUM -> {}			// OK(NUMはint定数)
//      case num -> {}  	    // コンパイルエラー (変数は不可)
//      case 100L -> {}   		// コンパイルエラー（longは不可）
//      case 3.14 -> {}  		// コンパイルエラー（浮動小数は不可）
		default -> {}
		};
	}
}
