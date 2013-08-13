
public class CycllicTactics implements Tactics{
	int hand = -1;
	public int readTactics(){
		hand = hand+1;
				if(hand>2){
					hand = -1;
				}
		return hand;
	}
}
