package CharacterClasses;

import java.util.ArrayList;


public class SimpleCharacter {
	protected int level;
	protected int health;
	protected int attack; 
	protected int defense;
	protected int hp;
	protected ArrayList<String> moves;
	protected String name;
	
	///////////////////////////Various Constructors/////////////////////////////
	public SimpleCharacter(){
		
	}
	public SimpleCharacter(int level){
		this.level = level;
	}
	public SimpleCharacter(int level, ArrayList<String> moves) {
		this.level = level;
		this.moves = moves;
	}
	
	
	////////////////////////Character Info Methods//////////////////////////////
	public int getLevel(){
		return level;
	}
	public int getHealth() {
		return health;
	}
	public int getAttack(){
		return attack;
	}
	public int getDefense(){
		return defense;
	}
	public int getHP(){
		return hp;
	}
	public ArrayList<String> getMoves(){
		return moves;
	}
}
