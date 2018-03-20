package Defile;

import java.util.ArrayList;

public class MalGanis extends Minion{
	public MalGanis(int attack,int blood) {
		if(blood==0) {
			this.blood = 7;
		}else {
			this.blood = blood;
		}
		
		if(attack==0) {
			this.attack = 9;
		}else {
			this.attack = attack;
		}
		this.mana = 9;
		this.name = "MalGanis";
		this.exist=true;
		this.sleep=false;
		this.deathrattle=true;
		this.demon=true;
		this.MAXBLOOD=9;
	}

	@Override
	public void deathrattle(ArrayList<Minion> board,int n) {
		
		if(!this.alive) {
			board.remove(n);
			board.add(new Minion());
			for(int i=0;i<board.size();i++) {
				if(board.get(i).exist&&board.get(i).demon) {
					if(board.get(i).blood>=board.get(i).MAXBLOOD) {
						board.get(i).blood=board.get(i).MAXBLOOD;
						board.get(i).attack-=2;
					}else {
						board.get(i).attack-=2;
					}
				}
			}
	}
}
	
}
