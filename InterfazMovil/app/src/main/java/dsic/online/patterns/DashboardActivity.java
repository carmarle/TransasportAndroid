package dsic.online.patterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button bPlay = findViewById(R.id.bPlay);
        Button bScores = findViewById(R.id.bScores);
        Button bSettings = findViewById(R.id.bSettings);
        bPlay.setOnClickListener(this);
        bScores.setOnClickListener(this);
        bSettings.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.bInfo) {
           // startActivity(new Intent(this, InfoAppActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.bPlay:
                //intent.setClass(this, GameActivity.class);
                intent.putExtra("Data", "Add");
                break;
            case R.id.bScores:
                intent.setClass(this, ScoreActivity.class);
                intent.putExtra("Data", "Add");
                break;
            case R.id.bSettings:
                //intent.setClass(this, SettingsActivity.class);
                intent.putExtra("Data", "Add");
                break;
        }
        startActivity(intent);
    }
}
