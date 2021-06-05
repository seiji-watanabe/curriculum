package study;

//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;

/**
* 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
*
* 問①〜問③まであります。
* 全て回答し、課題にある画像と同じ表示になるようにしてください。
*
*/

public class Study {

	public static void main(String[] args) {
		/* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
         */
		String fruitsName =FruitsConstants.FRUITS_LEMON_04;
		Integer FruitsAmount = FruitsConstants.FRUITS_COUNT_20;
		System.out.println("食べ物は" + fruitsName);
		System.out.println(FruitsAmount  + "個");
	}

}
