package monsters;

import bases.Monster;

public class Oak extends Monster{
	public Oak(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(170, 230);
		offensive = utils.Dice.get(9, 15);
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
