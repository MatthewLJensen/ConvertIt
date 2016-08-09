package matthew.convertit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Conversion extends AppCompatActivity {

    private Button buttontoF;
    private Button buttontoC;
    private TextView result;
    private EditText input;
    private int inputinC = 1;
    static String TAG = "Conversion";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);



        buttontoF = (Button) findViewById(R.id.buttontoF);
        buttontoC = (Button) findViewById(R.id.buttontoC);
        result = (TextView) findViewById(R.id.result);
        input = (EditText) findViewById(R.id.input);

        input.setHint("0");

        buttontoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculatetof();

            }
        });

        buttontoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculatetoc();

            }
        });

    }

public void calculatetof(){
    input = (EditText) findViewById(R.id.input);
    Double inputint = Double.parseDouble(input.getText().toString());
   // final int inputint=Integer.parseInt(inputinC);

    Log.i(TAG, "Conversion in Progress");

    double aftermult = inputint * 1.8;
    double resultint = aftermult + 32;

    String finalresult = String.valueOf(resultint);

    result.setText(new DecimalFormat("##.##").format(resultint));

}

    public void calculatetoc(){
        input = (EditText) findViewById(R.id.input);
        Double inputint = Double.parseDouble(input.getText().toString());
        // final int inputint=Integer.parseInt(inputinC);

        Log.i(TAG, "Conversion in Progress");

        double aftersub = inputint - 32;
        double resultint = aftersub / 1.8;

        String finalresult = String.valueOf(resultint);

        result.setText(new DecimalFormat("##.##").format(resultint));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conversion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
