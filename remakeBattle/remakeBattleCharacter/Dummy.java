package remakeBattle.remakeBattleCharacter;

/**
 * ダミークラス
 */
public class Dummy extends Character {
	
	/**
	 * コンストラクタ
	 * @param name			名前
	 * @param hp			HP
	 * @param maxHp			最大HP
	 * @param mp			MP
	 * @param maxMp			最大MP
	 * @param chargePower	溜めている力
	 */
	public Dummy(String name, int hp, int maxHp, int mp, int maxMp, int chargePower) {
		super(name, hp, maxHp, mp, maxMp, chargePower);
	}
	@Override
	public void attack(Character player, Character enemy) {
		System.out.println(getName() + "は攻撃できない\n");
	}

	@Override
	public boolean magic(Character player, Character enemy) {
		System.out.println(getName() + "は攻撃できない\n");
		return true;
	}

}
