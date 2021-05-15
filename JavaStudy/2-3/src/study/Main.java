package study;
/**
*
* 本課題では、継承・オーバーロードメソッドの基本的な使い方を学んでいきましょう。
* 課題は問①から問③まであります。
* 指定された値と変数名を守って記述してください。
*
* @author s.nanaumi
*/
public class Main {
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        // ③ Taskクラスのインスタンスを生成し、「doTask()」メソッドを呼び出しなさい。
        Task dotask = new Task();
        System.out.println("plusメソッドの引数が一つの場合:" + dotask.plus(1));
        System.out.println("plusメソッドの引数が二つの場合:" + dotask.plus(1,2));
        System.out.println("plusメソッドの引数が三つの場合:" + dotask.plus(1,2,3));
    }

}
