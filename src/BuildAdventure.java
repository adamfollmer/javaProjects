import java.util.Scanner;

public class BuildAdventure {

	public static void main(String[] args) {
		String[] mageSpells = { "FIREBALL", "ARCANE_EXPLOSION", "PYROBLAST" };
		String[] warriorSpells = { "TAUNT", "ATTACK", "SHIELD BLOCK" };
		String[] rogueSpells = { "SHIV", "ALAKHAZAM", "STEALTH" };
		String[] partyMembers = new String[4];
		int health = 100;
		int level = 1;
		int dragonHealth = 600;
		int bossDamage;
		String[] backpack = { "Empty Bottle", "20 gold" };
		Scanner scanner = new Scanner(System.in);
		String adventurerName = "RANDY";
		String heroClass = "MAGE";
		String direction;
		String currentSpell;

		System.out.println("Hello Adventurer, What's your name?");
		adventurerName = scanner.next();
		adventurerName.toUpperCase();
		System.out.println("\"" + adventurerName + "\"" + "? That\'s a weird name. Let\'s call you RANDY.");
		adventurerName = "RANDY";

		System.out.println();
		System.out.println("So " + adventurerName + ", What class do you want to be? MAGE, WARRIOR, or ROGUE?");
		heroClass = scanner.next();
		heroClass.toUpperCase();
		if (!heroClass.equals("MAGE")) {
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
			partyMembers[0] = "KYLE";
			break;
		default:
			System.out.println("No cheating. You Lose");
			System.exit(1);
		}
		System.out.println();
		System.out.println("From here on out, you'll have more choices. You can go LEFT, RIGHT, or STRAIGHT.");
		System.out.println("At the beginning of a turn you can also type: ");
		System.out.println(
				"HEALTH to see your health, PARTY to see your party memebers, or LEVEL to see your current level");
		System.out.println();
		System.out.println("Which way?");

		direction = scanner.next().toUpperCase();
		while (direction.equals("HEALTH") || direction.equals("PARTY") || direction.equals("LEVEL")) {
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
			case "LEVEL":
				System.out.println(level);
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
			System.out.println("You ate some bad food, game over.");
			System.exit(1);
		case "RIGHT":
			System.out.println("You encountered a monster! I hope you remembered the names of your spells, go!:");
			currentSpell = scanner.next().toUpperCase();
			if (currentSpell.equals(mageSpells[0])) {
				System.out.println("Nice! One Shot! You leveled up!");
				level++;
			} else if (currentSpell.equals(mageSpells[1])) {
				System.out.println("That took a while. You took 25 damage but you leveled up!");
				level++;
				health = health - 25;
			} else if (currentSpell.equals(mageSpells[2])) {
				System.out.println("You got 'em but you hurt yourself too. You took 50 damage but you leveled up!");
				level++;
				health = health - 50;
			} else {
				System.out.println("Something went wrong. You lost the battle and died");
				System.exit(1);
			}
			break;
		case "STRAIGHT":
			System.out.println("You seem to be getting closer to the dragon");
			break;
		default:
			System.out.println("No cheating. You Lose");
			System.exit(1);
		}
		System.out.println();
		System.out.println("Still Here? Nice! You found Kenny, too!");
		partyMembers[1] = "KENNY";
		System.out.println();
		System.out.println("Whats next? (Reminder: HEALTH, PARTY, LEVEL, LEFT, RIGHT, STRAIGHT)");
		System.out.println();

		direction = scanner.next().toUpperCase();
		while (direction.equals("HEALTH") || direction.equals("PARTY") || direction.equals("LEVEL")) {
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
			case "LEVEL":
				System.out.println(level);
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
			System.out.println("You took an arrow to the knee, game over.");
			System.exit(1);
		case "STRAIGHT":
			System.out.println(
					"You encountered many weak monsters! I hope you remembered the names of your spells, go!:");
			currentSpell = scanner.next().toUpperCase();
			if (currentSpell.equals(mageSpells[0])) {
				System.out.println("It took some time to get them all. You took 25 damage but you leveled up!");
				level++;
				health = health - 25;
			} else if (currentSpell.equals(mageSpells[1])) {
				System.out.println("Nice choice! You took no damage and you leveled up!");
				level++;
			} else if (currentSpell.equals(mageSpells[2])) {
				System.out.println("You got 'em but you hurt yourself too. You took 50 damage but you leveled up!");
				level++;
				health = health - 50;
			} else {
				System.out.println("Something went wrong. You lost the battle and died");
				System.exit(1);
			}
			break;
		case "RIGHT":
			System.out.println("The castle is up ahead!");
			break;
		default:
			System.out.println("No cheating. You Lose");
			System.exit(1);
		}
		if (health <= 0) {
			System.out.println("You took too much damage on your journey and died.");
			System.exit(1);
		}
		System.out.println();
		System.out.println("We found STAN and CARTMAN! All you need is the sword now.");
		partyMembers[2] = "STAN";
		partyMembers[3] = "CARTMAN";
		System.out.println("STAN said KENNY - a ROGUE - has a special ability to open the chest where the sword lies.");
		System.out.println("CARTMAN found the chest earlier and places it on the ground");
		System.out.println();
		System.out.println("It's rigged to explode if the lock isn't properly picked.");
		System.out.println("Have KENNY help you and enter the key words:");
		currentSpell = scanner.next().toUpperCase();
		if (currentSpell.equals(rogueSpells[1])) {
			System.out.println("Phew! Nice work! You leveled up!");
			System.out.println("The Sword of a Thousand Truths is in your possession! You feel stronger.");
			level++;
		} else {
			System.out.println("You killed Kenny! Game over!");
			System.exit(1);
		}
		System.out.println();
		System.out.println(
				"Take some time to catch your breath. Go ahead and look through HEALTH, PARTY, or , LEVEL if your curious.");
		direction = scanner.next().toUpperCase();
		while (direction.equals("HEALTH") || direction.equals("PARTY") || direction.equals("LEVEL")) {
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
			case "LEVEL":
				System.out.println(level);
				break;
			default:
				break;
			}
			System.out.println();
			System.out.println("What now?");
			direction = scanner.next().toUpperCase();
		}
		System.out.println();
		System.out.println();
		System.out.println("The dragon flies down from the castle. It's time for the final fight, good luck.");
		System.out.println("Select your attack:");

		currentSpell = scanner.next().toUpperCase();
		if (currentSpell.equals(mageSpells[0])) {
			bossDamage = level * 200;
			System.out.println("You did " + bossDamage + " damage to the dragon!");
			dragonHealth = dragonHealth - bossDamage;
		} else if (currentSpell.equals(mageSpells[1])) {
			bossDamage = level * 100;
			System.out.println("You did " + bossDamage + " damage to the dragon");
			dragonHealth = dragonHealth - bossDamage;
		} else if (currentSpell.equals(mageSpells[2])) {
			bossDamage = level * 500;
			System.out.println("You did " + bossDamage + " damage to the dragon");
			dragonHealth = dragonHealth - bossDamage;
		} else {
			System.out.println("Something went wrong. You lost the battle and died");
			System.exit(1);
		}

		if (dragonHealth <= 0) {
			System.out.println("You beat the dragon and won the game!");
		} else {
			System.out.println("The dragon attacks!");
			health = health - 100;
			System.out.println("You (and Kenny) died. Try to get more levels or using a more powerful spell.");
			System.exit(1);
		}
	}
}
