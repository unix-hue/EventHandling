package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MotionEvent extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_event);

        ConstraintLayout myLayout = findViewById(R.id.activity_motion_event);

        myLayout.setOnTouchListener(new ConstraintLayout.OnTouchListener() {
            @Override
            public boolean onTouch(View view, android.view.MotionEvent motionEvent) {
                handleTouch(motionEvent);
                return true;
            }
        });
    }

    private void handleTouch(android.view.MotionEvent m) {
        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);

        int pointerCount = m.getPointerCount();

        for (int i = 0; i < pointerCount; i++)
        {
            int x = (int) m.getX(i);
            int y = (int) m.getY(i);
            int id = m.getPointerId(i);
            int action = m.getActionMasked();
            int actionIndex = m.getActionIndex();
            String actionString;

            switch (action)
            {
                case android.view.MotionEvent.ACTION_DOWN:
                    actionString = "DOWN";
                    break;
                case android.view.MotionEvent.ACTION_UP:
                    actionString = "UP";
                    break;
                case android.view.MotionEvent.ACTION_POINTER_DOWN:
                    actionString = "PNTR DOWN";
                    break;
                case android.view.MotionEvent.ACTION_POINTER_UP:
                    actionString = "PNTR UP";
                    break;
                case android.view.MotionEvent.ACTION_MOVE:
                    actionString = "MOVE";
                    break;
                default:
                    actionString = "";
            }

            String touchStatus = "Action: " + actionString + " Index: " +
                    actionIndex + " ID: " + id + " X: " + x + " Y: " + y;
            if (id == 0)
                textView1.setText(touchStatus);
            else
                textView2.setText(touchStatus);
        }
    }
}