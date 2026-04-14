package com.mikanGames.battleGame.characters.enemys;

import com.mikanGames.battleGame.BattleGameCalc;
import com.mikanGames.battleGame.BattleGameTools;
import com.mikanGames.battleGame.characters.Character;

public class Slime extends com.mikanGames.battleGame.characters.Character {

    public Slime() {
        int[] status = BattleGameTools.enemyStatusInit(13, 5, 5, 2, 6, 3, 3, 5);
        this.setName("スライム");
        this.setHp(status[0]);
        this.setMaxHp(status[0]);
        this.setMp(status[1]);
        this.setMaxMp(status[1]);
        this.setAttackPower(status[2]);
        this.setMagicPower(status[3]);
        this.setPhyDefense(status[4]);
        this.setMagDefense(status[5]);
        this.setSpeed(status[6]);
        this.setLack(status[7]);
        this.setType("無");
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
