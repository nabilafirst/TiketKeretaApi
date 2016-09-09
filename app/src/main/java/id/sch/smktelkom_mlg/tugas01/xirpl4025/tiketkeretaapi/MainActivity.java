package id.sch.smktelkom_mlg.tugas01.xirpl4025.tiketkeretaapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
        tvPesan = (TextView) findViewById(R.id.textViewPesanan);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });

    }

    private void doProcess() {

        if (isValid()) {

            String jk;
            String kelas;
            String nama = etNama.getText().toString();
            String alamat = etAlamat.getText().toString();
            String asal = etAsal.getText().toString();
            String tujuan = etTujuan.getText().toString();
            String tanggal = etTanggal.getText().toString();
            String jam = etJam.getText().toString();
            int tahun = Integer.parseInt(etTahun.getText().toString());
            int usia = 2016 - tahun;

            if (rbL.isChecked()) {
                jk = rbL.getText().toString();
            } else {
                jk = rbP.getText().toString();
            }

            if (cbBisnis.isChecked()) {
                kelas = cbBisnis.getText().toString();
            } else if (cbEksekutif.isChecked()) {
                kelas = cbEksekutif.getText().toString();
            } else {
                kelas = cbEkonomi.getText().toString();
            }

            tvPesan.setText("Terimakasih " + nama + ", pesanan Anda telah berhasil diproses. Berikut data diri Anda : \n"
                    + "Nama : " + nama + "\nAlamat : " + alamat + "\nUmur : " + usia + " tahun \nJenis Kelamin : " + jk +
                    "\nKereta Api Kelas " + kelas + " dengan rute " + asal + " ke " + tujuan + " pada tanggal " + tanggal + " pukul " + jam + " WIB");

        }

    }

    public boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String tahun = etTahun.getText().toString();
        String alamat = etAlamat.getText().toString();
        String asal = etAsal.getText().toString();
        String tujuan = etTujuan.getText().toString();
        String tanggal = etTanggal.getText().toString();
        String jam = etJam.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (tahun.isEmpty()) {
            etTahun.setError("Tahun Kelahiran belum diisi");
            valid = false;
        } else if (tahun.length() != 4) {
            etTahun.setError("Format Tahun Salah");
        } else {
            etTahun.setError(null);
        }

        if (alamat.isEmpty()) {
            etAlamat.setError("Alamat belum diisi");
            valid = false;
        } else {
            etAlamat.setError(null);
        }

        if (asal.isEmpty()) {
            etAsal.setError("Kota Asal belum diisi");
            valid = false;
        } else {
            etAsal.setError(null);
        }

        if (tujuan.isEmpty()) {
            etTujuan.setError("Kota Tujuan belum diisi");
            valid = false;
        } else {
            etTanggal.setError(null);
        }

        if (jam.isEmpty()) {
            etJam.setError("Jam Keberangkatan belum diisi");
            valid = false;
        } else {
            etJam.setError(null);
        }

        return valid;
    }
}
