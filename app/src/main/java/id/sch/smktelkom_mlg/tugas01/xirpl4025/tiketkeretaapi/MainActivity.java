package id.sch.smktelkom_mlg.tugas01.xirpl4025.tiketkeretaapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etAlamat;
    EditText etTahun;
    EditText etAsal;
    EditText etTujuan;
    EditText etTanggal;
    EditText etJam;
    RadioButton rbL, rbP;
    Button bOk;
    CheckBox cbBisnis, cbEkonomi, cbEksekutif;
    TextView tvPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etTahun = (EditText) findViewById(R.id.editTextTahun);
        etAsal = (EditText) findViewById(R.id.editTextAsal);
        etTujuan = (EditText) findViewById(R.id.editTextTujuan);
        etTanggal = (EditText) findViewById(R.id.editTextTanggal);
        etJam = (EditText) findViewById(R.id.editTextJam);

        cbBisnis = (CheckBox) findViewById(R.id.checkBoxBisnis);
        cbEkonomi = (CheckBox) findViewById(R.id.checkBoxEkonomi);
        cbEksekutif = (CheckBox) findViewById(R.id.checkBoxEksekutif);

        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);

        bOk = (Button) findViewById(R.id.buttonOK);

    }
}
