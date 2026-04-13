package remakeBattle.remakeBattleCharacter;

/**
 * キャラクタークラス
 */
public abstract class Character {

	/** 名前 */
	private String name;
	/** HP */
	private int hp;
	/** 最大HP */
	private int maxHp;
	/** MP */
	private int mp;
	/** 最大MP */
	private int maxMp;
	/** 溜めている力の数値 */
	private int chargePower;
	
	/**
	 * コンストラクタ
	 * @param name			名前
	 * @param hp			HP
	 * @param maxHp			最大HP
	 * @param mp			MP
	 * @param maxMp			最大MP
	 * @param chargePower	溜めている力
	 */
	public Character(String name, int hp, int maxHp, int mp, int maxMp, int chragePower) {
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.mp = mp;
		this.maxMp = maxMp;
		this.chargePower = chragePower;
	}
	
	public abstract void attack(Character c, Character c2);
	public abstract boolean magic(Character c, Character c2);
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}
	
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getMaxMp() {
		return maxMp;
	}
	
	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	public int getChargePower() {
		return chargePower;
	}

	public void setChargePower(int chargePower) {
		this.chargePower = chargePower;
	}
	
}
