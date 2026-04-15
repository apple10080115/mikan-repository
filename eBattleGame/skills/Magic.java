package eBattleGame.skills;

/**
 * 魔法クラス
 */
public class Magic {
	
	/** 魔法名 */
	private String magicName;
	/** 属性 */
	private String type;
	/** 魔法ランク */
	private int magicRank;
	/** 基礎魔法力 */
	private int baseMagicPower;
	/** 消費MP */
	private int mpConsumption;
	
	/**
	 * コンストラクタ
	 * @param magicName			魔法名
	 * @param type				属性
	 * @param magicRank			魔法ランク
	 * @param baseMagicPower	基礎魔法力
	 * @param mpConsumption		消費MP
	 */
	public Magic(String magicName, String type, int magicRank, int baseMagicPower, int mpConsumption) {
		this.magicName = magicName;
		this.type = type;
		this.magicRank = magicRank;
		this.baseMagicPower = baseMagicPower;
		this.mpConsumption = mpConsumption;
	}

	/**
	 * フィア
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic fiar() {
		return new Magic("フィア","火",1,7,11);
	}
	
	/**
	 * フィアラ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic fiara() {
		return new Magic("フィアラ","火",2,17,22);
	}
	
	/**
	 * フィアート
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic fiart() {
		return new Magic("フィアート","火",3,27,55);
	}
	
	/**
	 * ウェトラ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic wetra() {
		return new Magic("ウェトラ","水",1,5,7);
	}
	
	/**
	 * ウェトール
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic wetorl() {
		return new Magic("ウェトール","水",2,25,32);
	}
	
	/**
	 * ウェトニエル
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic wetoniel() {
		return new Magic("ウェトニエル","水",3,35,73);
	}
	
	/**
	 * リファ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic rifa() {
		return new Magic("リファ","木",1,6,8);
	}
	
	/**
	 * リファルテ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic rifarte() {
		return new Magic("リファルテ","木",2,21,28);
	}
	
	/**
	 * リファルセイン
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic rifarcein() {
		return new Magic("リファルセイン","木",3,32,64);
	}
	
	/**
	 * ベルファ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic belfa() {
		return new Magic("ベルファ","光",1,10,8);
	}
	
	/**
	 * ベルファーレ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic belfalle() {
		return new Magic("ベルファーレ","光",2,27,38);
	}
	
	/**
	 * ベルファルカ
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic belfalca() {
		return new Magic("ベルファルカ","光",3,55,87);
	}
	
	/**
	 * ダレス
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic daless() {
		return new Magic("ダレス","闇",1,9,13);
	}
	
	/**
	 * ダレスト
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic dalest() {
		return new Magic("ダレスト","闇",2,29,33);
	}
	
	/**
	 * ダレスエルド
	 * @return	魔法名と魔法の属性、魔法ランク、基礎魔法力、消費MPを初期化した魔法インスタンス
	 */
	public static Magic dalesseld() {
		return new Magic("ダレスエルド","闇",3,49,66);
	}

	
	
	public String getMagicName() {
		return magicName;
	}

	public void setMagicName(String magicName) {
		this.magicName = magicName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMagicRank() {
		return magicRank;
	}

	public void setMagicRank(int magicRank) {
		this.magicRank = magicRank;
	}

	public int getBaseMagicPower() {
		return baseMagicPower;
	}

	public void setBaseMagicPower(int baseMagicPower) {
		this.baseMagicPower = baseMagicPower;
	}

	public int getMpConsumption() {
		return mpConsumption;
	}

	public void setMpConsumption(int mpConsumption) {
		this.mpConsumption = mpConsumption;
	}
	
}