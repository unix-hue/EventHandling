package a.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.widget.TextView;

public class CommonGentures extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener
{

    private TextView gestureText;
    private GestureDetectorCompat gDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_gentures);

        gestureText = findViewById(R.id.textView4);

        this.gDetector = new GestureDetectorCompat(this,this);
        gDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent event) {
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public boolean onDown(android.view.MotionEvent event) {
        gestureText.setText (getString(R.string.down));
        return true;
    }

    public boolean onFling(android.view.MotionEvent event1, android.view.MotionEvent event2,
                           float velocityX, float velocityY) {
        gestureText.setText(R.string.onfling);
        return true;
    }

    public void onLongPress(android.view.MotionEvent event) {
        gestureText.setText(R.string.onlongpress);
    }

    public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2,
                            float distanceX, float distanceY) {
        gestureText.setText(R.string.onscroll);
        return true;
    }

    public void onShowPress(android.view.MotionEvent event) {
        gestureText.setText(R.string.onshowpress);
    }

    public boolean onSingleTapUp(android.view.MotionEvent event) {
        gestureText.setText(R.string.onsingletapup);
        return true;
    }

    public boolean onDoubleTap(android.view.MotionEvent event) {
        gestureText.setText(R.string.ondoubletap);
        return true;
    }

    public boolean onDoubleTapEvent(android.view.MotionEvent event) {
        gestureText.setText(R.string.ondoubletapevent);
        return true;
    }

    public boolean onSingleTapConfirmed(android.view.MotionEvent event) {
        gestureText.setText(R.string.onsingletapconfirmed);
        return true;
    }
}