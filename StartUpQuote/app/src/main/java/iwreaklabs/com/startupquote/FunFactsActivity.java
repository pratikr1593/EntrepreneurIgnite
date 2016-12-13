package iwreaklabs.com.startupquote;

/**
 * Created by pratikratnaparkhi on 03/12/16.
 */


import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.Random;


public class FunFactsActivity extends Activity {

    private FactBook mFactbook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private FirebaseAnalytics mFirebaseAnalytics;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_fact_book);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        //Declare our View Variables and assign the Views from the Layout file
        final TextView factlabel = (TextView) findViewById(R.id.factTextView);
        final Button showfactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactbook.getFact();
                // Update the label with our dynamic fact
                factlabel.setText(fact);
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showfactButton.setTextColor(color);
            }
        };

        showfactButton.setOnClickListener(listener);


    }
}

