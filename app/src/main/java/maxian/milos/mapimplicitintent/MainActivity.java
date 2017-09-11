package maxian.milos.mapimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClicked(View view) {
        EditText et1 = (EditText) findViewById(R.id.editText1);
        EditText et2 = (EditText) findViewById(R.id.editText2);
        String number1 = et1.getText().toString();
        String number2 = et2.getText().toString();

        if (!number1.isEmpty() && !number2.isEmpty()) {
            double lat = Double.parseDouble(number1);
            double lng = Double.parseDouble(number2);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:" + lat + "," + lng));
            startActivity(intent);
        }
    }
}
