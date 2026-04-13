package remakeBattle.remakeBattleCharacter;

import remakeBattle.remakeBatteleCalc.RemakeBattleCalc;
import remakeBattle.remakeBattlePrinter.RemakeBattlePrinter;
import remakeBattle.remakeBattleTools.RemakeBattleTools;

/**
 * メタルスライムクラス
 */
public class MetalSlime extends Character {

	/**
	 * コンストラクタ
	 * @param name			名前
	 * @param hp			HP
	 * @param maxHp			最大HP
	 * @param mp			MP
	 * @param maxMp			最大MP
	 * @param chargePower	溜めている力
	 */
	public MetalSlime(String name, int hp, int maxHp, int mp, int maxMp, int chargePower) {
		super(name, hp, maxHp, mp, maxMp, chargePower);
	}

	@Override
	public void attack(Character player, Character enemy) {
		System.out.println(getName() + "のこうげき！\n");
		int[] damage = RemakeBattleCalc.enemyAttackDamage(player, enemy);
		if (damage[1] == 1) {
			RemakeBattlePrinter.criticalAttackPrint(enemy);
			try {
				RemakeBattleTools.sleep();				
			} catch (Exception e) {
				System.err.println("例外発生: " + e.getMessage());
			}
		}
		System.out.println(player.getName() + "に" + damage[0] + "のダメージ！\n");
	}


	@Override
	public boolean magic(Character player, Character enemy) {
		int[] magicDamegeOrHeal = RemakeBattleTools.enemyRandomMagic(player, enemy);
		if(magicDamegeOrHeal[0] == 0 && magicDamegeOrHeal[1] == 0) {
			return true;
		}
		RemakeBattlePrinter.magicTypePrint(player, enemy, magicDamegeOrHeal);
		return true;
	}
	
	public void run(Character player, Character enemy) {
		System.out.println(getName() + "は逃げ出した！\n");
		player.setHp(0);
		enemy.setHp(10000);
	}
}
