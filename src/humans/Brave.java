package humans;

import bases.Human;
public class Brave extends Human {
	
	public Brave(String name, String weapon) {
		super(name,weapon);
	    hp = utils.Dice.get(170, 230);
	    offensive = utils.Dice.get(7, 13);
		
}	

}
