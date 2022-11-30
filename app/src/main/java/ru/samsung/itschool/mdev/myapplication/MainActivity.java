package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;
    private EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeTextView() {
        tv.setText(ed.getText().toString());
    }

    public void openUrl() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String url = "https://bmstu.ru";
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}