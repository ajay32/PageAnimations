package com.hackingbuzz.pageanimations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // u can use it with Activities , Fragments....  put it after calling fragment ..or startActivity() or finish()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button call_second = (Button) findViewById(R.id.calling_second);

        call_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), SecondActivity.class));
                // use combination of animation from anim folder .. see anim foloder   ..
              //  overridePendingTransition(R.anim.slide_in_left1, R.anim.together_anim);   // put 0 if you dont wanna use any animation for exit or enter
              //   overridePendingTransition(R.anim.slide_in_left1, R.anim.fadeout);
              //     overridePendingTransition(R.anim.slide_in_right, 0);
             //   overridePendingTransition(R.anim.slide_out_right, 0);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}
