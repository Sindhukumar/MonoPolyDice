import java.util.Random;

public class MonoPolyDice {
	public static void main(String args[]) {
		int d1, d2, count = 0;
		boolean isDouble = true;
		Random rand = new Random();
		while (isDouble) {
			d1 = 1 + rand.nextInt(6);
			d2 = 1 + rand.nextInt(6);
			System.out.println("User rolls " + d1 + " & " + d2);
			if (d1 == d2) {
				System.out.println("double");
				if (count == 2){
					System.out.println("Go to Jail");
					break;
				}
				else
					System.out.println("move " + (d1+d2) +" Spaces and Roll again getting...");
			} else {
				isDouble = false;
				System.out.println("move " + (d1+d2) + " Spaces and Stop");
			}
			count++;
		}}

}
