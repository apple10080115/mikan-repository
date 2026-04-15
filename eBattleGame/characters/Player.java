package eBattleGame.characters;

import eBattleGame.BattleGameCalc;

/**
 * プレイヤークラス
 */
public class Player extends Character {

    private int lv;

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