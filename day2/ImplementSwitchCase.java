package week1.day2;

public class ImplementSwitchCase {

	public static void main(String[] args) {
		
		String matchResult="Tied";
		
		switch (matchResult) {
		case "Win":
			System.out.println("Team A Won the match");
			break;
			
		case "Loss":
			System.out.println("Team A Loss the Match");
			break;
			
		case "Tied":
			System.out.println("Match has been Tied");
			break;
			
		default:
			System.out.println("Match is Abonded - No Result");

		}
	}
}