package badran.ibraheem.ibraheem11first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Output;
    private Button btn_Go;
    private EditText et_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_Output=findViewById(R.id.tvOutput);
        et_Input=findViewById(R.id.etInput);
        btn_Go=findViewById(R.id.btnGo);
    }

    public void onClickGo(View V){
        String st=et_Input.getText().toString();
        tv_Output.setText(st);
    }

    public void onClickNext(View V){
        Intent i=new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }




}