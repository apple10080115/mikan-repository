package com.mikanGames.battleGame.characters.enemys;

import com.mikanGames.battleGame.BattleGameCalc;
import com.mikanGames.battleGame.BattleGameTools;
import com.mikanGames.battleGame.characters.Character;

public class Slime extends com.mikanGames.battleGame.characters.Character {

    public Slime() {
        int[] s = BattleGameTools.enemyStatusInit(10, 10, 5, 5, 3, 2, 4, 3, 4, 5);
        this("スライム", s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9], "");
    }

    public Slime(String name, int hp, int maxHp, int mp, int maxMp, int attackPower, int magicPower, int phyDefense, int magDefense, int speed, int lack, String abnormalStatus) {
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
