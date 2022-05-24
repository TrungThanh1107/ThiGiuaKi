package ThiGK.Thanh61134361;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlist);
        //
        Intent BH = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBH.txt
        String tenBai = BH.getStringExtra("tenBH");



    }
}