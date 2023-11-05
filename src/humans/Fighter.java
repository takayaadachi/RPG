package humans;

import bases.Human;
public class Fighter extends Human {
	
	public Fighter(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(240, 300);
		offensive = utils.Dice.get(17, 23);
		
	}
	
	

}