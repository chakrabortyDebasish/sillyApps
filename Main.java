import java.util.*;

public class Main {
    public static void main(String[] args) {
		
		System.out.println("Welcome to the World");
		System.out.println("Enter Player Name :");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		System.out.println("Hello "+name+" !! All the Best !!");
		
		System.out.println("\t<<--Shall we Start the Game-->>");
		System.out.println("\t1.Yes\t2.No");
		int ch = sc.nextInt();
		
		while(ch!=1) {
			
			System.out.println("<---One Eternity Later--->");
			System.out.println("\t<<--Shall we Now Start the Game-->>");
			System.out.println("\t1.Yes\t2.No");
			ch = sc.nextInt();
			
		}
		
		sc.close();
		Random rnNumber = new Random();
		int x = rnNumber.nextInt(20) + 1;
		System.out.println("Guess the Numebr :-");
		int userVal = sc.nextInt();
		
		int chance =0;
		boolean win = false, finish = false;
		
		while(!finish) {
			
			chance++;
			
			if(chance<5) {
				if(userVal == x) {
					win = true;
					finish = true;
				}else if(userVal < x) {
					System.out.println("Guess Higher !!");
					userVal = sc.nextInt();
				}else {
					System.out.println("Guess Lower !!");
					userVal = sc.nextInt();
				}
			}else {
				finish = true;
			}
		}
		
		if(win) {
			System.out.println("!! Congratulation You Are the WINNER !!\nNumber of attempts to win :"+chance);
		}else {
			System.out.println("!! Do Dooo Dooo !!\n!! GAME OVER !!");
		}
	}
}