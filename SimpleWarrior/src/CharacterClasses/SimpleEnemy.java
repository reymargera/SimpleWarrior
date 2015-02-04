package CharacterClasses;
import java.util.ArrayList;
import java.util.Random;


public class SimpleEnemy extends SimpleCharacter{
	
	protected String type;
	
	SimpleEnemy(int level, ArrayList<String> moves, String name){
		this.level = level;
		this.moves = moves;
		this.name = name;
	}
	
	SimpleEnemy(int level, String type){
		this.level = level;
		this.type = type;
		setStats(type);
	}
	
	public void modifyAttack(int a){
		attack += a;
	}
	public void modifyDefense(int d){
		defense+= d;
	}
	public void modifyHP(int h){
		hp += h;
	}
	
	public void setStats(String type){
		Random r = new Random();
		if(type.equals("generic")){
			this.attack = this.level + (r.nextInt(5) + 1);
			this.defense = this.level + (r.nextInt(3) + 1);
			this.health = this.level * (r.nextInt(3) + 7);
			this.hp = this.health;
		}
	}
	
}
