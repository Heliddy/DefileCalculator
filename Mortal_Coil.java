package Defile;

import java.util.ArrayList;

public class Mortal_Coil extends Spell{
	public Mortal_Coil() {
		this.mana=1;
		this.damage=1;
		this.name="ËÀ²ø";
	}
	public Mortal_Coil(Minion m,ArrayList<Minion> board,int n){
		this.mana=1;
		this.damage=1;
		this.dealDamage(m,board,n);
	}
}
