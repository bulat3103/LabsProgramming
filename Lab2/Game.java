import ru.ifmo.se.pokemon.*;

public class Game {
	public static void main(String[] args) {
		Battle b = new Battle();
		b.addAlly(new Furfrou("Anton", 1));
		b.addFoe(new Kabuto("Sfjghjf", 1));
		b.go();
	}
}