package com.mikanGames.battleGame.characters;

import com.mikanGames.battleGame.BattleGameCalc;

/**
 * プレイヤークラス
 */
public class Player extends Character {

    private int lv;

    public Player(String name, int hp, int maxHp, int mp, int maxMp, int attackPower, int magicPower, int phyDefense, int magDefense, int speed, int lack, String abnormalStatus, int lv) {
        super(name, hp, maxHp, mp, maxMp, attackPower, magicPower, phyDefense, magDefense, speed, lack, abnormalStatus);
        this.lv = lv;
    }

    @Override
    public int attack(Character enemy) {
        int damage = new BattleGameCalc().playerAttackDamage(this, enemy);
        enemy.setHp(enemy.getHp() - damage);
        return damage;
    }

    @Override
    public int magic(Character enemy) {
        return 0;
    }

}
