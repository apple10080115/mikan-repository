package remakeBattle.remakeBattlePrinter;

import java.util.Random;

import remakeBattle.remakeBattleCharacter.Character;
import remakeBattle.remakeBattleCharacter.Dragon;
import remakeBattle.remakeBattleCharacter.MetalSlime;
import remakeBattle.remakeBattleCharacter.Player;
import remakeBattle.remakeBattleTools.RemakeBattleTools;
/**
 * プリンタークラス
 */
public class RemakeBattlePrinter {
	
	/** 連勝数をカウント */
	private int winCounter = 0;
	
	/**
	 * 敵が魔法を使った時に画面に内容を出力する
	 * @param c1
	 * @param c2
	 * @param magicDamegeOrHeal
	 */
	public static void magicTypePrint(Character c1, Character c2, int[] magicDamegeOrHeal) {
		switch (magicDamegeOrHeal[1]) {
		case 1:
			c1.setHp(c1.getHp() - magicDamegeOrHeal[0]);
			c2.setMp(c2.getMp() - 5);
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			if (c1 instanceof MetalSlime) {
				System.out.println(c1.getName() + "には効かないようだ…\n");
				break;
			}
			System.out.println(c1.getName() + "に" + magicDamegeOrHeal[0] + "のダメージ！\n");
			break;
		case 2:
			c1.setHp(c1.getHp() - magicDamegeOrHeal[0]);
			c2.setMp(c2.getMp() - 5);
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			if (c1 instanceof MetalSlime) {
				System.out.println(c1.getName() + "には効かないようだ…\n");
				break;
			}
			System.out.println(c1.getName() + "に" + magicDamegeOrHeal[0] + "のダメージ！\n");
			break;
		case 3:
			c1.setHp(c1.getHp() - magicDamegeOrHeal[0]);
			c2.setMp(c2.getMp() - 10);
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			if (c1 instanceof MetalSlime) {
				System.out.println(c1.getName() + "には効かないようだ…\n");
				break;
			}
			System.out.println(c1.getName() + "に" + magicDamegeOrHeal[0] + "のダメージ！\n");
			break;
		case 4:
			System.out.println(c2.getName() + "のフレア！\n");
			c1.setHp(c1.getHp() - magicDamegeOrHeal[0]);
			c2.setMp(c2.getMp() - 40);
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			System.out.println(c1.getName() + "に" + magicDamegeOrHeal[0] + "のダメージ！\n");
			break;			
		case 5:
			System.out.println(c2.getName() + "のヒール！\n");
			c2.setHp(c2.getHp() + magicDamegeOrHeal[0]);
			c2.setMp(c2.getMp() - 12);
			for ( ; c2.getHp() > c2.getMaxHp(); magicDamegeOrHeal[0]--) {
				c2.setHp(c2.getHp() - 1);				
			}
			if (magicDamegeOrHeal[0] < 0) {
				magicDamegeOrHeal[0] = 0;
			}
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			System.out.println(c2.getName() + "は" + magicDamegeOrHeal[0] + "回復した！\n");
			break;	
		}
		
	}

	/**
	 * 力をためた際にその内容を出力する
	 * @param c		キャラクターインスタンス
	 */
	public static void chargePowerPrint(Character c) {
		System.out.println(c.getName() + "は力をためた！\n");
	}
	
	/**
	 * MPが足りなかった時の内容を出力する
	 */
	public static void notEnoughMp(Character c) {
		if (c instanceof Player) {
			System.out.println("しかしMPが足りない！");			
		} else {
			System.out.println("しかしMPが足りなかった！");
		}		
	}
	
	/**
	 * MPが足りなかった時の魔法宣言を表示する
	 * @param enemy			敵インスタンス
	 * @param randomMagic	撃つ魔法
	 */
	public static void notEnoughMpMagic(Character enemy, int randomMagic) {
		switch (randomMagic) {
			case 0:
				System.out.println(enemy.getName() + "のファイヤー！\n");
				try {
					RemakeBattleTools.sleep();				
				} catch (Exception e) {
					System.err.println("例外発生: " + e.getMessage());
				}
				break;
			case 1:
				System.out.println(enemy.getName() + "のウォータ！\n");
				try {
					RemakeBattleTools.sleep();				
				} catch (Exception e) {
					System.err.println("例外発生: " + e.getMessage());
				}
				break;
			case 2:
				System.out.println(enemy.getName() + "のサンダー！\n");
				try {
					RemakeBattleTools.sleep();				
				} catch (Exception e) {
					System.err.println("例外発生: " + e.getMessage());
				}
				break;
			case 3:
				if (enemy instanceof Dragon) {
					System.out.println(enemy.getName() + "のフレア\n！");
					break;
				}
				System.out.println(enemy.getName() + "のファイヤー\n！");
				break;
			case 4:
				System.out.println(enemy.getName() + "のヒール\n！");
				try {
					RemakeBattleTools.sleep();				
				} catch (Exception e) {
					System.err.println("例外発生: " + e.getMessage());
				}
				break;
		}
	}
	
	/**
	 * クリティカルアタック発生時に内容を出力する<br>
	 * 発生したのがプレイヤーか敵かによって出力する内容を変える
	 * @param c		キャラクターインスタンス
	 */
	public static void criticalAttackPrint(Character c) {
		if (c instanceof Player) {
			System.out.println("会心の一撃！\n");			
		} else {
			System.out.println("痛恨の一撃！\n");			
		}
		
	}
	
	/**
	 * 敵の出現時の文章を出力する
	 * @param enemy		敵インスタンス
	 */
	public void appearedEnemy(Character enemy) {
		System.out.println();
		int randomPrint = new Random().nextInt(2);
		switch (randomPrint) {
		case 0:
			System.out.println(enemy.getName() + "があらわれた！\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			break;
		case 1:
			System.out.println(enemy.getName() + "が飛び出してきた！\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			break;
		case 2:
			System.out.println(enemy.getName() + "がおそってきた！\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				 System.err.println("例外発生: " + e.getMessage());
			}
			break;	
		}	
		
	}
	
	/**
	 * プレイヤー、敵の名前、HP,MPなどの情報、選択出来る戦闘コマンドを表示する
	 * @param player	プレイヤーインスタンス
	 * @param enemy		敵インスタンス
	 */
	public void battleGui(Player player, Character enemy) {
		System.out.println("\n" + player.getName() + "　HP：" + player.getHp() + "　MP：" + player.getMp() + "\n");
		System.out.println(enemy.getName() + "　HP：" + enemy.getHp() + " \n");
		System.out.println("1：たたかう\n2：魔法\n3：ためる\n4：逃げる");
	}
	
	/**
	 * 選択できる魔法コマンドを表示する
	 */
	public void magicGui() {
		System.out.println("\n1：ファイヤー　消費MP 5\n2：ウォーター　消費MP 5\n"
				+ "3：サンダー　消費MP 10\n4：ヒール　消費MP 12\n5：戻る\n");
	}
	
	/**
	 * ゲーム終了時に勝利したのか敗北したのかによって内容を出力する
	 * @param player	プレイヤーインスタンス
	 * @param enemy		敵インスタンス
	 */
	public boolean gameoverResultPrint(Character player, Character enemy) {
		boolean b = true;
		if (enemy.getHp() == 10000 && player.getHp() == 0) {
			System.out.println(enemy.getName() + "に逃げられてしまった…\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				 System.err.println("例外発生: " + e.getMessage());
			}
			System.out.println("連勝数は" + getWinCounter() + "回でした。\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			b = false;
		} else if (enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "を倒した！\n");
			setWinCounter(getWinCounter() + 1);
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				 System.err.println("例外発生: " + e.getMessage());
			}
			System.out.println("連戦しますか？\n1：連戦する\n2：ゲームを終了する\n"
					+ "(連勝数：" + getWinCounter() + ")\n");
		} else {
			System.out.println(enemy.getName() + "に倒されてしまった！\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				 System.err.println("例外発生: " + e.getMessage());
			}
			System.out.println("連勝数は" + getWinCounter() + "回でした。\n");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
			b = false;
		}
		return b;
	}
	
	/**
	 * ゲーム終了時のメッセージを出力する
	 */
	public void gameoverMessage() {
		if (getWinCounter() >= 5) {
			System.out.println("congratulations!");
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
		}
		System.out.println("お疲れ様でした。");
		try {
			RemakeBattleTools.sleep();				
		} catch (Exception e) {
			 System.err.println("例外発生: " + e.getMessage());
		}
	}

	public int getWinCounter() {
		return winCounter;
	}

	public void setWinCounter(int winCounter) {
		this.winCounter = winCounter;
	}
	
}
