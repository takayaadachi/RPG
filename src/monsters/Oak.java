package monsters;

import bases.Monster;

public class Oak extends Monster{
	public Oak(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(170, 230);
		offensive = utils.Dice.get(9, 15);
	}
	
	
}
