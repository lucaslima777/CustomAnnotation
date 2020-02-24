package custom.annotation.lln;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import custom.annotation.lln.Annotation.MethodInfo;

public class MainActivity extends AppCompatActivity {

    @MethodInfo(author = "Lucas", revision = 1, comments = "Ola")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
