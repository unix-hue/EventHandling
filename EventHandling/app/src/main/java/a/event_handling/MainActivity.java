package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;

        switch(id) {
            case R.id.buttonclick:
                intent = new Intent(MainActivity.this, ButtonClick.class);
                startActivity(intent);
                return true;
            case R.id.motionevent:
                intent = new Intent(MainActivity.this, MotionEvent.class);
                startActivity(intent);
                return true;
            case R.id.commongentures:
                intent = new Intent(MainActivity.this, CommonGentures.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}