package model.heroes;

public class Knight extends Hero implements ICanBeHero {

	public void modifyStrength() {
		strength=(int)((strength+1)/1.2);
		strength++;
		strength*=1.2;
	}
	
	public void modifyDefence() {
		defence=(int)((defence+1)/1.1);
		defence++;
		defence*=1.1;
	}
	
	protected void modifyIntelligence() {
		intelligence++;
	}
	
	public void modifyDextirity() {
		dextirity=(int)((dextirity+1)/1.05);
		dextirity++;
		dextirity*=1.05;
	}
	
	public void modifyAgility() {
		agility=(int)((agility+1)/1.02);
		agility++;
		agility*=1.02;
	}
	
	public void modifySpeed() {
		speed=(int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
	}
}
