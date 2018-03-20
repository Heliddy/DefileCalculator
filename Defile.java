package Defile;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.management.monitor.Monitor;

public class Defile {

	// main方法
	public static void main(String[] args) {

		Defile d = new Defile();
		myFrame f = d.new myFrame();
		f.launchFrame();

	}

	class myFrame extends Frame {
		int p0a, p0b, p1a, p1b, p2a, p2b, p3a, p3b, p4a, p4b, p5a, p5b, p6a, p6b;
		int f0a, f0b, f1a, f1b, f2a, f2b, f3a, f3b, f4a, f4b, f5a, f5b, f6a, f6b;
		String cp0, cp1, cp2, cp3, cp4, cp5, cp6, cf0, cf1, cf2, cf3, cf4, cf5, cf6;
		String re;
		TextArea ta;
		TextField tfp0a = new TextField(), tfp0b = new TextField(), tfp1a = new TextField(), tfp1b = new TextField(), tfp2a = new TextField(), tfp2b = new TextField(), tfp3a = new TextField(),
				tfp3b = new TextField(), tfp4a = new TextField(), tfp4b = new TextField(), tfp5a = new TextField(), tfp5b = new TextField(), tfp6a = new TextField(), tfp6b = new TextField();
		TextField tff0a = new TextField(), tff0b = new TextField(), tff1a = new TextField(), tff1b = new TextField(), tff2a = new TextField(), tff2b = new TextField(), tff3a = new TextField(),
				tff3b = new TextField(), tff4a = new TextField(), tff4b = new TextField(), tff5a = new TextField(), tff5b = new TextField(), tff6a = new TextField(), tff6b = new TextField();
		Choice ccp0, ccp1, ccp2, ccp3, ccp4, ccp5, ccp6, ccf0, ccf1, ccf2, ccf3, ccf4, ccf5, ccf6;
		Checkbox cb0, cb1, cb2, cb3, cb4, cb5, cb6;

		public void launchFrame() {
			setSize(725, 700);
			setLocation(10, 100);
			setVisible(true);
			setResizable(false);
			setTitle("亵渎计算器v0.2 by Heliddy");
			setLayout(null);

			add(tfp0a);
			tfp0a.setText("0");
			tfp0a.setBounds(25, 130, 25, 20);
			add(tfp0b);
			tfp0b.setText("0");
			tfp0b.setBounds(75, 130, 25, 20);
			ccp0 = new Choice();
			ccp0.add("Minion");
			ccp0.add("Voidlord");
			ccp0.add("Voidwalker");
			ccp0.add("TauntMinion");
			ccp0.add("MalGanis");
			ccp0.add("Doomguard");
			ccp0.add("Voidcaller");
			ccp0.add("Despicable Dreadlord");
			ccp0.add("Abyssal Enforcer");
			add(ccp0);
			ccp0.setBounds(25, 50, 90, 20);

			add(tfp1a);
			tfp1a.setText("0");
			tfp1a.setBounds(125, 130, 25, 20);
			add(tfp1b);
			tfp1b.setText("0");
			tfp1b.setBounds(175, 130, 25, 20);
			ccp1 = new Choice();
			ccp1.add("Minion");
			ccp1.add("Voidlord");
			ccp1.add("Voidwalker");
			ccp1.add("TauntMinion");
			ccp1.add("MalGanis");
			ccp1.add("Doomguard");
			ccp1.add("Voidcaller");
			ccp1.add("Despicable Dreadlord");
			ccp1.add("Abyssal Enforcer");
			add(ccp1);
			ccp1.setBounds(125, 50, 90, 20);

			add(tfp2a);
			tfp2a.setText("0");
			tfp2a.setBounds(225, 130, 25, 20);
			add(tfp2b);
			tfp2b.setText("0");
			tfp2b.setBounds(275, 130, 25, 20);
			ccp2 = new Choice();
			ccp2.add("Minion");
			ccp2.add("Voidlord");
			ccp2.add("Voidwalker");
			ccp2.add("TauntMinion");
			ccp2.add("MalGanis");
			ccp2.add("Doomguard");
			ccp2.add("Voidcaller");
			ccp2.add("Despicable Dreadlord");
			ccp2.add("Abyssal Enforcer");
			add(ccp2);
			ccp2.setBounds(225, 50, 90, 20);

			add(tfp3a);
			tfp3a.setText("0");
			tfp3a.setBounds(325, 130, 25, 20);
			add(tfp3b);
			tfp3b.setText("0");
			tfp3b.setBounds(375, 130, 25, 20);
			ccp3 = new Choice();
			ccp3.add("Minion");
			ccp3.add("Voidlord");
			ccp3.add("Voidwalker");
			ccp3.add("TauntMinion");
			ccp3.add("MalGanis");
			ccp3.add("Doomguard");
			ccp3.add("Voidcaller");
			ccp3.add("Despicable Dreadlord");
			ccp3.add("Abyssal Enforcer");
			add(ccp3);
			ccp3.setBounds(325, 50, 90, 20);

			add(tfp4a);
			tfp4a.setText("0");
			tfp4a.setBounds(425, 130, 25, 20);
			add(tfp4b);
			tfp4b.setText("0");
			tfp4b.setBounds(475, 130, 25, 20);
			ccp4 = new Choice();
			ccp4.add("Minion");
			ccp4.add("Voidlord");
			ccp4.add("Voidwalker");
			ccp4.add("TauntMinion");
			ccp4.add("MalGanis");
			ccp4.add("Doomguard");
			ccp4.add("Voidcaller");
			ccp4.add("Despicable Dreadlord");
			ccp4.add("Abyssal Enforcer");
			add(ccp4);
			ccp4.setBounds(425, 50, 90, 20);

			add(tfp5a);
			tfp5a.setText("0");
			tfp5a.setBounds(525, 130, 25, 20);
			add(tfp5b);
			tfp5b.setText("0");
			tfp5b.setBounds(575, 130, 25, 20);
			ccp5 = new Choice();
			ccp5.add("Minion");
			ccp5.add("Voidlord");
			ccp5.add("Voidwalker");
			ccp5.add("TauntMinion");
			ccp5.add("MalGanis");
			ccp5.add("Doomguard");
			ccp5.add("Voidcaller");
			ccp5.add("Despicable Dreadlord");
			ccp5.add("Abyssal Enforcer");
			add(ccp5);
			ccp5.setBounds(525, 50, 90, 20);

			add(tfp6a);
			tfp6a.setText("0");
			tfp6a.setBounds(625, 130, 25, 20);
			add(tfp6b);
			tfp6b.setText("0");
			tfp6b.setBounds(675, 130, 25, 20);
			ccp6 = new Choice();
			ccp6.add("Minion");
			ccp6.add("Voidlord");
			ccp6.add("Voidwalker");
			ccp6.add("TauntMinion");
			ccp6.add("MalGanis");
			ccp6.add("Doomguard");
			ccp6.add("Voidcaller");
			ccp6.add("Despicable Dreadlord");
			ccp6.add("Abyssal Enforcer");
			add(ccp6);
			ccp6.setBounds(625, 50, 90, 20);

			add(tff0a);
			tff0a.setText("0");
			tff0a.setBounds(25, 330, 25, 20);
			add(tff0b);
			tff0b.setText("0");
			tff0b.setBounds(75, 330, 25, 20);
			ccf0 = new Choice();
			ccf0.add("Minion");
			ccf0.add("Voidlord");
			ccf0.add("Voidwalker");
			ccf0.add("TauntMinion");
			ccf0.add("MalGanis");
			ccf0.add("Doomguard");
			ccf0.add("Voidcaller");
			ccf0.add("Despicable Dreadlord");
			ccf0.add("Abyssal Enforcer");
			ccf0.add("+1SpellDamage");
			add(ccf0);
			ccf0.setBounds(25, 250, 90, 20);
			cb0 = new Checkbox();
			add(cb0);
			cb0.setBounds(57, 360, 10, 10);
			cb0.setState(true);

			add(tff1a);
			tff1a.setText("0");
			tff1a.setBounds(125, 330, 25, 20);
			add(tff1b);
			tff1b.setText("0");
			tff1b.setBounds(175, 330, 25, 20);
			ccf1 = new Choice();
			ccf1.add("Minion");
			ccf1.add("Voidlord");
			ccf1.add("Voidwalker");
			ccf1.add("TauntMinion");
			ccf1.add("MalGanis");
			ccf1.add("Doomguard");
			ccf1.add("Voidcaller");
			ccf1.add("Despicable Dreadlord");
			ccf1.add("Abyssal Enforcer");
			ccf1.add("+1SpellDamage");
			add(ccf1);
			ccf1.setBounds(125, 250, 90, 20);
			cb1 = new Checkbox();
			add(cb1);
			cb1.setBounds(157, 360, 10, 10);
			cb1.setState(true);

			add(tff2a);
			tff2a.setText("0");
			tff2a.setBounds(225, 330, 25, 20);
			add(tff2b);
			tff2b.setText("0");
			tff2b.setBounds(275, 330, 25, 20);
			ccf2 = new Choice();
			ccf2.add("Minion");
			ccf2.add("Voidlord");
			ccf2.add("Voidwalker");
			ccf2.add("TauntMinion");
			ccf2.add("MalGanis");
			ccf2.add("Doomguard");
			ccf2.add("Voidcaller");
			ccf2.add("Despicable Dreadlord");
			ccf2.add("Abyssal Enforcer");
			ccf2.add("+1SpellDamage");
			add(ccf2);
			ccf2.setBounds(225, 250, 90, 20);
			cb2 = new Checkbox();
			add(cb2);
			cb2.setBounds(257, 360, 10, 10);
			cb2.setState(true);

			add(tff3a);
			tff3a.setText("0");
			tff3a.setBounds(325, 330, 25, 20);
			add(tff3b);
			tff3b.setText("0");
			tff3b.setBounds(375, 330, 25, 20);
			ccf3 = new Choice();
			ccf3.add("Minion");
			ccf3.add("Voidlord");
			ccf3.add("Voidwalker");
			ccf3.add("TauntMinion");
			ccf3.add("MalGanis");
			ccf3.add("Doomguard");
			ccf3.add("Voidcaller");
			ccf3.add("Despicable Dreadlord");
			ccf3.add("Abyssal Enforcer");
			ccf3.add("+1SpellDamage");
			add(ccf3);
			ccf3.setBounds(325, 250, 90, 20);
			cb3 = new Checkbox();
			add(cb3);
			cb3.setBounds(357, 360, 10, 10);
			cb3.setState(true);

			add(tff4a);
			tff4a.setText("0");
			tff4a.setBounds(425, 330, 25, 20);
			add(tff4b);
			tff4b.setText("0");
			tff4b.setBounds(475, 330, 25, 20);
			ccf4 = new Choice();
			ccf4.add("Minion");
			ccf4.add("Voidlord");
			ccf4.add("Voidwalker");
			ccf4.add("TauntMinion");
			ccf4.add("MalGanis");
			ccf4.add("Doomguard");
			ccf4.add("Voidcaller");
			ccf4.add("Despicable Dreadlord");
			ccf4.add("Abyssal Enforcer");
			ccf4.add("+1SpellDamage");
			add(ccf4);
			ccf4.setBounds(425, 250, 90, 20);
			cb4 = new Checkbox();
			add(cb4);
			cb4.setBounds(457, 360, 10, 10);
			cb4.setState(true);

			add(tff5a);
			tff5a.setText("0");
			tff5a.setBounds(525, 330, 25, 20);
			add(tff5b);
			tff5b.setText("0");
			tff5b.setBounds(575, 330, 25, 20);
			ccf5 = new Choice();
			ccf5.add("Minion");
			ccf5.add("Voidlord");
			ccf5.add("Voidwalker");
			ccf5.add("TauntMinion");
			ccf5.add("MalGanis");
			ccf5.add("Doomguard");
			ccf5.add("Voidcaller");
			ccf5.add("Despicable Dreadlord");
			ccf5.add("Abyssal Enforcer");
			ccf5.add("+1SpellDamage");
			add(ccf5);
			ccf5.setBounds(525, 250, 90, 20);
			cb5 = new Checkbox();
			add(cb5);
			cb5.setBounds(557, 360, 10, 10);
			cb5.setState(true);

			add(tff6a);
			tff6a.setText("0");
			tff6a.setBounds(625, 330, 25, 20);
			add(tff6b);
			tff6b.setText("0");
			tff6b.setBounds(675, 330, 25, 20);
			ccf6 = new Choice();
			ccf6.add("Minion");
			ccf6.add("Voidlord");
			ccf6.add("Voidwalker");
			ccf6.add("TauntMinion");
			ccf6.add("MalGanis");
			ccf6.add("Doomguard");
			ccf6.add("Voidcaller");
			ccf6.add("Despicable Dreadlord");
			ccf6.add("Abyssal Enforcer");
			ccf6.add("+1SpellDamage");
			add(ccf6);
			ccf6.setBounds(625, 250, 90, 20);
			cb6 = new Checkbox();
			add(cb6);
			cb6.setBounds(657, 360, 10, 10);
			cb6.setState(true);

			Button b = new Button("Cast Defile");
			Monitor bh = new Monitor();
			b.addActionListener(bh);
			add(b);
			b.setBounds(635, 380, 65, 20);

			Button c = new Button("Refresh");
			MonitorRefresh ch = new MonitorRefresh();
			c.addActionListener(ch);
			add(c);
			c.setBounds(25, 380, 50, 20);

			ta = new TextArea();
			add(ta);
			ta.setBounds(25, 400, 675, 275);

			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}

		public void paint(Graphics g0) {
			for (int i = 0; i <= 7; i++) {
				Graphics2D g = (Graphics2D) g0;
				Stroke b = g.getStroke();
				g.setStroke(new BasicStroke(3f));
				g.drawOval(32 + i * 100, 80, 62, 90);
				g.drawOval(32 + i * 100, 280, 62, 90);
				g.setStroke(b);
			}
			g0.drawLine(25, 200, 700, 200);

		}

		class Monitor implements ActionListener {
			public void actionPerformed(ActionEvent e) {

				ArrayList<Minion> friendlyBoard = new ArrayList<Minion>(7);
				ArrayList<Minion> enemyBoard = new ArrayList<Minion>(7);
				ArrayList<Spell> handSpell = new ArrayList<Spell>();
				ArrayList<Minion> handMinion = new ArrayList<Minion>();

				// 导入手牌中的随从
				handMinion.add(new Minion(5, 2, 2));
				// 新建一个亵渎
				Defile d = new Defile();
				p0a = Integer.parseInt(tfp0a.getText());
				p1a = Integer.parseInt(tfp1a.getText());
				p2a = Integer.parseInt(tfp2a.getText());
				p3a = Integer.parseInt(tfp3a.getText());
				p4a = Integer.parseInt(tfp4a.getText());
				p5a = Integer.parseInt(tfp5a.getText());
				p6a = Integer.parseInt(tfp6a.getText());
				f0a = Integer.parseInt(tff0a.getText());
				f1a = Integer.parseInt(tff1a.getText());
				f2a = Integer.parseInt(tff2a.getText());
				f3a = Integer.parseInt(tff3a.getText());
				f4a = Integer.parseInt(tff4a.getText());
				f5a = Integer.parseInt(tff5a.getText());
				f6a = Integer.parseInt(tff6a.getText());
				p0b = Integer.parseInt(tfp0b.getText());
				p1b = Integer.parseInt(tfp1b.getText());
				p2b = Integer.parseInt(tfp2b.getText());
				p3b = Integer.parseInt(tfp3b.getText());
				p4b = Integer.parseInt(tfp4b.getText());
				p5b = Integer.parseInt(tfp5b.getText());
				p6b = Integer.parseInt(tfp6b.getText());
				f0b = Integer.parseInt(tff0b.getText());
				f1b = Integer.parseInt(tff1b.getText());
				f2b = Integer.parseInt(tff2b.getText());
				f3b = Integer.parseInt(tff3b.getText());
				f4b = Integer.parseInt(tff4b.getText());
				f5b = Integer.parseInt(tff5b.getText());
				f6b = Integer.parseInt(tff6b.getText());
				cp0 = ccp0.getSelectedItem().toString();
				cp1 = ccp1.getSelectedItem().toString();
				cp2 = ccp2.getSelectedItem().toString();
				cp3 = ccp3.getSelectedItem().toString();
				cp4 = ccp4.getSelectedItem().toString();
				cp5 = ccp5.getSelectedItem().toString();
				cp6 = ccp6.getSelectedItem().toString();
				cf0 = ccf0.getSelectedItem().toString();
				cf1 = ccf1.getSelectedItem().toString();
				cf2 = ccf2.getSelectedItem().toString();
				cf3 = ccf3.getSelectedItem().toString();
				cf4 = ccf4.getSelectedItem().toString();
				cf5 = ccf5.getSelectedItem().toString();
				cf6 = ccf6.getSelectedItem().toString();
				// 进行操作

				/*
				 * d.SIHAM(handSpell, friendlyBoard, enemyBoard);
				 * 
				 */

				// Voidwalker()
				// Voidlord()
				// Minion()

				// 导入友方随从
				friendlyBoard.add(0, new Minion().Cards(f0a, f0b, cf0, !cb0.getState()));
				friendlyBoard.add(1, new Minion().Cards(f1a, f1b, cf1, !cb1.getState()));
				friendlyBoard.add(2, new Minion().Cards(f2a, f2b, cf2, !cb2.getState()));
				friendlyBoard.add(3, new Minion().Cards(f3a, f3b, cf3, !cb3.getState()));
				friendlyBoard.add(4, new Minion().Cards(f4a, f4b, cf4, !cb4.getState()));
				friendlyBoard.add(5, new Minion().Cards(f5a, f5b, cf5, !cb5.getState()));
				friendlyBoard.add(6, new Minion().Cards(f6a, f6b, cf6, !cb6.getState()));

				// 导入敌方随从
				enemyBoard.add(0, new Minion().Cards(p0a, p0b, cp0, false));
				enemyBoard.add(1, new Minion().Cards(p1a, p1b, cp1, false));
				enemyBoard.add(2, new Minion().Cards(p2a, p2b, cp2, false));
				enemyBoard.add(3, new Minion().Cards(p3a, p3b, cp3, false));
				enemyBoard.add(4, new Minion().Cards(p4a, p4b, cp4, false));
				enemyBoard.add(5, new Minion().Cards(p5a, p5b, cp5, false));
				enemyBoard.add(6, new Minion().Cards(p6a, p6b, cp6, false));

				// Siphon_Life()
				// Mortal_Coil()
				// Lesser_Amethyst_Spellstone()
				// Amethyst_Spellstone()
				// Greater_Amethyst_Spellstone()

				// 导入手牌中的法术
				/*
				 * handSpell.add(new Siphon_Life()); handSpell.add(new Mortal_Coil());
				 * handSpell.add(new Mortal_Coil()); handSpell.add(new
				 * Lesser_Amethyst_Spellstone()); handSpell.add(new
				 * Greater_Amethyst_Spellstone());
				 */
				try {
					for (int i = 0; i <= 7; i++) {
						Result r = d.operateMinion(friendlyBoard, enemyBoard, i, true, myFrame.this);
					}
					ta.append("--------------" + "\n");

				} catch (InterruptedException ex) { // TODO Auto-generated catch block
					ex.printStackTrace();
				}

			}
		}

		class MonitorRefresh implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				tfp0a.setText("0");
				tfp1a.setText("0");
				tfp2a.setText("0");
				tfp3a.setText("0");
				tfp4a.setText("0");
				tfp5a.setText("0");
				tfp6a.setText("0");
				tfp0b.setText("0");
				tfp1b.setText("0");
				tfp2b.setText("0");
				tfp3b.setText("0");
				tfp4b.setText("0");
				tfp5b.setText("0");
				tfp6b.setText("0");
				tff0a.setText("0");
				tff1a.setText("0");
				tff2a.setText("0");
				tff3a.setText("0");
				tff4a.setText("0");
				tff5a.setText("0");
				tff6a.setText("0");
				tff0b.setText("0");
				tff1b.setText("0");
				tff2b.setText("0");
				tff3b.setText("0");
				tff4b.setText("0");
				tff5b.setText("0");
				tff6b.setText("0");
				ta.setText("");
				ccp0.select(0);
				ccp1.select(0);
				ccp2.select(0);
				ccp3.select(0);
				ccp4.select(0);
				ccp5.select(0);
				ccp6.select(0);
				ccf0.select(0);
				ccf1.select(0);
				ccf2.select(0);
				ccf3.select(0);
				ccf4.select(0);
				ccf5.select(0);
				ccf6.select(0);
			}
		}

	}

	public void SIHAM(ArrayList<Spell> h, ArrayList<Minion> f, ArrayList<Minion> e, myFrame mf) {
		for (int i = 0; i < h.size(); i++) {
			try {
				dealDamageAllAndOperate(h.get(i), f, e, mf);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println("#");
	}

	public Result dealDamageAllAndOperate(Spell s, ArrayList<Minion> f, ArrayList<Minion> e, myFrame mf) throws InterruptedException {
		Result r = new Result();
		for (int i = 0; i < f.size(); i++) {
			if (f.get(i).exist) {
				ArrayList<Minion> tempF = new ArrayList<Minion>(7);
				trueClone(f, tempF);
				s.dealDamage(tempF.get(i), tempF, i);
				for (int j = 0; j <= tempF.size(); j++) {
					boolean po = operateMinion(tempF, e, j, false, mf).possibility;
					if (po) {
						System.out.println("使用" + s.name + "來打友方" + i + "号随从");
						r = operateMinion(tempF, e, j, true, mf);
					}
				}
			}
		}
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i).exist) {
				ArrayList<Minion> tempE = new ArrayList<Minion>(7);
				trueClone(e, tempE);
				s.dealDamage(tempE.get(i), tempE, i);
				for (int j = 0; j <= f.size(); j++) {
					boolean po = operateMinion(f, tempE, j, false, mf).possibility;
					if (po) {
						mf.ta.append("用" + s.name + "來打敌方" + i + "号随从" + "\n");
						r = operateMinion(f, tempE, j, true, mf);
					}
				}
			}

		}
		return r;
	}

	// 亵渎一次
	public void defileOneTime(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard) {
		int fspd = 0;
		for (int i = 0; i < friendlyBoard.size(); i++) {
			fspd += friendlyBoard.get(i).spelldamage;

		}
		for (int i = 0; i < friendlyBoard.size(); i++) {
			if (friendlyBoard.get(i).exist) {
				friendlyBoard.get(i).blood -= 1 + fspd;
				friendlyBoard.get(i).refresh();
			}

		}
		for (int i = 0; i < enemyBoard.size(); i++) {
			if (enemyBoard.get(i).exist) {
				enemyBoard.get(i).blood -= 1 + fspd;
				enemyBoard.get(i).refresh();
			}
		}
	}

	// 亵渎若干次的方法
	public void defileSeveralTimes(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard) {
		int n = 1;
		defileOneTime(friendlyBoard, enemyBoard);
		while (!(friendlyBoard.get(0).alive && friendlyBoard.get(1).alive && friendlyBoard.get(2).alive && friendlyBoard.get(3).alive && friendlyBoard.get(4).alive && friendlyBoard.get(5).alive
				&& friendlyBoard.get(6).alive && enemyBoard.get(0).alive && enemyBoard.get(1).alive && enemyBoard.get(2).alive && enemyBoard.get(3).alive && enemyBoard.get(4).alive
				&& enemyBoard.get(5).alive && enemyBoard.get(6).alive)) {
			for (int i = 0; i < friendlyBoard.size(); i++) {
				if (friendlyBoard.get(i).alive == false) {
					friendlyBoard.get(i).deathrattle(friendlyBoard, i);

				}
				;
			}
			for (int i = 0; i < enemyBoard.size(); i++) {
				if (enemyBoard.get(i).alive == false) {
					enemyBoard.get(i).deathrattle(enemyBoard, i);

				}
				;
			}
			defileOneTime(friendlyBoard, enemyBoard);
			n++;
		}
		;
	}

	// 操作随从
	public Result operateMinion(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, int an, boolean print, myFrame mf) throws InterruptedException {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Result r = new Result();
		switch (an) {
		case 7: {
			A7DThread t7 = new A7DThread(friendlyBoard, enemyBoard, r, print, mf);
			t7.start();
			t7.join();
			return r;
		}
		case 6: {
			A6DThread t6 = new A6DThread(friendlyBoard, enemyBoard, r, print, mf);
			t6.start();
			t6.join();
			return r;
		}
		case 5: {
			A5DThread t5 = new A5DThread(friendlyBoard, enemyBoard, r, print, mf);
			t5.start();
			t5.join();
			return r;
		}
		case 4: {
			A4DThread t4 = new A4DThread(friendlyBoard, enemyBoard, r, print, mf);
			t4.start();
			t4.join();
			return r;
		}
		case 3: {
			A3DThread t3 = new A3DThread(friendlyBoard, enemyBoard, r, print, mf);
			t3.start();
			t3.join();
			return r;
		}
		case 2: {
			A2DThread t2 = new A2DThread(friendlyBoard, enemyBoard, r, print, mf);
			t2.start();
			t2.join();
			return r;
		}
		case 1: {
			A1DThread t1 = new A1DThread(friendlyBoard, enemyBoard, r, print, mf);
			t1.start();
			t1.join();
			return r;
		}
		default: {
			A0DThread t0 = new A0DThread(friendlyBoard, enemyBoard, r, print, mf);
			t0.start();
			t0.join();
			return r;
		}
		}

	}

	// 判断场面结果
	public ClearResult clear(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard) {
		ClearResult c = new ClearResult();
		int m = 0;
		int n = 0;
		for (int i = 0; i < friendlyBoard.size(); i++) {
			if (friendlyBoard.get(i).exist) {
				m += friendlyBoard.get(i).attack;
			}
		}
		c.m = m;
		for (int i = 0; i < enemyBoard.size(); i++) {
			if (enemyBoard.get(i).exist) {
				n++;
			}
		}
		if (n == 0) {
			c.clear = true;
			return c;
		} else {
			c.clear = false;
			return c;
		}
	}

	// 假复制的方法
	public static void trueClone(ArrayList<Minion> src, ArrayList<Minion> dest) {
		for (int i = 0; i < src.size(); i++) {
			Object obj = new Object();

			try {
				obj = src.get(i).clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			dest.add((Minion) obj);
		}
	}

	public void Halo(ArrayList<Minion> f, ArrayList<Minion> e) {
		for (int i = 0; i <= f.size(); i++) {
			f.get(i).blood += 2;
		}
	}
	
	public boolean search(int[] d) {
		if(d.length>=2) {
			return !(d[d.length-2]==d[d.length-1]);
		}else {
			return true;
		}
		
	}

	public class A0DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A0DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			
			ArrayList<Minion> tempF = new ArrayList<Minion>(7);
			trueClone(friendlyBoard, tempF);
			ArrayList<Minion> tempP = new ArrayList<Minion>(7);
			trueClone(enemyBoard, tempP);
			defileSeveralTimes(tempF, tempP);
			if (clear(tempF, tempP).clear) {
				n++;
				r.possibility = true;
				r.totalAttack = clear(tempF, tempP).m;
				
			}
			r.conditon = n + 1;
			r.attackNumber = 0;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "敌方能不能全清:" + r.possibility  + " "+"友方所剩攻击力为" + r.totalAttack + "\n");
			}
		}

	}

	public class A1DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A1DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int i = 0; i < friendlyBoard.size(); i++) {
				for (int j = 0; j < enemyBoard.size(); j++) {
					for (int ib = 0; ib < i; ib++) {
						if (friendlyBoard.get(i).equals(friendlyBoard.get(ib))) {
							break;
						}
					}
					for (int jb = 0; jb < j; jb++) {
						if (enemyBoard.get(j).equals(enemyBoard.get(jb))) {
							break;
						}
					}
					ArrayList<Minion> tempF = new ArrayList<Minion>(7);
					trueClone(friendlyBoard, tempF);
					ArrayList<Minion> tempP = new ArrayList<Minion>(7);
					trueClone(enemyBoard, tempP);
					if (tempF.get(i).exist && tempP.get(j).exist) {
						tempF.get(i).attackRefreshAndReplace(tempF, i, tempP, j, tempP.get(j));
						defileSeveralTimes(tempF, tempP);
						if (clear(tempF, tempP).clear) {
							n++;
							r.possibility = true;
							r.totalAttack = clear(tempF, tempP).m;
							mm.add(r.totalAttack);
							int[] d=new int[mm.size()];
							for(int di=0;di<mm.size();di++) {
								d[di]=mm.get(di);
							}
							Arrays.sort((d));
							if (print&&search(d)) {
								mf.ta.append((int) (i + 1) + "->" + (int) (j + 1) + " "+ "友方所剩攻击力为" + r.totalAttack + "\n");
							}

						}
					}

				}
			}
			r.conditon = n;
			r.attackNumber = 1;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}

		}

	}

	public class A2DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A2DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int k = 0; k < friendlyBoard.size(); k++) {
				for (int i = 0; i < k; i++) {
					for (int j = 0; j < enemyBoard.size(); j++) {
						for (int g = 0; g < enemyBoard.size(); g++) {
							for (int kb = 0; kb < k; kb++) {
								if (friendlyBoard.get(k).equals(friendlyBoard.get(kb))) {
									break;
								}
							}
							for (int ib = 0; ib < i; ib++) {
								if (friendlyBoard.get(i).equals(friendlyBoard.get(ib))) {
									break;
								}
							}

							ArrayList<Minion> tempF = new ArrayList<Minion>(7);
							trueClone(friendlyBoard, tempF);
							ArrayList<Minion> tempP = new ArrayList<Minion>(7);
							trueClone(enemyBoard, tempP);
							if (tempF.get(k).exist && tempP.get(j).exist && tempF.get(i).exist && tempP.get(g).exist) {
								tempF.get(k).attackRefreshAndReplace(tempF, k, tempP, g, tempP.get(g));
								tempF.get(i).attackRefreshAndReplace(tempF, i, tempP, j, tempP.get(j));
								defileSeveralTimes(tempF, tempP);
								if (clear(tempF, tempP).clear) {
									n++;
									r.possibility = true;
									r.totalAttack = clear(tempF, tempP).m;
									mm.add(r.totalAttack);
									int[] d=new int[mm.size()];
									for(int di=0;di<mm.size();di++) {
										d[di]=mm.get(di);
									}
									Arrays.sort((d));				
									if (print&&search(d)) {
										mf.ta.append("先:" + (int) (k + 1) + "->" + (int) (g + 1) + "后:" + (int) (i + 1) + "->" + (int) (j + 1) + " " +"友方所剩攻击力为" + r.totalAttack + "\n");
									}
								}
							}
						}
					}
				}
			}
			r.conditon = n;
			r.attackNumber = 2;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}
		}

	}

	public class A3DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A3DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int af = 2; af < friendlyBoard.size(); af++) {
				for (int bf = 1; bf < af; bf++) {
					for (int cf = 0; cf < bf; cf++) {
						for (int ap = 0; ap < enemyBoard.size(); ap++) {
							for (int bp = 0; bp < enemyBoard.size(); bp++) {
								for (int cp = 0; cp < enemyBoard.size(); cp++) {

									for (int afb = 2; afb < af; afb++) {
										for (int bfb = 1; bfb < bf; bfb++) {
											for (int cfb = 0; cfb < cf; cfb++) {
												if (friendlyBoard.get(af).equals(friendlyBoard.get(afb)) && friendlyBoard.get(bf).equals(friendlyBoard.get(bfb))
														&& friendlyBoard.get(cf).equals(friendlyBoard.get(cfb))) {
													break;
												}
											}
										}
									}

									ArrayList<Minion> tempF = new ArrayList<Minion>(7);
									trueClone(friendlyBoard, tempF);
									ArrayList<Minion> tempP = new ArrayList<Minion>(7);
									trueClone(enemyBoard, tempP);
									if (tempF.get(af).exist && tempP.get(ap).exist && tempF.get(bf).exist && tempP.get(bp).exist && tempF.get(cf).exist && tempP.get(cp).exist) {
										tempF.get(af).attackRefreshAndReplace(tempF, af, tempP, bp, tempP.get(bp));
										tempF.get(bf).attackRefreshAndReplace(tempF, bf, tempP, ap, tempP.get(ap));
										tempF.get(cf).attackRefreshAndReplace(tempF, cf, tempP, cp, tempP.get(cp));
										defileSeveralTimes(tempF, tempP);
										if (clear(tempF, tempP).clear) {
											n++;
											r.possibility = true;
											r.totalAttack = clear(tempF, tempP).m;
											mm.add(r.totalAttack);
											int[] d=new int[mm.size()];
											for(int di=0;di<mm.size();di++) {
												d[di]=mm.get(di);
											}
											Arrays.sort((d));
											if (print&&search(d)) {
												mf.ta.append("第一步:" + (int) (af + 1) + "->" + (int) (bp + 1) + " " + "第二步:" + (int) (bf + 1) + "->" + (int) (ap + 1) + " " + "第三步:" + (int) (cf + 1)
														+ "->" + (int) (cp + 1)+ " " + "友方所剩攻击力为" + r.totalAttack + "\n");
											}
										}
									}
								}
							}
						}
					}
				}
			}
			r.conditon = n;
			r.attackNumber = 3;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}
		}
	}

	public class A4DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A4DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int af = 3; af < friendlyBoard.size(); af++) {
				for (int bf = 2; bf < af; bf++) {
					for (int cf = 1; cf < bf; cf++) {
						for (int df = 0; df < cf; df++) {
							for (int ap = 0; ap < enemyBoard.size(); ap++) {
								for (int bp = 0; bp < enemyBoard.size(); bp++) {
									for (int cp = 0; cp < enemyBoard.size(); cp++) {
										for (int dp = 0; dp < enemyBoard.size(); dp++) {

											for (int afb = 3; afb < af; afb++) {
												for (int bfb = 2; bfb < bf; bfb++) {
													for (int cfb = 1; cfb < cf; cfb++) {
														for (int dfb = 0; dfb < df; dfb++) {
															if (friendlyBoard.get(af).equals(friendlyBoard.get(afb)) && friendlyBoard.get(bf).equals(friendlyBoard.get(bfb))
																	&& friendlyBoard.get(cf).equals(friendlyBoard.get(cfb)) && friendlyBoard.get(df).equals(friendlyBoard.get(dfb))) {
																break;
															}
														}
													}
												}
											}

											ArrayList<Minion> tempF = new ArrayList<Minion>(7);
											trueClone(friendlyBoard, tempF);
											ArrayList<Minion> tempP = new ArrayList<Minion>(7);
											trueClone(enemyBoard, tempP);
											if (tempF.get(af).exist && tempP.get(ap).exist && tempF.get(bf).exist && tempP.get(bp).exist && tempF.get(cf).exist && tempP.get(cp).exist
													&& tempF.get(df).exist && tempP.get(dp).exist) {
												tempF.get(af).attackRefreshAndReplace(tempF, af, tempP, bp, tempP.get(bp));
												tempF.get(bf).attackRefreshAndReplace(tempF, bf, tempP, ap, tempP.get(ap));
												tempF.get(cf).attackRefreshAndReplace(tempF, cf, tempP, cp, tempP.get(cp));
												tempF.get(df).attackRefreshAndReplace(tempF, df, tempP, dp, tempP.get(dp));
												defileSeveralTimes(tempF, tempP);
												if (clear(tempF, tempP).clear) {
													n++;
													r.possibility = true;
													r.totalAttack = clear(tempF, tempP).m;
													mm.add(r.totalAttack);
													int[] d=new int[mm.size()];
													for(int di=0;di<mm.size();di++) {
														d[di]=mm.get(di);
													}
													Arrays.sort((d));
													if (print&&search(d)) {
														mf.ta.append("第一步:" + (int) (af + 1) + "->" + (int) (bp + 1) + " " + "第二步:" + (int) (bf + 1) + "->" + (int) (ap + 1) + " " + "第三步:"
																+ (int) (cf + 1) + "->" + (int) (cp + 1) + " " + "第四步:" + (int) (df + 1) + "->" + (int) (dp + 1)+ " " + "友方所剩攻击力为" + r.totalAttack + "\n");
													}

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			r.conditon = n;
			r.attackNumber = 4;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}
		}

	}

	public class A5DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A5DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int af = 4; af < friendlyBoard.size(); af++) {
				for (int bf = 3; bf < af; bf++) {
					for (int cf = 2; cf < bf; cf++) {
						for (int df = 1; df < cf; df++) {
							for (int ef = 0; ef < df; ef++) {
								for (int ap = 0; ap < enemyBoard.size(); ap++) {
									for (int bp = 0; bp < enemyBoard.size(); bp++) {
										for (int cp = 0; cp < enemyBoard.size(); cp++) {
											for (int dp = 0; dp < enemyBoard.size(); dp++) {
												for (int ep = 0; ep < enemyBoard.size(); ep++) {

													for (int afb = 4; afb < af; afb++) {
														for (int bfb = 3; bfb < bf; bfb++) {
															for (int cfb = 2; cfb < cf; cfb++) {
																for (int dfb = 1; dfb < df; dfb++) {
																	for (int efb = 0; efb < ef; efb++) {
																		if (friendlyBoard.get(af).equals(friendlyBoard.get(afb)) && friendlyBoard.get(bf).equals(friendlyBoard.get(bfb))
																				&& friendlyBoard.get(cf).equals(friendlyBoard.get(cfb)) && friendlyBoard.get(df).equals(friendlyBoard.get(dfb))
																				&& friendlyBoard.get(ef).equals(friendlyBoard.get(efb))) {
																			break;
																		}
																	}
																}
															}
														}
													}
													ArrayList<Minion> tempF = new ArrayList<Minion>(7);
													trueClone(friendlyBoard, tempF);
													ArrayList<Minion> tempP = new ArrayList<Minion>(7);
													trueClone(enemyBoard, tempP);
													if (tempF.get(af).exist && tempP.get(ap).exist && tempF.get(bf).exist && tempP.get(bp).exist && tempF.get(cf).exist && tempP.get(cp).exist
															&& tempF.get(df).exist && tempP.get(dp).exist && tempF.get(ef).exist && tempP.get(ep).exist) {
														tempF.get(af).attackRefreshAndReplace(tempF, af, tempP, bp, tempP.get(bp));
														tempF.get(bf).attackRefreshAndReplace(tempF, bf, tempP, ap, tempP.get(ap));
														tempF.get(cf).attackRefreshAndReplace(tempF, cf, tempP, cp, tempP.get(cp));
														tempF.get(df).attackRefreshAndReplace(tempF, df, tempP, dp, tempP.get(dp));
														tempF.get(ef).attackRefreshAndReplace(tempF, ef, tempP, ep, tempP.get(ep));
														defileSeveralTimes(tempF, tempP);
														if (clear(tempF, tempP).clear) {
															n++;
															r.possibility = true;
															r.totalAttack = clear(tempF, tempP).m;
															mm.add(r.totalAttack);
															int[] d=new int[mm.size()];
															for(int di=0;di<mm.size();di++) {
																d[di]=mm.get(di);
															}
															Arrays.sort((d));
															if (print&&search(d)) {
																mf.ta.append("第一步:" + (int) (af + 1) + "->" + (int) (bp + 1) + " " + "第二步:" + (int) (bf + 1) + "->" + (int) (ap + 1) + " " + "第三步:"
																		+ (int) (cf + 1) + "->" + (int) (cp + 1) + " " + "第四步:" + (int) (df + 1) + "->" + (int) (dp + 1) + " " + "第五步:" + (int) (ef + 1)
																		+ "->" + (int) (ep + 1)+ " " + "友方所剩攻击力为" + r.totalAttack + "\n");
															}

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			r.conditon = n;
			r.attackNumber = 5;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}
		}

	}

	public class A6DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A6DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int af = 5; af < friendlyBoard.size(); af++) {
				for (int bf = 4; bf < af; bf++) {
					for (int cf = 3; cf < bf; cf++) {
						for (int df = 2; df < cf; df++) {
							for (int ef = 1; ef < df; ef++) {
								for (int ff = 0; ff < ef; ff++) {
									for (int ap = 0; ap < enemyBoard.size(); ap++) {
										for (int bp = 0; bp < enemyBoard.size(); bp++) {
											for (int cp = 0; cp < enemyBoard.size(); cp++) {
												for (int dp = 0; dp < enemyBoard.size(); dp++) {
													for (int ep = 0; ep < enemyBoard.size(); ep++) {
														for (int fp = 0; fp < enemyBoard.size(); fp++) {

															for (int afb = 5; afb < af; afb++) {
																for (int bfb = 4; bfb < bf; bfb++) {
																	for (int cfb = 3; cfb < cf; cfb++) {
																		for (int dfb = 2; dfb < df; dfb++) {
																			for (int efb = 1; efb < ef; efb++) {
																				for (int ffb = 0; ffb < ff; ffb++) {
																					if (friendlyBoard.get(af).equals(friendlyBoard.get(afb)) && friendlyBoard.get(bf).equals(friendlyBoard.get(bfb))
																							&& friendlyBoard.get(cf).equals(friendlyBoard.get(cfb))
																							&& friendlyBoard.get(df).equals(friendlyBoard.get(dfb))
																							&& friendlyBoard.get(ef).equals(friendlyBoard.get(efb))
																							&& friendlyBoard.get(ff).equals(friendlyBoard.get(ffb))) {
																						break;
																					}
																				}
																			}
																		}
																	}
																}
															}
															ArrayList<Minion> tempF = new ArrayList<Minion>(7);
															trueClone(friendlyBoard, tempF);
															ArrayList<Minion> tempP = new ArrayList<Minion>(7);
															trueClone(enemyBoard, tempP);
															if (tempF.get(af).exist && tempP.get(ap).exist && tempF.get(bf).exist && tempP.get(bp).exist && tempF.get(cf).exist && tempP.get(cp).exist
																	&& tempF.get(df).exist && tempP.get(dp).exist && tempF.get(ef).exist && tempP.get(ep).exist && tempF.get(ff).exist
																	&& tempP.get(fp).exist) {
																tempF.get(af).attackRefreshAndReplace(tempF, af, tempP, ap, tempP.get(ap));
																tempF.get(bf).attackRefreshAndReplace(tempF, bf, tempP, bp, tempP.get(bp));
																tempF.get(cf).attackRefreshAndReplace(tempF, cf, tempP, cp, tempP.get(cp));
																tempF.get(df).attackRefreshAndReplace(tempF, df, tempP, dp, tempP.get(dp));
																tempF.get(ef).attackRefreshAndReplace(tempF, ef, tempP, ep, tempP.get(ep));
																tempF.get(ff).attackRefreshAndReplace(tempF, ff, tempP, fp, tempP.get(fp));
																defileSeveralTimes(tempF, tempP);
																if (clear(tempF, tempP).clear) {
																	n++;
																	r.possibility = true;
																	r.totalAttack = clear(tempF, tempP).m;
																	mm.add(r.totalAttack);
																	int[] d=new int[mm.size()];
																	for(int di=0;di<mm.size();di++) {
																		d[di]=mm.get(di);
																	}
																	Arrays.sort((d));
																	if (print&&search(d)) {
																		mf.ta.append("第一步:" + (int) (af + 1) + "->" + (int) (ap + 1) + " " + "第二步:" + (int) (bf + 1) + "->" + (int) (bp + 1) + " "
																				+ "第三步:" + (int) (cf + 1) + "->" + (int) (cp + 1) + " " + "第四步:" + (int) (df + 1) + "->" + (int) (dp + 1) + " " + "第五步:"
																				+ (int) (ef + 1) + "->" + (int) (ep + 1) + " " + "第六步:" + (int) (ff + 1) + "->" + (int) (fp + 1) + " "+ "友方所剩攻击力为"
																				+ r.totalAttack + "\n");
																	}

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			r.conditon = n;
			r.attackNumber = 6;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}
		}

	}

	public class A7DThread extends Thread {
		ArrayList<Minion> friendlyBoard;
		ArrayList<Minion> enemyBoard;
		Result r;
		boolean print;
		myFrame mf;

		public A7DThread(ArrayList<Minion> friendlyBoard, ArrayList<Minion> enemyBoard, Result r, boolean print, myFrame mf) {
			super();
			this.friendlyBoard = friendlyBoard;
			this.enemyBoard = enemyBoard;
			this.r = r;
			this.print = print;
			this.mf = mf;
		}

		public void run() {
			int n = 0;
			ArrayList<Integer> mm=new ArrayList<Integer>();
			for (int af = 6; af < friendlyBoard.size(); af++) {
				for (int bf = 5; bf < af; bf++) {
					for (int cf = 4; cf < bf; cf++) {
						for (int df = 3; df < cf; df++) {
							for (int ef = 2; ef < df; ef++) {
								for (int ff = 1; ff < ef; ff++) {
									for (int gf = 0; gf < ff; gf++) {
										ap7: for (int ap = 0; ap < enemyBoard.size(); ap++) {

											bp7: for (int bp = 0; bp < enemyBoard.size(); bp++) {

												cp7: for (int cp = 0; cp < enemyBoard.size(); cp++) {

													dp7: for (int dp = 0; dp < enemyBoard.size(); dp++) {

														ep7: for (int ep = 0; ep < enemyBoard.size(); ep++) {

															fp7: for (int fp = 0; fp < enemyBoard.size(); fp++) {

																gp7: for (int gp = 0; gp < enemyBoard.size(); gp++) {

																	ArrayList<Minion> tempF = new ArrayList<Minion>(7);
																	trueClone(friendlyBoard, tempF);
																	ArrayList<Minion> tempP = new ArrayList<Minion>(7);
																	trueClone(enemyBoard, tempP);
																	if (tempF.get(af).exist && tempP.get(ap).exist && tempF.get(bf).exist && tempP.get(bp).exist && tempF.get(cf).exist
																			&& tempP.get(cp).exist && tempF.get(df).exist && tempP.get(dp).exist && tempF.get(ef).exist && tempP.get(ep).exist
																			&& tempF.get(ff).exist && tempP.get(fp).exist && tempF.get(gf).exist && tempP.get(gp).exist) {
																		tempF.get(af).attackRefreshAndReplace(tempF, af, tempP, ap, tempP.get(ap));
																		for (int apb = 0; apb < ap; apb++) {
																			if (tempP.get(ap).equals(tempP.get(apb))) {
																				continue ap7;
																			}
																		}
																		tempF.get(bf).attackRefreshAndReplace(tempF, bf, tempP, bp, tempP.get(bp));
																		for (int bpb = 0; bpb < bp; bpb++) {
																			if (tempP.get(bp).equals(tempP.get(bpb))) {
																				continue bp7;
																			}
																		}
																		tempF.get(cf).attackRefreshAndReplace(tempF, cf, tempP, cp, tempP.get(cp));
																		for (int cpb = 0; cpb < cp; cpb++) {
																			if (tempP.get(cp).equals(tempP.get(cpb))) {
																				continue cp7;
																			}
																		}
																		tempF.get(df).attackRefreshAndReplace(tempF, df, tempP, dp, tempP.get(dp));
																		for (int dpb = 0; dpb < dp; dpb++) {
																			if (tempP.get(dp).equals(tempP.get(dpb))) {
																				continue dp7;
																			}
																		}
																		tempF.get(ef).attackRefreshAndReplace(tempF, ef, tempP, ep, tempP.get(ep));
																		for (int epb = 0; epb < ep; epb++) {
																			if (tempP.get(ep).equals(tempP.get(epb))) {
																				continue ep7;
																			}
																		}
																		tempF.get(ff).attackRefreshAndReplace(tempF, ff, tempP, fp, tempP.get(fp));
																		for (int fpb = 0; fpb < fp; fpb++) {
																			if (tempP.get(fp).equals(tempP.get(fpb))) {
																				continue fp7;
																			}
																		}
																		tempF.get(gf).attackRefreshAndReplace(tempF, gf, tempP, gp, tempP.get(gp));
																		for (int gpb = 0; gpb < gp; gpb++) {
																			if (tempP.get(gp).equals(tempP.get(gpb))) {
																				continue gp7;
																			}
																		}
																		defileSeveralTimes(tempF, tempP);
																		if (clear(tempF, tempP).clear) {
																			n++;
																			r.possibility = true;
																			r.totalAttack = clear(tempF, tempP).m;
																			mm.add(r.totalAttack);
																			int[] d=new int[mm.size()];
																			for(int di=0;di<mm.size();di++) {
																				d[di]=mm.get(di);
																			}
																			Arrays.sort((d));
																			if (print&&search(d)) {
																				mf.ta.append("第一步:" + (int) (af + 1) + "->" + (int) (ap + 1) + " " + "第二步:" + (int) (bf + 1) + "->" + (int) (bp + 1)
																						+ " " + "第三步:" + (int) (cf + 1) + "->" + (int) (cp + 1) + " " + "第四步:" + (int) (df + 1) + "->" + (int) (dp + 1)
																						+ " " + "第五步:" + (int) (ef + 1) + "->" + (int) (ep + 1) + " " + "第六步:" + (int) (ff + 1) + "->" + (int) (fp + 1)
																						+ " " + "第七步:" + (int) (gf + 1) + "->" + (int) (gp + 1) + " "+ "友方所剩攻击力为" + r.totalAttack + "\n");
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			r.conditon = n;
			r.attackNumber = 7;
			if (print) {
				mf.ta.append("攻击次数:" + r.attackNumber + " " + "所有可能的情况数:" + r.conditon + " " + "敌方能不能全清:" + r.possibility + "\n");
			}
		}

	}
}
