package com.example.lab_2a;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button:
                RadioButton kelvinButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0)
                {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());

                if (kelvinButton.isChecked())
                {
                    text.setText(String.valueOf(Converter.convertCelsiusToKelvin(inputValue)));
                    kelvinButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                }

                else {
                    text.setText(String.valueOf(Converter.convertCelsiusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    kelvinButton.setChecked(true);
                    }
                break;
        }
    }
}