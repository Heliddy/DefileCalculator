package Defile;

import java.util.ArrayList;

public class Spell {
	int mana;
	int damage;
	String name;
	boolean AOE=false;
	
	
	public void dealDamage(Minion m,ArrayList<Minion> board,int n) {
		m.blood-=this.damage;
		m.refresh();
		m.replace(n,board);
	}
}
