package info.vansy.facebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView changeLangView = (TextView) findViewById(R.id.change_lang);
        changeLangView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Change language clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        final EditText nickView = (EditText) findViewById(R.id.nick);
        final EditText passView = (EditText) findViewById(R.id.pass);
        Button submitView = (Button) findViewById(R.id.submit);

        submitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nick = nickView.getText().toString();
                String pass = passView.getText().toString();
                boolean enable = true;
                if(nick.isEmpty()) {
                    nickView.requestFocus();
                    nickView.setError("Require field");
                    enable = false;
                }
                if(pass.isEmpty()) {
                    passView.requestFocus();
                    passView.setError("Require field");
                    enable = false;
                }

                if(enable) {
                    Toast.makeText(MainActivity.this, "Successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TextView lostpassView = (TextView) findViewById(R.id.lost_pass);
        lostpassView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Lost password clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
