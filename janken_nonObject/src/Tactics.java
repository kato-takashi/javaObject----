/*
 * ジャンケン戦略インターフェース
 */
public interface Tactics {
	/*
	 * 先約を読み、ジャンケンの手を得る。
	 * クーチョキパーのいずれかをPlayewクラスに定義された以下の定数で返す。
	 * Player.STONE
	 * Player.SCISSORS
	 * Player.PAPER
	 * @return ジャンケンの手
	 */
	public int readTactics();
}
