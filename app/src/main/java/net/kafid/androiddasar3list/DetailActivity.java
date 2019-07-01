package net.kafid.androiddasar3list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";

    private TextView tvNamaBuah;
    private ImageView ivGambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String namaBuah = getIntent().getStringExtra(Konstanta.DATANAMA);
        int gambarBuah = getIntent().getIntExtra(Konstanta.DATAGAMBAR, 0);

        tvNamaBuah = findViewById(R.id.tv_detail_nama);
        ivGambarBuah = findViewById(R.id.iv_detail_gambar);

        tvNamaBuah.setText(namaBuah);
        ivGambarBuah.setImageResource(gambarBuah);

        //log
        Log.d(TAG, "Nama: "+namaBuah);
        Log.d(TAG, "Gambar: "+gambarBuah);
    }
}
