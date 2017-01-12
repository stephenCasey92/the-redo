public class BlackJack {

	public static void main(String[] args) {

		int playerA = 21;
		int playerB = 21;

		if (playerA < 21 && playerB > 21) {
			System.out.println("Player B bust, player A wins");

		} else if (playerB < 21 && playerA > 21) {
			System.out.println("Player A, you lose, go home.");

		} else if (playerA < 21 && playerB < 21) {

			if (playerA > playerB) {
				System.out.println("player A, Higher hand, you win");
			} else if (playerB > playerA) {
				System.out.println("player B, good hand, you win");

			}
		} else if (playerA > 21 && playerB > 21) {
			System.out.println("you both lose!");
		}

		if (playerA == 21) {
			System.out.println("BLACKJACK!!");
		}
		if (playerB == 21) {
			System.out.println("BLACKJACK!!");
		}
		if (playerA == 21 && playerB == 21) {
			System.out.println("YOU BOTH HAVE BLACKJACK!!");

		}

	}
}
