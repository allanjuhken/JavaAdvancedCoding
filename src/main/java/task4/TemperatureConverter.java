package task4;

public class TemperatureConverter {
    private static final float ABSOLUTE_ZERO_CELSIUS = -273;


    // behaviours
    public static double convertToCelsius(float fahrenheit) throws IllegalArgumentException{
       float celsius = (float) performConversion(fahrenheit, (fah) -> (fah-32) / 1.8f);
        if (celsius < ABSOLUTE_ZERO_CELSIUS){
            throw new IllegalArgumentException("Temp must be higher than absolute zero");
        }
        return celsius;
    }

    public static double convertToFahrenheit(float celsius) throws IllegalArgumentException{
        if (celsius < ABSOLUTE_ZERO_CELSIUS){
            throw new IllegalArgumentException("Temp must be higher than absolute zero");
        }
        return performConversion(celsius, (cel) -> (cel * 1.8F) + 32);
    }

    private static double performConversion(float temp, ConvertTemperature conversion){
        return conversion.convert(temp);
    }



}
