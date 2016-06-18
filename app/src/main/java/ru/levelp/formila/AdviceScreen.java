package ru.levelp.formila;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;


public class AdviceScreen extends AppCompatActivity {
    String[] WORK = {"Дорогая, выпей вина!", "Не переживай, они всего лишь мелкие неудачники", "Они не стоят твоих морщин, детка!", "Просто представь их всех голыми", "Работа, работа, перейди на Федота!"};
    String[] BOY = {"Вот козел!", "Дорогая, выпей вина!", "Не волнуйся, к нему уже выехали из службы ОТСЕКАНИЯ БУБЕНЦОВ АХАХА, ААААААААХАХАХА!!!!111", "Зачем тебе этот дурачок? Потискай Василия!", "Возмездие в виде лучей поноса уже мчится к нему!"};
    String[] ANGRY = {"Если можешь дотянуться до Василия - потискай его. Если не можешь, потискай то, что попадется под руку!", "Все пидоры, а ты королева!!", "Дорогая, выпей вина!", "Прямо сейчас где-то кто-то гладит милого котенка. Представь, что это ты!", "Съешь пирожок"};
    String[] SAD = {"Кто грустит, тот трансвестит!"};
    String[] COMPLIMENT = {"У тебя отличная жопа!", "Завидую твоему прессу, котлетка", "Ты такая целеустремленная!", "У тебя отличный музыкальный вкус!", "Если бы ты была тортом, то самым вкусным!"};

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.for_answers);
        Intent i = getIntent();
        String name = i.getStringExtra("variant");
        TextView advice = (TextView) findViewById(R.id.advice);
if(name.equals("На работе достали")){

    assert advice != null;
    advice.setText(WORK[(int)(Math.random()*4)]);
}

    }

    public void tostart(View view) {
        finish();}



    }

