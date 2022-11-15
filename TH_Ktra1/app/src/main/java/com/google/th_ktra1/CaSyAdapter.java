package com.google.th_ktra1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CaSyAdapter extends ArrayAdapter<CaSy> {
    Activity context;
    int IdLayout;
    ArrayList<CaSy> myList;

    public CaSyAdapter(Activity context, int idLayout, ArrayList<CaSy> myList) {
        super(context, idLayout,myList);
        this.context = context;
        IdLayout = idLayout;
        this.myList = myList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myflater = context.getLayoutInflater();
        convertView = myflater.inflate(IdLayout,null);
        CaSy myphone =myList.get(position);
        ImageView img_phone = convertView.findViewById(R.id.imageHinh);
        img_phone.setImageResource(myphone.getHinh());
        TextView txt_name=convertView.findViewById(R.id.name);
        txt_name.setText(myphone.getName());

        TextView txt_nghedanh=convertView.findViewById(R.id.nghedanh);
        txt_nghedanh.setText(myphone.getNghedanh());
        TextView txt_quocgia=convertView.findViewById(R.id.quocgia);
        txt_quocgia.setText(myphone.getQuocgia());
        TextView txt_sosao=convertView.findViewById(R.id.sosao);
        txt_sosao.setText(myphone.getSosao());
        return convertView;
    }
}
