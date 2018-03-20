package Defile;

import java.util.ArrayList;

public class Voidlord extends Minion {
	public Voidlord() {
		this(9);
	}

	public Voidlord(int attack, int blood) {
		if (blood == 0) {
			this.blood = 9;
		} else {
			this.blood = blood;
		}
		if (attack == 0) {
			this.attack = 3;
		} else {
			this.attack = attack;
		}
		this.mana = 9;
		this.name = "VoildLord";
		this.exist = true;
		this.sleep = false;
		this.deathrattle = true;
		this.taunt = true;
		this.demon = true;
		this.MAXBLOOD = 9;
	}

	public Voidlord(int blood) {
		this.blood = blood;
		this.attack = 3;
		this.mana = 9;
		this.name = "VoildLord";
		this.exist = true;
		this.sleep = false;
		this.deathrattle = true;
		this.taunt = true;
		this.demon = true;
		this.MAXBLOOD = 9;
	}

	@Override
	public void deathrattle(ArrayList<Minion> board, int n) {
		int mgn=0;
		for(int i=0;i<board.size();i++) {
			if(board.get(i).name.equals("MalGanis")) {
				mgn++;
			}
		}	
		if (!this.alive) {
			board.remove(n);
			board.add(n, new Voidwalker(1+mgn*2,3+mgn*2, true));
			for (int j = 1; j <= 2; j++) {
				for (int i = 0; i < board.size(); i++) {
					if (!board.get(i).exist) {
						board.remove(i);
						board.add(n, new Voidwalker(1+mgn*2,3+mgn*2, true));

						break;
					}
				}
			}
		}
	}

}