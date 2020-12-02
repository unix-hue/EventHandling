package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView statusText = findViewById(R.id.textView);
                statusText.setText(R.string.buttonClicked);
            }
        });

        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView statusText = findViewById(R.id.textView);
                        statusText.setText(R.string.longButtonClicked);
                        return true;
                    }
                }
        );
    }
}