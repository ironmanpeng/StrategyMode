package com.pengtg.strategymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mTest = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTest = (Button)findViewById(R.id.test);
        mTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitCalculator calculator = new TransitCalculator();
                //设置计算策略
                calculator.setStrategy(new TaxiStrategy());
                //计算价格
                System.out.println("公交车乘16公里的价格：" + calculator.calculatePrice(16));
            }
        });
    }
}
