package net.kafid.androiddasar3list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namaBuah;
    private int[] gambarBuah;

    public CustomListAdapter(Context context1, String[] namaBuah, int[] gambarBuah) {
        super(context1, R.layout.item_buah, namaBuah);
        this.context = context1;
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    //getview

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //atur layout item
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        //findViewByID
        TextView tvNamaBuah = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_item_gambar);

        //set data
        tvNamaBuah.setText(namaBuah[position]);
        ivGambarBuah.setImageResource(gambarBuah[position]);

        return view;
    }
}
