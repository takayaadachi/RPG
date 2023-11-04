package humans;

import bases.Human;
public class Wizard extends Human {
	
	public Wizard(String name, String weapon) {
		super(name,weapon);
		
		hp = utils.Dice.get(120, 180);
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