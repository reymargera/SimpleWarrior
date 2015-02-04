package CharacterClasses;
import java.util.ArrayList;


public class SimpleNPC extends SimpleCharacter{
	protected ArrayList<String> quests;
	protected String saying;
	protected boolean activeQuest;
	
	////////////////////////Constructors/////////////////////////////
	public SimpleNPC(){
		
	}
	public SimpleNPC(String saying){
		this.saying = saying;
	}
	public SimpleNPC(ArrayList<String> quests, String saying, boolean aq){
		this.quests = quests;
		this.saying = saying;
		this.activeQuest = aq;
	}
	
	////////////////////////NPC Mehtods///////////////////////////
	public void interatction(){
		if(!activeQuest){
			System.out.println(saying);
		}
		else
			System.out.println("quest sayig");
	}
}
