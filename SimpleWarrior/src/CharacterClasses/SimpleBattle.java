package CharacterClasses;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleBattle {

	private SimplePlayer a;
	private SimpleEnemy b;
	public SimpleBattle(SimplePlayer a, SimpleEnemy b) {
		this.a = a;
		this.b = b;
	}
	
	public void getPlayerStats() {
		System.out.println("Player Stats:");
		System.out.println("\tPlayer Level: " + a.getLevel());
		System.out.println("\tPlayer Health: " + a.getHealth());
		System.out.println("\tPlayer Attack: " + a.getAttack());
		System.out.println("\tPlayer Defense: " + a.getDefense());
	}
	
	public void getEnemyStats() {
		System.out.println("Enemy Stats:");
		System.out.println("\tEnemy Level: " + b.getLevel());
		System.out.println("\tEnemy Health: " + b.getHealth());
		System.out.println("\tEnemy Attack: " + b.getAttack());
		System.out.println("\tEnemy Defense: " + b.getDefense());
	}
	
	public void playerAttack() {
		b.modifyHP((-1 * a.getAttack()) + b.getDefense());
	}
	
	public void enemyAttack() {
		a.modifyHP((-1 * b.getAttack()) + a.getDefense());
	}

	public void fight() {
		KeyListener k;
		getPlayerStats();
		getEnemyStats();
		while(true) {
			//if(keyPressed()){
				System.out.println("\n\n");
				System.out.println("Player attacks and deals " + a.attack + " damage (" + b.defense + " damage absorbed)");
				playerAttack();
				if(b.getHP() > 0)
					System.out.println("Enemy current HP: " + b.hp);
				else {
					System.out.println("Player defeated enemy");
					break;
				}
				System.out.println("Enemy attacks and deals " + b.attack + " damage (" + a.defense + " damage absorbed)");
				enemyAttack();
				if(a.getHP() > 0)
					System.out.println("Player current HP: " + a.hp);
				else {
					System.out.println("Enemy defeated player");
				}
			//}
		}
		
		System.out.println("Fight Ended");
	}
	
	public Boolean keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
			return true;
		return false;
	}
}
