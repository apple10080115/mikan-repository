package com.mikanGames.battleGame.characters.enemys;

import com.mikanGames.battleGame.BattleGameCalc;
import com.mikanGames.battleGame.characters.Character;

public class Bat extends com.mikanGames.battleGame.characters.Character {

    public Bat(String name, int hp, int maxHp, int mp, int maxMp, int attackPower, int magicPower, int phyDefense, int magDefense, int speed, int lack, String abnormalStatus) {
        super(name, hp, maxHp, mp, maxMp, attackPower, magicPower, phyDefense, magDefense, speed, lack, abnormalStatus);
    }

    @Override
    public int attack(Character player) {
        int damage = new BattleGameCalc().enemyAttackDamage(this, player);
        player.setHp(player.getHp() - damage);
        return damage;
    }

    @Override
    public int magic(Character player) {
        return 0;
    }
}
