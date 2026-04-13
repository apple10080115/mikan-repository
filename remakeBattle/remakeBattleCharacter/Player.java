package remakeBattle.remakeBattleCharacter;

import remakeBattle.remakeBatteleCalc.RemakeBattleCalc;
import remakeBattle.remakeBattlePrinter.RemakeBattlePrinter;
import remakeBattle.remakeBattleTools.RemakeBattleTools;
/**
 * プレイヤークラス
 */
public class Player extends Character {

	/**
	 * コンストラクタ
	 * @param name			名前
	 * @param hp			HP
	 * @param maxHp			最大HP
	 * @param mp			MP
	 * @param maxMp			最大MP
	 * @param chargePower	溜めている力
	 */
	public Player(String name, int hp, int maxHp, int mp, int maxMp, int chargePower) {
		super(name, hp, maxHp, mp, maxMp, chargePower);
	}

	@Override
	public void attack(Character player, Character enemy) {
		System.out.println("\n" + getName() + "のこうげき！\n");
		int damage = RemakeBattleCalc.playerAttackDamage(player, enemy);
		if (damage > 0) {
			System.out.println(enemy.getName() + "に" + damage + "のダメージ！\n");			
		} else {
			System.out.println("しかしかわされてしまった！\n");			
			
		}
	}

	@Override
	public boolean magic(Character player, Character enemy) {
		boolean magicCancel = true;
		int[] damageOrHealOrCancel = RemakeBattleTools.playerMagic(player, enemy);
		if (damageOrHealOrCancel[0] == 0 && damageOrHealOrCancel[1] == 0) {
			try {
				RemakeBattleTools.sleep();					
			} catch (Exception e) {
				System.err.println("例外発生" + e.getMessage());
			}
			magicCancel = false;
		} else if (damageOrHealOrCancel[0] == 0 && damageOrHealOrCancel[1] == 10) {
			magicCancel = false;
		}
		RemakeBattlePrinter.magicTypePrint(enemy, player, damageOrHealOrCancel);
		return magicCancel;
	}

	/**
	 * 逃げる(コマンドとして用意しているが、実際に成功することはない)
	 */
	public void run() {
		System.out.println("\n" + getName() + "は逃げた！\n");
		try {
			RemakeBattleTools.sleep();					
		} catch (Exception e) {
			System.err.println("例外発生" + e.getMessage());
		}
		System.out.println("しかし回り込まれてしまった！\n");
	
	}
}
