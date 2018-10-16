package dsic.online.patterns;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("personal_score");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Notificaciones");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("friends_score");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Emergencias");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        /////////////////////////////////////////////////////////Personal Score//////////////////////////////////////////////////////////////////
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.table);

        for (int i = 0; i < 5; i++) {
            // Creation row
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

            // Creation textView
            final TextView text = new TextView(this);
            text.setText("M"+i+": Accidente V-30 KM 265 dirección BCN.");
            //text.setTextColor(Color.parseColor("#223e95"));
            text.setTextColor(Color.parseColor("#223e95"));
            text.setTextSize(17);
            text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            // Creation  button
            final TextView text2 = new TextView(this);
            //text2.setText("Test" + i);
            text2.setTextColor(Color.parseColor("#223e95"));
            text2.setTextSize(17);
            text2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            tableRow.addView(text);
            tableRow.addView(text2);

            tableLayout.addView(tableRow);
        }

        /////////////////////////////////////////////////////////Friends Score/////////////////////////////////////////////////////////////////
        /*final TableLayout tableLayout2 = (TableLayout) findViewById(R.id.table2);
        for (int i = 0; i < 5; i++) {
            // Creation row
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

            // Creation textView
            final TextView text = new TextView(this);
            text.setText("          Test" + i +"                                    ");
            text.setTextColor(Color.parseColor("#223e95"));
            text.setTextSize(17);
            text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            // Creation  button
            final TextView text2 = new TextView(this);
            text2.setText("Test" + i);
            text2.setTextColor(Color.parseColor("#223e95"));
            text2.setTextSize(17);
            text2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

            tableRow.addView(text);
            tableRow.addView(text2);

            tableLayout2.addView(tableRow);
        }
        */
//////////////////////////////////////////////////////////////End Scores///////////////////////////////////////////////////////////////////////////
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_personal_score, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.bDeleteScores) {
         //   startActivity(new Intent(this, InfoAppActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
