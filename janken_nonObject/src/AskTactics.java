import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AskTactics implements Tactics {
	public int readTactics(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nジャンケンの手を入力してください。");
		System.out.println("0:　グー");
		System.out.println("1:　チョキ");
		System.out.println("2:　パー");
		System.out.println("?");
		int hand = 0;
		
		while(true){
			try{
//				入力文字列を受け取る
				String inputStr = br.readLine();
//				入力文字列を数値に変換する
				hand = Integer.parseInt(inputStr);
				if(hand == Player.STONE || hand == Player.SICCORS || hand == Player.PAPER){
					break;
				}else{
					System.out.println("入力が正しくありません。再度入力してください。");
				}
			}catch(Exception ex){
				System.out.println("入力が正しくありません。再度入力してください。");
				System.out.println("?");
			}
		}
		
		return hand;
	}
}
