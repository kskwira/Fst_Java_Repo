package model.heroes;

public class Archer extends Hero implements ICanBeHero {
	
	public void modifyStrength() {
		strength=(int)((strength+1)/1.05);
		strength++;
		strength*=1.05;
	}
	
	public void modifyDefence() {
		defence=(int)((defence+1)/1.05);
		defence++;
		defence*=1.05;
	}
	
	protected void modifyIntelligence() {
		intelligence++;
	}
	
	public void modifyDextirity() {
		dextirity=(int)((dextirity+1)/1.2);
		dextirity++;
		dextirity*=1.2;
	}
	
	public void modifyAgility() {
		agility=(int)((agility+1)/1.1);
		agility++;
		agility*=1.1;
	}
	
	public void modifySpeed() {
		speed=(int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
	}
}
