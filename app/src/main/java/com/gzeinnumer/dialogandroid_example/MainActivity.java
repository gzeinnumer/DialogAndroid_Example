package com.gzeinnumer.dialogandroid_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.da.dialog.confirmDialog.ConfirmDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_example_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                example1();
            }
        });
    }

    private void example1() {
        new ConfirmDialog(getSupportFragmentManager())
                .setTitle("ini title")
                .setContent("ini content")
                .onCancelPressedCallBack(new ConfirmDialog.OnCancelPressed() {
                    @Override
                    public void onCancelPressed() {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                })
                .onOkPressedCallBack(new ConfirmDialog.OnOkPressed() {
                    @Override
                    public void onOkPressed() {
                        Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }


}