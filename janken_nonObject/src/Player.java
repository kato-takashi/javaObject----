//じゃんけんのプレイヤーを表すクラス
public class Player {
	//じゃんけんの手を表す定数
	public static final int STONE = 0;//グー
	public static final int SICCORS = 1;//チョキ
	public static final int PAPER = 2;//パー
	//プレイヤークラスの属性
	/************
	 * 
	 */
	//プレイヤーの名前
	private String name_;
	
	//プレイヤーの勝った回数
	private int winCount_=0;
	
//	与えられた戦略
	private Tactics tactics_;
//	プレイヤーに戦略を渡す。
//	@param tactics 戦略
	void setTactics(Tactics tactics){
		tactics_ = tactics;
	}
	//プレイヤークラスの操作
	/************
	 * 
	 */
	/**
	 * プレイヤークラスのコンストラクタ。
	 * 
	 * @param name 名前
	 */
	public Player(String name)
	{
		this.name_ = name;
	}
	//ジャンケンの手をだす。@return ジャンケンの手
	public int showHand(){
		//与えられた戦略を読んでジャンケンの手を決める
		int hand = tactics_.readTactics();
		return hand;
	}
	//審判から勝敗を聞く
	/*
	 * @param result true:勝ち, false:負け
	 */
	public void notifiResult(boolean result){
		if(true == result){
			winCount_+=1;
		}
	}
	//自分の勝った回数を答える。@return 買った回数
	/************ 
	 */
	public int getWinCount(){
		return winCount_;
	}
	//自分の名前を答える　@return 名前
	public String getName(){
		return name_;
	}
}
