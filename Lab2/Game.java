import ru.ifmo.se.pokemon.*;

public class Game {
	public static void main(String[] args) {
		Battle b = new Battle();
		b.addAlly(new Furfrou("Anton", 1));
		b.addAlly(new Kabuto("Andrey", 1));
		b.addAlly(new Kabutops("Alex", 1));
		b.addFoe(new Poliwag("Baby", 1));
		b.addFoe(new Poliwhirl("Bob", 1));
		b.addFoe(new Poliwrath("Brett", 1));
		b.go();
	}
}