package Defile;

import java.util.ArrayList;

public class Greater_Amethyst_Spellstone extends Spell{
	public Greater_Amethyst_Spellstone() {
		this.mana=4;
		this.damage=7;
		this.name="中型法术石";
	}
	public Greater_Amethyst_Spellstone(Minion m,ArrayList<Minion> board,int n){
		this.mana=4;
		this.damage=7;
		this.dealDamage(m,board,n);
	}
}
