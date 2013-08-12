/*
 * プレイヤーを継承した村田さんクラス
 */
public class Murata extends Player{
	/*
	 * コンストラクタ
	 * @param name 名前
	 */
	public Murata(String name) {
//		スーパークラスからコンストラクタを呼び出す
		super(name);
	}
	/*
	 * ジャンケンの手をだす
	 * スーパークラスの同名メソッドをオーバーライドしてる
	 * @return ジャンケンの手
	 */
	public int showHand(){
//		必ずグーを出す
		return STONE;
	}

}
