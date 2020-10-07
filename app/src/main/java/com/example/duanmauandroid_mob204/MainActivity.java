package com.example.duanmauandroid_mob204;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewNguoiDung(View view){
        Intent intent = new Intent(getApplicationContext(),ListNguoiDungActivity.class);
        startActivity(intent);
    }
    public void viewTheLoai(View view){
        Intent intent = new Intent(getApplicationContext(),ListTheLoaiActivity.class);
        startActivity(intent);
    }
    public void viewBook(View view){
        Intent intent = new Intent(getApplicationContext(),ListBookActivity.class);
        startActivity(intent);
    }
    public void viewHoaDon(View view){
        Intent intent = new Intent(getApplicationContext(),HoaDonActivity.class);
        startActivity(intent);
    }
    public void viewBanChay(View view){
        Intent intent = new Intent(getApplicationContext(),SachBanChay.class);
        startActivity(intent);
    }
    public void viewThongKe(View view){
        Intent intent = new Intent(getApplicationContext(),ThongKe.class);
        startActivity(intent);
    }
}
