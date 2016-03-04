import java.util.Scanner;

public class BuildAdventure {

	public static void main(String[] args) {
		String[] mageSpells = { "Fireball", "Arcane Explosion", "Wand" };
		String[] warriorSpells = { "Taunt", "Attack", "Shield Block" };
		String[] priestSpells = { "Lesser heal", "Greater heal", "Holy Nova" };
		String[] partyMembers = new String[4];
		int health = 100;
		String[] backpack = { "Empty Bottle", "20 gold" };
		Scanner scanner = new Scanner(System.in);
		String adventurerName = "RANDY";
		String heroClass = "MAGE";
		String direction;

		System.out.println("Hello Adventurer, What's your name?");
		adventurerName = scanner.next();
		adventurerName.toUpperCase();
		System.out.println("\"" + adventurerName + "\"" + "? That\'s a weird name. Let\'s call you RANDY.");
		adventurerName = "RANDY";

		System.out.println();
		System.out.println("So " + adventurerName + ", What class do you want to be? MAGE, WARRIOR, or PRIEST?");
		heroClass = scanner.next();
		heroClass.toUpperCase();
		if (!heroClass.equals(heroClass)) {
			System.out.println("Eh, I think you'd be better off as a MAGE");
			heroClass = "MAGE";
		}
		System.out.println("Yeah, that's a good fit.");
		System.out.println();

		System.out.println("Ok " + adventurerName + " the " + heroClass
				+ ". Here's the deal. The dragon has taken the high speed internet and is holding it hostage.");
		System.out.println(
				"Find the four other warriors, the magic weapon, and the castle - defeat the dragon, win the game");
		System.out.println();

		System.out.println("Here are your spells:");
		for (int i = 0; i < mageSpells.length; i++) {
			System.out.print(mageSpells[i] + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Here's whats in your backpack:");
		for (int i = 0; i < backpack.length; i++) {
			System.out.print(backpack[i] + ", ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Ready? First Choice: Left or Right?");
		direction = scanner.next().toUpperCase();
		switch (direction) {
		case "LEFT":
			System.out.println("You fell in a hole, game over.");
			System.exit(1);
		case "RIGHT":
			System.out.println("Nice! You found Kyle! He said becareful about going left.");
			partyMembers[0] = "Kyle";
			break;
		default:
			System.out.println("No cheating.");
			System.exit(1);
		}
		System.out.println();
		System.out.println("From here on out, you'll have more choices. You can go LEFT, RIGHT, or STRAIGHT.");
		System.out.println(
				"You can also type HEALTH at the beginning of a turn to see your health or PARTY to see who is in your party.");
		System.out.println();
		System.out.println("Which way?");

		direction = scanner.next().toUpperCase();
		while (direction.equals("HEALTH") || direction.equals("PARTY")) {
			switch (direction) {
			case "HEALTH":
				System.out.println("You have " + health + " HP.");
				break;
			case "PARTY":
				System.out.print("Party Members: ");
				for (int i = 0; i < partyMembers.length; i++) {
					if (partyMembers[i] != null) {
						System.out.print(partyMembers[i] + ",");
					}
				}
				break;
			default:
				break;
			}
			System.out.println();
			System.out.println("What now?");
			direction = scanner.next().toUpperCase();
		}

			switch (direction) {
			case "LEFT":
				System.out.println("You fell in a hole, game over.");
				System.exit(1);
			case "RIGHT":
				System.out.println("Nice! You found Kyle! He said becareful about going left.");
				partyMembers[0] = "Kyle";
				break;
			default:
				System.out.println("No cheating.");
				System.exit(1);
			}
		
	}
}
