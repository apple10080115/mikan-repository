package com.mikanGames.battleGame;

import android.content.Context;
import android.widget.TextView;

import com.mikanGames.battleGame.characters.Character;

/**
 * 画面表示クラス
 */
public class BattleGameView {

    public void updateHUD(Context context, Character player, TextView hpText, TextView mpText, TextView statusText) {
        hpText.setText(context.getString(R.string.hpText, player.getHp(), player.getMaxHp()));
        mpText.setText(context.getString(R.string.mpText, player.getHp(), player.getMaxMp()));
        statusText.setText(context.getString(R.string.statusText, player.getAbnormalStatus()));
    }

}
