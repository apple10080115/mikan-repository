package remakeBattle.remakeBatteleCalc;

import java.util.Random;

import remakeBattle.remakeBattleCharacter.Character;
import remakeBattle.remakeBattleCharacter.Dragon;
import remakeBattle.remakeBattleCharacter.Ghost;
import remakeBattle.remakeBattleCharacter.Goblin;
import remakeBattle.remakeBattleCharacter.MetalSlime;
import remakeBattle.remakeBattleCharacter.Slime;
import remakeBattle.remakeBattlePrinter.RemakeBattlePrinter;
import remakeBattle.remakeBattleTools.RemakeBattleTools;

/**
 * 計算クラス
 */
public class RemakeBattleCalc {
	
	/**
	 * プレイヤーの攻撃のダメージを計算し、その値を敵のHPから引く
	 * @param enemy		Character型の敵インスタンス
	 */
	public static int playerAttackDamage(Character player, Character enemy) {
		int randomDamage = new Random().nextInt(40) + 1;
		int criticalAttack = new Random().nextInt(16);
		// 16分の1の確率でダメージが2倍になる
		if (criticalAttack == 0) {
			randomDamage *= 2;
		}
		switch (player.getChargePower()) {
			case 0:
				break;
			case 1:
				randomDamage *= 2;
				player.setChargePower(0);
				break;
			case 2:
				randomDamage *= 3.5;
				player.setChargePower(0);
				break;
			default:
				randomDamage *= 5;
				player.setChargePower(0);
				break;
		}
		if (enemy instanceof MetalSlime) {
			int miss = new Random().nextInt(4);
			if (!(miss == 0)) {
				randomDamage = 0;
			}
		}
		enemy.setHp(enemy.getHp() - randomDamage);
		try {
			RemakeBattleTools.sleep();			
		} catch (Exception e) {
			System.err.println("例外発生" + e.getMessage());
		}
		return randomDamage;
	}
	
	/**
	 * スライムの攻撃のダメージを計算する
	 * @param player	プレイヤーインスタンス
	 * @return			計算したダメージを返す
	 */
	public static int[] enemyAttackDamage(Character player, Character enemy) {
		int[] randomDamage = {1, 0};
		int criticalAttack = new Random().nextInt(16);
		if (enemy instanceof Slime) {
			randomDamage[0] = new Random().nextInt(10) + 1;
			criticalAttack = new Random().nextInt(16);
			// 16分の1の確率でダメージが2倍になる
			if (criticalAttack == 0) {
				randomDamage[0] *= 2;
				randomDamage[1] = 1;
			}
			switch (enemy.getChargePower()) {
			case 0:
				break;
			case 1:
				randomDamage[0] *= 2;
				enemy.setChargePower(0);
				break;
			case 2:
				randomDamage[0] *= 3.5;
				enemy.setChargePower(0);
				break;
			case 3:
				randomDamage[0] *= 5;
				enemy.setChargePower(0);
				break;
			}
			player.setHp(player.getHp() - randomDamage[0]);
			try {
				RemakeBattleTools.sleep();			
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}			
		} else if (enemy instanceof Goblin) {
			randomDamage[0] = new Random().nextInt(25) + 10;
			criticalAttack = new Random().nextInt(16);
			// 16分の1の確率でダメージが2倍になる
			if (criticalAttack == 0) {
				randomDamage[0] *= 2;
				randomDamage[1] = 1;
			}
			switch (enemy.getChargePower()) {
			case 0:
				break;
			case 1:
				randomDamage[0] *= 2;
				enemy.setChargePower(0);
				break;
			case 2:
				randomDamage[0] *= 3.5;
				enemy.setChargePower(0);
				break;
			case 3:
				randomDamage[0] *= 5;
				enemy.setChargePower(0);
				break;
			}
			player.setHp(player.getHp() - randomDamage[0]);
			try {
				RemakeBattleTools.sleep();			
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}			
		} else if (enemy instanceof MetalSlime) {
			randomDamage[0] = new Random().nextInt(15) + 1;
			criticalAttack = new Random().nextInt(16);
			// 16分の1の確率でダメージが2倍になる
			if (criticalAttack == 0) {
				randomDamage[0] *= 2;
				randomDamage[1] = 1;
			}
			switch (enemy.getChargePower()) {
			case 0:
				break;
			case 1:
				randomDamage[0] *= 2;
				enemy.setChargePower(0);
				break;
			case 2:
				randomDamage[0] *= 3.5;
				enemy.setChargePower(0);
				break;
			case 3:
				randomDamage[0] *= 5;
				enemy.setChargePower(0);
				break;
			}
			player.setHp(player.getHp() - randomDamage[0]);
			try {
				RemakeBattleTools.sleep();			
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}			
		} else if (enemy instanceof Ghost) {
			randomDamage[0] = new Random().nextInt(25) + 5;
			criticalAttack = new Random().nextInt(16);
			// 16分の1の確率でダメージが2倍になる
			if (criticalAttack == 0) {
				randomDamage[0] *= 2;
				randomDamage[1] = 1;
			}
			switch (enemy.getChargePower()) {
			case 0:
				break;
			case 1:
				randomDamage[0] *= 2;
				enemy.setChargePower(0);
				break;
			case 2:
				randomDamage[0] *= 3.5;
				enemy.setChargePower(0);
				break;
			case 3:
				randomDamage[0] *= 5;
				enemy.setChargePower(0);
				break;
			}
			player.setHp(player.getHp() - randomDamage[0]);
			try {
				RemakeBattleTools.sleep();			
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}			
		} else if (enemy instanceof Dragon) {
			randomDamage[0] = new Random().nextInt(50) + 20;
			criticalAttack = new Random().nextInt(16);
			// 16分の1の確率でダメージが2倍になる
			if (criticalAttack == 0) {
				randomDamage[0] *= 2;
				randomDamage[1] = 1;
			}
			switch (enemy.getChargePower()) {
			case 0:
				break;
			case 1:
				randomDamage[0] *= 2;
				enemy.setChargePower(0);
				break;
			case 2:
				randomDamage[0] *= 3.5;
				enemy.setChargePower(0);
				break;
			case 3:
				randomDamage[0] *= 5;
				enemy.setChargePower(0);
				break;
			}
			player.setHp(player.getHp() - randomDamage[0]);
			try {
				RemakeBattleTools.sleep();			
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}			
		}
		return randomDamage;
	}
	
	/**
	 * プレイヤーのHPの値をランダムに返す
	 * @return	150(最低値)にランダムで最大100を足したHPの値を返す
	 */
	public int playerRandomHp() {
		return new Random().nextInt(101) + 150;
	}
	
	/**
	 * プレイヤーのMPの値をランダムに返す
	 * @return	25(最低値)にランダムで最大50を足したMPの値を返す
	 */
	public int playerRandomMp() {
		return new Random().nextInt(51) + 25;
	}
	
	/**
	 * 敵のHPの値をランダムに返す
	 * @return	10(最低値)にランダムで最大10を足したHPの値を返す
	 */
	public int enemyRandomHp() {
		return new Random().nextInt(10) + 10;
	}

	/**
	 * 敵のMPの値をランダムに返す
	 * @return	5(最低値)にランダムで最大5を足したMPの値を返す
	 */
	public int enemyRandomMp() {
		return new Random().nextInt(5) + 5;
	}
	
	/**
	 *  敵のHPの値をランダムに返すメソッドを繰り返し、その合計の値を返す
	 * @param randomEnemy	敵をランダムに抽選した際の数値<br>
	 * 						それぞれ決められた回数繰り返す
	 * @return				繰り返して合計した敵のHPの値を返す
	 */
	public int forEnemyHp(int randomEnemy) {
		int sum = 0;
		switch (randomEnemy) {
		case 0:
			for (int i = 0; i < 2; i++) {
				sum += enemyRandomHp();
			}
			break;
		case 1:
			for (int i = 0; i < 4; i++) {
				sum += enemyRandomHp();
			}
			break;
		case 2:
			for (int i = 0; i < 1 ; i++) {
				sum += enemyRandomHp();
			}
			break;
		case 3:
			for (int i = 0; i < 8; i++) {
				sum += enemyRandomHp();
			}
			break;
		case 4:
			for (int i = 0; i < 20; i++) {
				sum += enemyRandomHp();
			}
			break;
		}
		return sum;
	}
	
	/**
	 *  敵のMPの値をランダムに返すメソッドを繰り返し、その合計の値を返す
	 * @param randomEnemy	繰り返す基礎回数(敵をランダムに抽選した際の数値)<br>
	 * 						基礎回数にそれぞれ調整した回数繰り返す
	 * @return				繰り返して合計した敵のMPの値を返す
	 */
	public int forEnemyMp(int randomEnemy) {
		int sum = 0;
		switch (randomEnemy) {
			case 0:
				for (int i = 0; i < randomEnemy + 1; i++) {
					sum += enemyRandomHp();
				}
				break;
			case 1:
				for (int i = 0; i < randomEnemy + 3; i++) {
					sum += enemyRandomHp();
				}
				break;
			case 2:
				for (int i = 0; i < 1 ; i++) {
					sum += enemyRandomHp();
				}
				break;
			case 3:
				for (int i = 0; i < randomEnemy + 7; i++) {
					sum += enemyRandomHp();
				}
				break;
			case 4:
				for (int i = 0; i < randomEnemy + 15; i++) {
					sum += enemyRandomHp();
				}
				break;
		}
		return sum;
	}
	
	/**
	 * ファイヤー
	 * @param c		キャラクターインスタンス
	 * @return		ダメージの値を返す
	 */
	public int fire(Character c) {
		int fireDamage = new Random().nextInt(25) + 15;
		int criticalAttack = new Random().nextInt(16);
		System.out.println(c.getName() + "のファイア！\n");
		// 16分の1の確率でダメージが2倍になる
		if (criticalAttack == 0) {
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			RemakeBattlePrinter.criticalAttackPrint(c);
			fireDamage *= 2;
		}
		return fireDamage;
	}
	
	/**
	 * ウォーター
	 * @param c		キャラクターインスタンス
	 * @return		ダメージの値を返す
	 */
	public int water(Character c) {
		int waterDamage = new Random().nextInt(45) + 5;
		int criticalAttack = new Random().nextInt(16);
		System.out.println(c.getName() + "のウォーター！\n");
		// 16分の1の確率でダメージが2倍になる
		if (criticalAttack == 0) {
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			RemakeBattlePrinter.criticalAttackPrint(c);
			waterDamage *= 2;
		}
		return waterDamage;
	}
	
	/**
	 * サンダー
	 * @param c		キャラクターインスタンス
	 * @return		ダメージの値を返す
	 */
	public int thunder(Character c) {
		int thunderDamage = new Random().nextInt(30) + 20;
		int criticalAttack = new Random().nextInt(16);
		System.out.println(c.getName() + "のサンダー！\n");
		// 8分の1の確率でダメージが2倍になる
		if (criticalAttack == 0 || criticalAttack == 1) {
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			RemakeBattlePrinter.criticalAttackPrint(c);
			thunderDamage *= 2;
		}
		return thunderDamage;
	}
	
	/**
	 * フレア
	 * @param c		キャラクターインスタンス
	 * @return		ダメージの値を返す
	 */
	public int flare(Character c) {
		int flareDamage = new Random().nextInt(120) + 50;
		return flareDamage;
	}
	
	/**
	 * ヒール
	 * @param c		キャラクターインスタンス
	 * @return		回復量の値を返す
	 */
	public int heal(Character c) {
		int healHp = new Random().nextInt(50) + 10;
		return healHp;
	}
	
}