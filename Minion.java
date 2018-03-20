package Defile;

import java.util.ArrayList;
import java.util.Objects;

public class Minion implements Cloneable {
	public int blood;
	public int MAXBLOOD;
	public int attack;
	public int mana;
	public String name = "Minion";
	public boolean alive = true;
	public boolean exist = false;
	public boolean sleep = true;
	boolean deathrattle = false;
	boolean taunt = false;
	boolean demon=false;
	int	spelldamage=0;
	 

	public Minion(int mana, int attack, int blood) {
		this.blood = blood;
		this.attack = attack;
		this.mana = mana;
		this.exist = true;
	}

	public void attack(ArrayList<Minion> boardF, int i, ArrayList<Minion> boardP, int j, Minion m) {
		if (!(boardP.get(0).taunt || boardP.get(1).taunt || boardP.get(2).taunt || boardP.get(3).taunt
				|| boardP.get(4).taunt || boardP.get(5).taunt || boardP.get(6).taunt)) {
			if ((!this.sleep) && this.exist && m.exist) {
				m.blood -= this.attack;
				this.blood -= m.attack;
				this.sleep = true;
			}
		} else {
			if ((!this.sleep) && this.exist && m.exist && m.taunt) {
				m.blood -= this.attack;
				this.blood -= m.attack;
				this.sleep = true;
			}
		}
	}

	public Minion(int blood, int attack, int mana, String name) {
		this.blood = blood;
		this.attack = attack;
		this.mana = mana;
		this.name = name;
		this.exist = true;

	}

	public Minion(int attack, int blood) {
		if(blood==0) {
			this.exist = false;
		}else {
			this.exist = true;
		}
		this.blood = blood;
		this.attack = attack;		
		this.sleep = false;
	};

	public Minion() {
	};

	public void refresh() {
		if (this.blood <= 0) {
			this.alive = false;
			this.exist = false;
		} else {
			this.alive = true;
		}
	}

	public void replace(int n, ArrayList<Minion> board) {
		if (this.alive == false && this.deathrattle == true) {
			this.deathrattle(board, n);
		}
		if (this.alive == false && this.deathrattle == false) {
			board.remove(n);
			board.add(board.size(), new Minion());
		}
		;
	}

	// 使用boardF上的,索引为i的随从,攻击boardP上的,索引为j的随从(即m)
	public void attackRefreshAndReplace(ArrayList<Minion> boardF, int i, ArrayList<Minion> boardP, int j, Minion m) {
		this.attack(boardF, i, boardP, j, m);
		this.refresh();
		this.replace(i, boardF);
		m.refresh();
		m.replace(j, boardP);

		/*
		 * tempF.get(k).attack(tempP.get(g),tempF,tempP); tempF.get(k).refresh();
		 * tempF.get(k).replace(k,tempF); tempP.get(g).refresh();
		 * tempP.get(g).replace(g,tempP);
		 */
	}

	public void deathrattle(ArrayList<Minion> board, int n) {
		board.set(n,  new Minion());
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (obj instanceof Minion) {
			Minion m = (Minion) obj;
			return (this.name == m.name && this.blood == m.blood && this.attack == m.attack && this.sleep == m.sleep
					&& this.taunt == m.taunt);
		}
		return false;
	}
	
	public int hashCode() {  
        return Objects.hash(name, blood,attack,sleep,taunt);  
    }  
	
	public Minion Cards(int attack,int blood,String name,boolean sleep) {
		if(name.equals("Voidlord")) {
			Minion m=new Voidlord(attack,blood);
			m.sleep=sleep;
			return m;
		}else if(name.equals("Voidwalker")) {
			Minion m=new Voidwalker(attack,blood);
			m.sleep=sleep;
			return m;
		}else if(name.equals("TauntMinion")){
			Minion m=new Minion(attack,blood);
			m.taunt=true;
			m.sleep=sleep;
			return m;
		}else if(name.equals("MalGanis")){
			Minion m=new MalGanis(attack,blood);
			m.sleep=sleep;
			return m;
		}else if(name.equals("Doomguard")) {
			Minion m=new Minion(attack,blood);
			if(blood==0) {
				m.blood = 7;
			}else {
				m.blood = blood;
			}
			
			if(attack==0) {
				m.attack = 5;
			}else {
				m.attack = attack;
			}
			m.mana = 5;
			m.name = "Doomguard";
			m.exist=true;
			m.MAXBLOOD=7;
			m.demon=true;
			m.sleep=sleep;
			return m;
		}else if(name.equals("Voidcaller")) {
			Minion m=new Minion(attack,blood);
			if(blood==0) {
				m.blood = 4;
			}else {
				m.blood = blood;
			}
			
			if(attack==0) {
				m.attack = 3;
			}else {
				m.attack = attack;
			}
			m.mana = 4;
			m.name = "Voidcaller";
			m.exist=true;
			m.sleep=sleep;
			m.MAXBLOOD=4;
			m.demon=true;
			return m;
		}else if(name.equals("Despicable Dreadlord")) {
			Minion m=new Minion(attack,blood);
			if(blood==0) {
				m.blood = 5;
			}else {
				m.blood = blood;
			}
			
			if(attack==0) {
				m.attack = 4;
			}else {
				m.attack = attack;
			}
			m.mana = 5;
			m.name = "Despicable Dreadlord";
			m.exist=true;
			m.sleep=sleep;
			m.MAXBLOOD=5;
			m.demon=true;
			return m;
		}else if(name.equals("Abyssal Enforcer")) {
			Minion m=new Minion(attack,blood);
			if(blood==0) {
				m.blood = 6;
			}else {
				m.blood = blood;
			}
			
			if(attack==0) {
				m.attack = 6;
			}else {
				m.attack = attack;
			}
			m.mana = 7;
			m.name = "Despicable Dreadlord";
			m.exist=true;
			m.sleep=sleep;
			m.MAXBLOOD=6;
			m.demon=true;
			return m;
		}else if(name.equals("+1SpellDamage")) {
			Minion m=new Minion(attack,blood);
			m.spelldamage=1;
			m.sleep=sleep;
			return m;
		}
		else {
			Minion m=new Minion(attack,blood);
			m.sleep=sleep;
			return m;
			}
	}
	 
}
