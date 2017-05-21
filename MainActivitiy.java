package mahasiswa.mahasiswa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nama, nim;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama        = (EditText) findViewById(R.id.namaMhs);
        nim         = (EditText) findViewById(R.id.nimMhs);
        submit      = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, get_string.class);
        intent.putExtra("nama", nama.getText().toString());
        intent.putExtra("nim", nim.getText().toString());
        startActivity(intent);

    }

}
