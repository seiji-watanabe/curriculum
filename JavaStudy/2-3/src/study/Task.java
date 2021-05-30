package study;
//① TaskクラスにCalculatorクラスを継承させなさい。

/**
 * タスクの実行
 */
public class Task extends Calculator {
	// ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
    // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
	public void doTask() {
		System.out.println("plusメソッドの引数が１つの場合:" + super.plus(10));
		System.out.println("plusメソッドの引数が２つの場合:" + super.plus(10,20));
		System.out.println("plusメソッドの引数が３つの場合:" + super.plus(10,20,30));
		
		 
	}

}
