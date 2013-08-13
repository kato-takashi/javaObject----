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
//		村田さんに渡す戦略クラスを生成する
		Tactics murataTactics = new CycllicTactics();
		murata.setTactics(murataTactics);
		
//		プレイヤー2（山田さん）の生成
		Player yamada = new Yamada("山田さん");
//		山田さんに渡す戦略クラスを生成する
		Tactics yamadaTactics = new RandomTactics();
		yamada.setTactics(yamadaTactics);
//		村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}
}
