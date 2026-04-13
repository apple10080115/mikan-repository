package remakeBattle.remakeBattleTools;

import java.util.Random;

import lib.Input;
import remakeBattle.remakeBatteleCalc.RemakeBattleCalc;
import remakeBattle.remakeBattleCharacter.Character;
import remakeBattle.remakeBattleCharacter.Dragon;
import remakeBattle.remakeBattleCharacter.Dummy;
import remakeBattle.remakeBattleCharacter.Ghost;
import remakeBattle.remakeBattleCharacter.Goblin;
import remakeBattle.remakeBattleCharacter.MetalSlime;
import remakeBattle.remakeBattleCharacter.Player;
import remakeBattle.remakeBattleCharacter.Slime;
import remakeBattle.remakeBattlePrinter.RemakeBattlePrinter;

/**
 * ツールクラス<br>
 * プレイヤーの生成、敵の生成などを行います
 */
public class RemakeBattleTools {
	
	/**
	 * 1.5秒スリープする
	 * @throws Exception	
	 */
	public static void sleep() throws Exception {
		Thread.sleep(1500);
	}
	
	/**
	 * 選択された魔法(またはキャンセル)を返す
	 * @param player	プレイヤーインスタンス
	 * @param enemy		敵インスタンス
	 * @return			どの魔法を使うかと、そのダメージ量または回復量を返す
	 */
	public static int[] playerMagic(Character player, Character enemy) {
		RemakeBattleCalc rbc = new RemakeBattleCalc();
		RemakeBattleTools rbt = new RemakeBattleTools();
		boolean mpJudgment = true;
		int[] magicDamageOrHealOrCancel =  new int[] {0, 0};
		int choiceMagic = Input.getInt("");
		switch (choiceMagic) {
		case 1:
			mpJudgment = rbt.mpJudgment(player, choiceMagic);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMp(player);
				break;
			}
			magicDamageOrHealOrCancel[0] = rbc.fire(player);
			magicDamageOrHealOrCancel[1] = 1;
			if (enemy instanceof MetalSlime) {
				magicDamageOrHealOrCancel[0] = 0;
			}
			break;
		case 2:
			mpJudgment = rbt.mpJudgment(player, choiceMagic);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMp(player);
				break;
			}
			rbt.mpJudgment(player, choiceMagic);
			magicDamageOrHealOrCancel[0] = rbc.water(player);
			magicDamageOrHealOrCancel[1] = 2;
			if (enemy instanceof MetalSlime) {
				magicDamageOrHealOrCancel[0] = 0;
			}
			break;
		case 3:
			mpJudgment = rbt.mpJudgment(player, choiceMagic);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMp(player);
				break;
			}
			rbt.mpJudgment(player, choiceMagic);
			magicDamageOrHealOrCancel[0] = rbc.thunder(player);
			magicDamageOrHealOrCancel[1] = 3;
			if (enemy instanceof MetalSlime) {
				magicDamageOrHealOrCancel[0] = 0;
			}
			break;
		case 4:
			mpJudgment = rbt.mpJudgment(player, choiceMagic);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMp(player);
				break;
			}
			rbt.mpJudgment(player, choiceMagic);
			magicDamageOrHealOrCancel[0] = rbc.heal(player);
			magicDamageOrHealOrCancel[1] = 5;
			break;
		case 5:
			magicDamageOrHealOrCancel[0] = 0;
			magicDamageOrHealOrCancel[1] = 10;
			break;
		default:
			System.out.println("魔法が正しく選択されませんでした\n");
		}
		return magicDamageOrHealOrCancel;
	}
	
	/**
	 * 敵の魔法をランダムに返す
	 * @param player	プレイヤーインスタンス
	 * @param enemy		敵インスタンス
	 * @return			どの魔法を使うかと、そのダメージ量または回復量を返す
	 */
	public static int[] enemyRandomMagic(Character player, Character enemy) {
		RemakeBattleCalc rbc = new RemakeBattleCalc();
		RemakeBattleTools rbt = new RemakeBattleTools();
		boolean mpJudgment = true;
		int[] magicDamageOrHeal =  new int[] {0, 0};
		int randomMagicNumber = new Random().nextInt(5);
		switch (randomMagicNumber) {
		case 0:
			mpJudgment = rbt.mpJudgment(enemy, randomMagicNumber);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMpMagic(enemy, randomMagicNumber);
				RemakeBattlePrinter.notEnoughMp(enemy);
				break;
			}
			magicDamageOrHeal[0] = rbc.fire(enemy);
			magicDamageOrHeal[1] = 1;
			break;
		case 1:
			mpJudgment = rbt.mpJudgment(enemy, randomMagicNumber);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMpMagic(enemy, randomMagicNumber);
				RemakeBattlePrinter.notEnoughMp(enemy);
				break;
			}
			rbt.mpJudgment(enemy, randomMagicNumber);
			magicDamageOrHeal[0] = rbc.water(enemy);
			magicDamageOrHeal[1] = 2;
			break;
		case 2:
			mpJudgment = rbt.mpJudgment(enemy, randomMagicNumber);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMpMagic(enemy, randomMagicNumber);
				RemakeBattlePrinter.notEnoughMp(enemy);
				break;
			}
			rbt.mpJudgment(enemy, randomMagicNumber);
			magicDamageOrHeal[0] = rbc.thunder(enemy);
			magicDamageOrHeal[1] = 3;
			break;
		case 3:
			mpJudgment = rbt.mpJudgment(enemy, randomMagicNumber);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMpMagic(enemy, randomMagicNumber);
				RemakeBattlePrinter.notEnoughMp(enemy);
				break;
			}
			rbt.mpJudgment(enemy, randomMagicNumber);
			if (enemy instanceof Dragon) {
				magicDamageOrHeal[0] = rbc.flare(enemy);
				magicDamageOrHeal[1] = 4;
				break;
			} 
			magicDamageOrHeal[0] = rbc.fire(enemy);
			magicDamageOrHeal[1] = 1;
			break;
		case 4:
			mpJudgment = rbt.mpJudgment(enemy, randomMagicNumber);
			if (!mpJudgment) {
				RemakeBattlePrinter.notEnoughMpMagic(enemy, randomMagicNumber);
				RemakeBattlePrinter.notEnoughMp(enemy);
				break;
			}
			rbt.mpJudgment(enemy, randomMagicNumber);
			magicDamageOrHeal[0] = rbc.heal(enemy);
			magicDamageOrHeal[1] = 5;
			break;
		}
		return magicDamageOrHeal;
	}
	
	/**
	 * プレイヤーの生成
	 * @return	名前、HP、MPを持ったプレイヤーを返す
	 */
	public Player bearPlayer() {
		RemakeBattleCalc rbc = new RemakeBattleCalc();
		String playerName = Input.getString("あなたの名前を入力してください");
		if (playerName == null) {
			playerName = "名無し";
		}
		int hp = rbc.playerRandomHp();
		int mp = rbc.playerRandomMp();
		Player player = new Player(playerName, hp, hp, mp, mp, 0);
		return player;
	}

	/**
	 * 敵の生成
	 * @return	名前、HP、最大HP、MP、最大MPをもったランダムな敵を返す
	 */
	public Character bearRandomEnemy() {
		RemakeBattleCalc rbc = new RemakeBattleCalc();
		int randomEnemy = new Random().nextInt(5);
		int hp = rbc.forEnemyHp(randomEnemy);
		int mp = rbc.forEnemyMp(randomEnemy);
		Character enemy = new Dummy("ダミー", 1 , 1 , 1, 1, 0);
		switch (randomEnemy) {
		case 0:
			Character slime = new Slime("スライム", hp, hp, 
					mp, mp, 0);
			enemy = slime;
			break;
		case 1:
			Character gobline = new Goblin("ゴブリン", hp, hp, 
					mp, mp, 0);
			enemy = gobline;
			break;
		case 2:
			Character metalSlime = new MetalSlime("メタルスライム", hp, hp, 
					mp, mp, 0);
			enemy = metalSlime;
			break;
		case 3:
			Character ghost = new Ghost("ゴースト", hp, hp, 
					mp, mp, 0);
			enemy = ghost;
			break;
		case 4:
			Character dragon = new Dragon("ドラゴン", hp, hp, 
					mp, mp, 0);
			enemy = dragon;
			break;
		}
		return enemy;
	}
	
	/**
	 * プレイヤーの選択した行動を実行する<br>
	 * このメソッド内では、ゲームの終了条件を満たしていれば偽を返すメソッドgameoverJudgmentを呼び出している
	 * @param player	プレイヤーインスタンス
	 * @param enemy		敵インスタンス
	 * @param choice	プレイヤーの行動の選択
	 * @return			ゲームが続けられる場合は真を、ゲームを終わらせられる場合は偽を返す
	 */
	public boolean playerAction(Player player, Character enemy, int choice) {
		boolean gameover = true;
		switch (choice) {
		case 1:
			player.attack(player,enemy);
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			if (!gameover) {
				break;
			}
			enemyAction(player, enemy);
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			break;
		case 2:
			RemakeBattlePrinter rbp = new RemakeBattlePrinter();
			rbp.magicGui();
			boolean magicCancel = true;
			magicCancel = player.magic(player, enemy);
			if (!magicCancel) {
				break;
			}
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			if (!gameover) {
				break;
			}
			enemyAction(player, enemy);
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			break;
		case 3:
			player.setChargePower(player.getChargePower() + 1);
			RemakeBattlePrinter.chargePowerPrint(player);
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			enemyAction(player, enemy);
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			break;
		case 4:
			player.run();
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			enemyAction(player, enemy);
			if (!gameover) {
				break;
			}
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			gameover = gameoverJudgment(player, enemy);
			break;
		default:
			System.out.println("\n行動を選択してください！\n");
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			
		}
		return gameover;
	}
	
	/**
	 * 敵の行動をランダムに決定する
	 * @param player	プレイヤーインスタンス
	 * @param enemy		敵インスタンス
	 */
	public void enemyAction(Player player, Character enemy) {
		int enemyAction = new Random().nextInt(4);
		switch (enemyAction) {
		case 0:
			enemy.attack(player, enemy);
			break;
		case 1:
			enemy.magic(player, enemy);
			break;
		case 2:
			enemy.setChargePower(enemy.getChargePower() + 1);
			RemakeBattlePrinter.chargePowerPrint(enemy);
			break;
		case 3:
			if (enemy instanceof MetalSlime) {
				MetalSlime metalSlime = (MetalSlime) enemy;
				metalSlime.run(player, enemy);
			} else if (enemy instanceof Ghost) {
				enemy.magic(player, enemy);
			} else if (enemy instanceof Goblin) {
				enemy.setChargePower(enemy.getChargePower() + 1);
				RemakeBattlePrinter.chargePowerPrint(enemy);
			} else {
				enemy.attack(player, enemy);
			}
			break;
		}
		
	}
	
	/**
	 * 選択された値によってゲームを終了するか、連戦するかを決められる
	 * @return	真：連戦する、偽：ゲームを終了
	 */
	public boolean gameoverChoice() {
		boolean gameoverChoice = true;
		boolean b = true;
		int choice = Input.getInt("");
		while (b) {
			if (choice == 1) {
				gameoverChoice = true;
				b = false;
				try {
					RemakeBattleTools.sleep();				
				} catch (Exception e) {
					 System.err.println("例外発生: " + e.getMessage());
				}
			} else if (choice == 2) {
				gameoverChoice = false;
				b = false;
				try {
					RemakeBattleTools.sleep();				
				} catch (Exception e) {
					 System.err.println("例外発生: " + e.getMessage());
				}
			} else {
				System.out.println("正しく選択されませんでした\n");
				continue;
			}
		}
		return gameoverChoice;
	}
	
	/**
	 * 魔法を発動するためのMPが足りていれば真、足りなければ偽を返す
	 * @param c						キャラクターインスタンス
	 * @param randomMagicNumber		発動しようとしている魔法
	 * @return						MPが足りていれば真、足りなければ偽を返す
	 */
	public boolean mpJudgment(Character c, int magicNumber) {
		boolean mpJudgment = true;
		switch (magicNumber) {
			case 0:
			case 1:
				if (c.getMp() < 5) {
					mpJudgment = false;
				}
				break;
			case 2:
				if (c.getMp() < 10) {
					mpJudgment = false;
				}
				break;
			case 3:
				if (c instanceof Dragon) {
					if (c.getMp() < 25) {
						mpJudgment = false;
					}
				} else {
					if (c.getMp() < 10) {
						mpJudgment = false;
					}
				}
				break;
			case 4:
				if (c.getMp() < 12) {
					mpJudgment = false;
				}
				break;
		}
		return mpJudgment;
	}
	
	/**
	 * ゲームの終了条件を満たしているかを判定し、満たしていなければ真を、満たしていれば偽を返す。
	 * @return 	判定の結果を返す(真：ゲームを続ける、偽：ゲームを終わらせる)
	 */
	public boolean gameoverJudgment(Player player, Character enemy) {
		boolean gameover = true;
		if (player.getHp() <= 0 || enemy.getHp() <= 0) {
			gameover = false;
		}
		return gameover;
	}
	
}