package github.io.carpool;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by leo2swag on 2018-02-06.
 */

public class indexActivity extends AppCompatActivity {
    Button buttonIndex;
    Button roundBtn1;
    TextView index_rate_word;
    ImageButton imageButton;
    RatingBar index_ratingBar;
    LinearLayout ratingback;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        init();

    }


    private void init() {
        //buttonIndex = findViewById(R.id.buttonIndex);
        index_rate_word = findViewById(R.id.index_rate_word);
        imageButton = findViewById(R.id.imageButton);
        roundBtn1 = findViewById(R.id.roundBtn1);
        index_ratingBar = findViewById(R.id.index_ratingBar);
        ratingback = findViewById(R.id.ratingback);
        otherEvent();
        clickEvent();
    }

    private void otherEvent() {
        index_rate_word.setText(getResources().getText(R.string.rateword) + " " + getResources().getText(R.string.profile_rate));
        index_ratingBar.setIsIndicator(true);
    }

    private void clickEvent() {
        gotoSection1();
        gotoquickStart();
        gotoProfile();
    }
    //public void addListenerOnButton() {

 //       spinner1 = findViewById(R.id.car_type_spinner);
  //      spinner2 = findViewById(R.id.car_color_spinner);

    //    String selectedValue = String.valueOf(spinner1.getSelectedItem());

//        other_car_info = findViewById(R.id.other_car_info);
  //      if (selectedValue == "OTHERS") {
    //        finalBtnSubmit.setText("hhhhhh");
      //      other_car_info.setVisibility(View.VISIBLE);
      //  } else {
      //      finalBtnSubmit.setText("aaaaaa");
      //      other_car_info.setVisibility(View.GONE);
       // }


    //}

    private void gotoquickStart() {
        roundBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GetCarInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void gotoSection1() {
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    public void gotoProfile() {
        ratingback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}



