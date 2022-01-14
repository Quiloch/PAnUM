package com.example.lab_2a;

class Converter
{
    public static float convertCelsiusToFahrenheit(float celsius)
    {
        return (32 + 9/5 * celsius);
    }

    public static float convertCelsiusToKelvin(float celsius)
    {
        return (float) (celsius + 273.15);
    }
}

