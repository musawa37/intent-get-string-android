package mahasiswa.mahasiswa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class getString extends AppCompatActivity {

    TextView nama, nim, prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        nama = (TextView)findViewById(R.id.namaM);
        nim  = (TextView)findViewById(R.id.nimM);

        Intent intent = getIntent();
        String nameStg = intent.getStringExtra("nama");
        String nimStg  = intent.getStringExtra("nim");

        nama.setText("Hello" + nameStg );
        nim.setText(nimStg);
    }
}
