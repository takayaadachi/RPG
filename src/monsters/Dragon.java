package monsters;

import bases.Monster;

public class Dragon extends Monster{
	public Dragon(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(270, 330);
		offensive = utils.Dice.get(12, 18);
		
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
