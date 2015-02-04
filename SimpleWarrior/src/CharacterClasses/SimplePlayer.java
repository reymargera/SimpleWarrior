package CharacterClasses;
import java.util.Random;


public class SimplePlayer extends SimpleCharacter{

	protected String playerClass;
	
	////////////////////////Constructors////////////////////////
	public SimplePlayer(int level, String playerClass){
		this.level = level;
		this.playerClass = playerClass;
		setStartingStats();
	}
	
	///////////////////////Modification Stats//////////////////
	public void modifyAttack(int a){
		attack += a;
	}
	public void modifyDefense(int d){
		defense += d;
	}
	public void modifyHP(int h){
		hp += h;
	}
	public void modifyHealth(int h){
		health += h;
	}
	public void levelUp(){
		level++;
		Random r = new Random();
		switch(playerClass){
			case "Warrior":
				break;
			case "Wizard":
				break;
			case "Archer":
				break;
			case "Assasin":
				break;
			case "Priest":
				break;
		}	
	}
	public void setStartingStats(){
		Random r = new Random();
		switch(playerClass){
			case "Warrior":
				this.attack = level + r.nextInt(7) + 1;
				this.defense = level + r.nextInt(5) + 1;
				this.health = level * (r.nextInt(3) + 9);
				this.hp = this.health;
				break;
			case "Wizard":
				break;
			case "Archer":
				break;
			case "Assasin":
				break;
			case "Priest":
				break;
		}	
	}
}
