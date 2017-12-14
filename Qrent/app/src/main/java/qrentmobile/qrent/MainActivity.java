package qrentmobile.qrent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView click = (ImageView)findViewById(R.id.imageGopro);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start new act
            }
        });
    }
}
