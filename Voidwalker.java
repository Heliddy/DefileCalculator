package Defile;

public class Voidwalker extends Minion{
	public Voidwalker(){
		this(3);
	}
	public Voidwalker(int attack,int blood) {
		
		if(blood==0) {
			this.blood = 3;
		}else {
			this.blood = blood;
		}
		if(attack==0) {
			this.attack = 1;
		}else {
			this.attack = attack;
		}
			
			this.mana = 1;
			this.name = "Voildwalker";
			this.exist=true;
			this.sleep=false;
			this.taunt=true;
			this.demon=true;
			this.MAXBLOOD=3;
	}
	public Voidwalker(int blood) {
		this.blood = blood;
		this.attack = 1;
		this.mana = 1;
		this.name = "Voildwalker";
		this.exist=true;
		this.sleep=false;
		this.taunt=true;
		this.demon=true;
		this.MAXBLOOD=3;
	}
	
	public Voidwalker(int attack,int blood,boolean sleep) {
		this.blood = blood;
		this.attack = attack;
		this.mana = 1;
		this.name = "Voildwalker";
		this.exist=true;
		this.sleep=sleep;
		this.taunt=true;
		this.demon=true;
		this.MAXBLOOD=3;
	}
	
	
}
