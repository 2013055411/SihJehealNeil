package jehealneil.sih.com.sihjehealneilpracticalexam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        EditText ex11 = (EditText) findViewById(R.id.etFirst);
        EditText ex22 = (EditText) findViewById(R.id.etSecond);
        TextView result = (TextView) findViewById((R.id.etResult));
        int num1 = Integer.parseInt(ex11.getText().toString());
        int num2 = Integer.parseInt(ex22.getText().toString());

        int total = (num1 + num2) / 2;
        result.setText(Integer.toString(total));
    }

}





