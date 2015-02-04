package CharacterClasses;

public class SimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePlayer a = new SimplePlayer(5, "Warrior");
		SimpleEnemy b = new SimpleEnemy(3, "generic");
		
		SimpleBattle s = new SimpleBattle(a,b);
		s.fight();
	}

}
