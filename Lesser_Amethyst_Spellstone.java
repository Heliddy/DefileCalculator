package Defile;

import java.util.ArrayList;

public class Lesser_Amethyst_Spellstone extends Spell{
	public Lesser_Amethyst_Spellstone() {
		this.mana=4;
		this.damage=3;
		this.name="小型法术石";
	}
	public Lesser_Amethyst_Spellstone(Minion m,ArrayList<Minion> board,int n){
		this.mana=4;
		this.damage=3;
		this.dealDamage(m,board,n);
	}
}
