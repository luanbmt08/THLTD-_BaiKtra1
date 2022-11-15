package com.google.th_ktra1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    int hinh[]={R.drawable.mytam,R.drawable.img_2,R.drawable.img_6,R.drawable.img_5,R.drawable.issac,R.drawable.img_3,R.drawable.duymanh,R.drawable.issac};
    String name[] = {"Phan Thị Mỹ Tâm","Phạm Đan Trường" ,"Nguyễn Thanh Tùng","Nguyễn Thị Hoà" ,"Nguyễn Đức Cường" ,"Trịnh Trần Phương Tuấn","Nguyễn Duy Mạnh","Phạm Lưu Tuấn"};
    String nghedanh[] = {"Mỹ Tâm","Anh Bo" ,"Sơn Tùng MTP","Hoà Minzy" ,"Đen Vâu" ,"Jack ","Duy Mạnh","Issac"};
    String quocgia[] = {"Việt Nam","Việt Nam" ,"Việt Nam","Việt Nam" ,"Việt Nam" ,"Việt Nam","Việt Nam","Việt Nam"};
    String sosao[] = {"8*","7*" ,"10*","8.5*" ,"7.5*" ,"9*","9.5*","8*"};
    ArrayList<CaSy> myList;
    CaSyAdapter myadapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv = findViewById(R.id.listviewthietbi);
        myList = new ArrayList<>();
        for (int i = 0;i<name.length;i++){
            myList.add(new CaSy(name[i],nghedanh[i],quocgia[i],sosao[i],hinh[i]));
        }
        myadapter = new CaSyAdapter(ListViewActivity.this,R.layout.layout_thietbi,myList);
        lv.setAdapter(myadapter);

    }
    }


