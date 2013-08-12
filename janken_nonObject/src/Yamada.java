/*
 * プレイヤーを継承した村田さんクラス
 */
public class Yamada extends Player{
	/*
	 * コンストラクタ
	 * @param name 名前
	 */
	public Yamada(String name) {
//		スーパークラスからコンストラクタを呼び出す
		super(name);
	}
	/*
	 * ジャンケンの手をだす
	 * スーパークラスの同名メソッドをオーバーライドしてる
	 * @return ジャンケンの手
	 */
	public int showHand(){
//		必ずパーを出す
		return PAPER;
	}

}
