package Defile;

import java.util.ArrayList;

public class Amethyst_Spellstone extends Spell{
	public Amethyst_Spellstone() {
		this.mana=4;
		this.damage=5;
		this.name="中型法术石";
	}
	public Amethyst_Spellstone(Minion m,ArrayList<Minion> board,int n){
		this.mana=4;
		this.damage=5;
		this.dealDamage(m,board,n);
	}
}
