package study;
//① TaskクラスにCalculatorクラスを継承させなさい。

/**
 * タスクの実行
 */
public class Task extends Calculator {
 // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
    // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    public int  plus(int a) {
        return 11;
    }
    
    public int plus(int a, int b) {
        return 30;
    }
    
    public int plus(int a,int b,int c) {
        return 60;
    }
    
}
