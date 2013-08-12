/**
 * オブジェクト指向によるジャンケンプログラム
 */
public class janken
{
	public static void main(String[] args){
		//審判（斉藤さん）のインスタンス生成
		Jadge saito = new Jadge();
//		プレイヤー1（村田さん）の生成
		Player murata = new Murata("村田さん");
//		プレイヤー2（山田さん）の生成
		Player yamada = new Yamada("山田さん");
//		村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}
}
