package com.mikanGames.battleGame;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.widget.Button;
import android.widget.TextView;

import android.os.Handler;

import com.mikanGames.battleGame.characters.Character;
import com.mikanGames.battleGame.characters.enemys.Bat;
import com.mikanGames.battleGame.characters.enemys.Slime;

import java.util.Map;

public class GameActivity extends AppCompatActivity {

    Character player;

    Character enemy;

    Slime slime = new Slime();

    Bat bat = new Bat();

    private BattleGameTools bgt = new BattleGameTools();

    private BattleGameView bgv = new BattleGameView();

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            v.setPadding(0, 0, 0, 0);
            return insets;
        });

        Map<Integer, Character> enemies = bgt.enemiesMaper(slime, bat);
        enemy = bgt.appearedEnemy(enemies);

        TextView hpText = findViewById(R.id.playerHp);
        TextView mpText = findViewById(R.id.playerMp);
        TextView statusText = findViewById(R.id.statusText);
        Button attackButton = findViewById(R.id.attackButton);

        attackButton.setOnClickListener(v -> {

            if (bgt.whichTurn(player, enemy)) {
                player.attack(enemy);
                bgt.gameoverJugement(player, enemy);

                handler.postDelayed(() -> {
                    enemy.attack(player);
                    bgt.gameoverJugement(player, enemy);
                    bgv.updateHUD(this, player, hpText, mpText, statusText);
                }, 2000);

            } else {
                enemy.attack(player);
                bgt.gameoverJugement(player, enemy);

                bgv.updateHUD(this, player, hpText, mpText, statusText);

                handler.postDelayed(() -> {
                    player.attack(enemy);
                    bgt.gameoverJugement(player, enemy);
                }, 2000);

            }

        });

    }

}