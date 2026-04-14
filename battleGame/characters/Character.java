package com.mikanGames.battleGame.characters;

/**
 * キャラクタースーパークラス
 */
public abstract class Character {

    private String name;
    private int hp;
    private int maxHp;
    private int mp;
    private int maxMp;
    private int attackPower;
    private int magicPower;
    private int phyDefense;
    private int magDefense;
    private int speed;
    private int lack;
    private String type;
    private String abnormalStatus = "";


    public abstract int attack(Character c);

    public abstract int magic(Character c);

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLack() {
        return lack;
    }

    public void setLack(int lack) {
        this.lack = lack;
    }

    public int getMagDefense() {
        return magDefense;
    }

    public void setMagDefense(int magDefense) {
        this.magDefense = magDefense;
    }

    public int getPhyDefense() {
        return phyDefense;
    }

    public void setPhyDefense(int phyDefense) {
        this.phyDefense = phyDefense;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbnormalStatus() {
        return abnormalStatus;
    }

    public void setAbnormalStatus(String abnormalStatus) {
        this.abnormalStatus = abnormalStatus;
    }

}
