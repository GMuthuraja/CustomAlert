package app.example.app.customalert;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = getLayoutInflater();
        final View customLayout = inflater.inflate(R.layout.my_dialog, (ViewGroup) findViewById(R.id.main_content));

        final AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
        alert.setView(customLayout);

        findViewById(R.id.btnShowDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.show();
            }
        });

        Button ok_btn = (Button) customLayout.findViewById(R.id.ok_button);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.dismiss();
            }
        });

    }


}
