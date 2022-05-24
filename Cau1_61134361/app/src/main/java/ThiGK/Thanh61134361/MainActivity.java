package ThiGK.Thanh61134361;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText canhDay,canhBen,chieuCao;
    TextView ketqua;
    Button CV,DT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         canhDay = (EditText) findViewById(R.id.editCanhday);
         canhBen = (EditText) findViewById(R.id.editCanhben);
         chieuCao = (EditText) findViewById(R.id.editChieucao);
         ketqua = (TextView) findViewById(R.id.tvketqua);
         CV = (Button) findViewById(R.id.btnCV);
         DT = (Button) findViewById(R.id.btnDT);
    }
    public void TinhChuVi(View l){
        String Day=canhDay.getText().toString();
        String Ben=canhBen.getText().toString();

        int a=Integer.parseInt(Day);
        int b=Integer.parseInt(Ben);

        int chuvi=(a+b)*2;
        String chuoiChuVi=String.valueOf(chuvi);
        ketqua.setText("Chu vi hình bình hành là:"+ chuoiChuVi);
    }
    public void TinhChuVi(View l){
        String Day=canhDay.getText().toString();
        String Cao=chieuCao.getText().toString();

        int a=Integer.parseInt(Day);
        int h=Integer.parseInt(Cao);

        int dientich=a*h;
        String chuoiDienTich=String.valueOf(dientich);
        ketqua.setText("Diện tích hình bình hành là:"+ chuoiDienTich);
    }
}