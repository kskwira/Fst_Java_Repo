package model.heroes;

public class Mage extends Hero implements ICanBeHero {
	
	protected void modifyStrength() {
		strength++;
	}
	
	protected void modifyDefence() {
		defence++;
	}
	
	public void modifyIntelligence() {
		intelligence=(int)((intelligence+1)/1.2);
		intelligence++;
		intelligence*=1.2;
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
	
	protected void modifySpeed() {
		speed++;
	}
}
