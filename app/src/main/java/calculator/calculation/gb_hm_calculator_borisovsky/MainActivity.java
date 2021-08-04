package calculator.calculation.gb_hm_calculator_borisovsky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;

    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_reset;
    Button button_delete;
    Button button_percent;
    Button button_divide;
    Button button_multiply;
    Button button_minus;
    Button button_plus;
    Button button_point;
    Button button_equal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListeners();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContent();
    }




    private void initListeners() {

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_reset.setOnClickListener(this);
        button_delete.setOnClickListener(this);
        button_percent.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_equal.setOnClickListener(this);
    }


    private void initView() {
        textView = findViewById(R.id.textView);

        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_reset = findViewById(R.id.button_reset);
        button_delete = findViewById(R.id.button_delete);
        button_percent = findViewById(R.id.button_percent);
        button_divide = findViewById(R.id.button_divide);
        button_multiply = findViewById(R.id.button_multiply);
        button_minus = findViewById(R.id.button_minus);
        button_plus = findViewById(R.id.button_plus);
        button_point = findViewById(R.id.button_point);
        button_equal = findViewById(R.id.button_equal);
    }

}