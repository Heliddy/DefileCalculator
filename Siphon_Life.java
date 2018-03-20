package Defile;

import java.util.ArrayList;

public class Siphon_Life extends Spell{
	
	public Siphon_Life() {
		this.mana=2;
		this.damage=3;
		this.name="¿Ú";
	}
	public Siphon_Life(Minion m,ArrayList<Minion> board,int n){
		this.mana=2;
		this.damage=3;
		this.dealDamage(m,board,n);
	}
}
