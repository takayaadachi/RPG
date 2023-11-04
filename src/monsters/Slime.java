package monsters;

import bases.Monster;

public class Slime extends Monster {
	public Slime(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(70, 130);
		offensive = utils.Dice.get(5, 11);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getWeapon() {
		return this.weapon;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getOffensive() {
		return this.offensive;
	}

}
