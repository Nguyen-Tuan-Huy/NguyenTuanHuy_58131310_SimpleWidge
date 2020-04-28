package vn.edu.ntu.nguyentuanhuy_58131310_simplewidge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, birth, soThichKhac;
    RadioButton gtNam, gtNu;
    Button btnXacnhan;
    RadioGroup rdgGioitinh;
    CheckBox soThich1, soThich2, soThich3, soThich4, soThich5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }

    private void addView() {
        name = findViewById(R.id.name);
        birth = findViewById(R.id.birth);
        rdgGioitinh = findViewById(R.id.rdgGioitinh);
        gtNam = findViewById(R.id.gtNam);
        gtNu = findViewById(R.id.gtNu);
        btnXacnhan = findViewById(R.id.btnxacnhan);

        soThich1 = findViewById(R.id.soThich1);
        soThich2 = findViewById(R.id.soThich2);
        soThich3 = findViewById(R.id.soThich3);
        soThich4 = findViewById(R.id.soThich4);
        soThich5 = findViewById(R.id.soThich5);

        soThichKhac = findViewById(R.id.soThichKhac);
    }

    private void addEvents() {
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacNhan();
            }
        });
    }

    private void xacNhan(){
        String gioitinh = "";
        switch (rdgGioitinh.getCheckedRadioButtonId()){
            case R.id.gtNam:
                gioitinh = gtNam.getText().toString();
                break;
            case R.id.gtNu:
                gioitinh = gtNu.getText().toString();
                break;
        }

        String soThich = "";
        if(soThich1.isChecked())
            soThich = soThich + soThich1.getText() + "; ";
        if(soThich2.isChecked())
            soThich = soThich + soThich2.getText() + "; ";
        if(soThich3.isChecked())
            soThich = soThich + soThich3.getText() + "; ";
        if(soThich4.isChecked())
            soThich = soThich + soThich4.getText() + "; ";
        if(soThich5.isChecked())
            soThich = soThich + soThich5.getText() + "; ";
        soThich = soThich + soThichKhac.getText();

        Toast.makeText(getApplication(),
                name.getText().toString() +
                "\nNgày sinh: " + birth.getText().toString() +
                "\nGiới tính: " + gioitinh +
                "\nSở thích: " + soThich
                ,Toast.LENGTH_SHORT).show();
    }
}
