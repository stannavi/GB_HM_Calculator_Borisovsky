package calculator.calculation.gb_hm_calculator_borisovsky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // черновик урок 5

    static String TAG = "calculator";

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

    Calculator calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListeners();
        calculator = new Calculator();
        setContent();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(TAG, calculator);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = savedInstanceState.getParcelable(TAG);
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

    private void setContent() {
        textView.setText(String.valueOf(calculator.getNum_0()));
        textView.setText(String.valueOf(calculator.getNum_1()));
        textView.setText(String.valueOf(calculator.getNum_2()));
        textView.setText(String.valueOf(calculator.getNum_3()));
        textView.setText(String.valueOf(calculator.getNum_4()));
        textView.setText(String.valueOf(calculator.getNum_5()));
        textView.setText(String.valueOf(calculator.getNum_6()));
        textView.setText(String.valueOf(calculator.getNum_7()));
        textView.setText(String.valueOf(calculator.getNum_8()));
        textView.setText(String.valueOf(calculator.getNum_9()));
        textView.setText(String.valueOf(calculator.getEqual()));
        textView.setText(String.valueOf(calculator.getDivide()));
        textView.setText(String.valueOf(calculator.getMinus()));
        textView.setText(String.valueOf(calculator.getMultiply()));
        textView.setText(String.valueOf(calculator.getPercent()));
        textView.setText(String.valueOf(calculator.getPlus()));
        textView.setText(String.valueOf(calculator.getPoint()));
        textView.setText(String.valueOf(calculator.getReset()));
        textView.setText(String.valueOf(calculator.getDelete()));

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_0:
                    calculator.getNum_0();
                    textView.setText(String.valueOf(calculator.getNum_0()));
                    break;

                case R.id.button_1:
                    calculator.getNum_1();
                    textView.setText(String.valueOf(calculator.getNum_1()));
                    break;
                default:
                    break;
            }

        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                textView.setText("0");
                break;
            case R.id.button_1:
                textView.setText("1");
                break;
            case R.id.button_2:
                textView.setText("2");
                break;
            case R.id.button_3:
                textView.setText("3");
                break;
            case R.id.button_4:
                textView.setText("4");
                break;
            case R.id.button_5:
                textView.setText("5");
                break;
            case R.id.button_6:
                textView.setText("6");
                break;
            case R.id.button_7:
                textView.setText("7");
                break;
            case R.id.button_8:
                textView.setText("8");
                break;
            case R.id.button_9:
                textView.setText("9");
                break;
            case R.id.button_point:
                textView.setText(".");
                break;
            case R.id.button_plus:
                textView.setText("+");
                break;
            case R.id.button_minus:
                textView.setText("-");
                break;
            case R.id.button_multiply:
                textView.setText("*");
                break;
            case R.id.button_divide:
                textView.setText("/");
                break;
            case R.id.button_delete:
                textView.setText("DEL");
                break;
            case R.id.button_reset:
                textView.setText("C");
                break;
            case R.id.button_equal:
                textView.setText("=");
                break;
            default:
                break;
        }
    }
}