package com.example.duanmauandroid_mob204;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.duanmauandroid_mob204.DAO.NguoiDungDAO;
import com.example.duanmauandroid_mob204.DAO.TheLoaiDAO;
import com.example.duanmauandroid_mob204.MODER.TheLoai;

public class TheLoaiActivity extends AppCompatActivity {
    Button btnThemTheLoai,btnHuy,btnShow;
    TheLoaiDAO theLoaiDAO;
    EditText edMaTheLoai, edTenTheLoai,edViTri, edMota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("THÊM THỂ LOẠI");
        setContentView(R.layout.activity_the_loai);
        edMaTheLoai=findViewById(R.id.edmaTheLoai);
        edTenTheLoai=findViewById(R.id.edtenTheLoai);
        edViTri=findViewById(R.id.edvitri);
        edMota=findViewById(R.id.edmota);
        btnThemTheLoai=findViewById(R.id.btnthemTheLoai);
        btnHuy=findViewById(R.id.btnHuyTheLoai);
        btnShow=findViewById(R.id.btnShow);
    }
    public void ShowTheLoai(View view) {
        Intent intent = new Intent(TheLoaiActivity.this,ListTheLoaiActivity.class);
        startActivity(intent);
    }
    public void ThemTheLoai(View view) {
        TheLoaiDAO theLoaiDAO = new TheLoaiDAO(TheLoaiActivity.this);
        TheLoai theLoai  = new TheLoai(edMaTheLoai.getText().toString(),edTenTheLoai.getText().toString(),
                edMota.getText().toString(),Integer.parseInt(edViTri.getText().toString()));
        if (theLoaiDAO.inserTheLoai(theLoai)<0){
            Toast.makeText(TheLoaiActivity.this,"Insert thất bại",Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(TheLoaiActivity.this,"Insert thành công",Toast.LENGTH_LONG).show();

        }
    }

    public void HuyTheLoai(View view){
        finish();
    }

}
