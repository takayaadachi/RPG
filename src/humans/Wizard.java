package humans;

import bases.Human;
public class Wizard extends Human {
	
	public Wizard(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(120, 180);
		offensive = utils.Dice.get(12, 18);
		
	}
	
	

}