package spinner.rungene.com.spinner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        //spinner.setOnItemSelectedListener(this);
        //create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array,android.R.layout.simple_spinner_item
                );
        //specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    //Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            //an item was selected . You can retrive the selected item using
            // parent.getItemAtPosition(pos)
/*            Toast.makeText(adapterView.getContext(),
                    "OnItemSelectedListener :"+adapterView.getItemAtPosition(i).toString(),
                    Toast.LENGTH_SHORT).show();*/

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
//another interface callback
        }
    }
}
