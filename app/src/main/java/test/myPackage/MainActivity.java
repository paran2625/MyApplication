package test.myPackage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReadWriteDB rw = new ReadWriteDB();
        Log.d(TAG, "test massage");
        //rw.addDB();
        //rw.readDB();
    }
}