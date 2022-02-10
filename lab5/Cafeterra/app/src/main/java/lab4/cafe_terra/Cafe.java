package lab4.cafe_terra;


import androidx.annotation.NonNull;

public class Cafe
{
    private final String name, adress, openingHours;

    public static final Cafe[] cafes =
            {
                    new Cafe("Wawa-caffe", "Warszawa, Sokolska 25/3",
                            "08.00 - 17.00"),
                    new Cafe("Kato-caffe", "Katowice, Dworcowa 15",
                            "09.00 - 17.30"),
                    new Cafe("Port-caffe", "Gdańsk, Westerplatte 25",
                            "08.00 - 17.00")
            };


    private Cafe(String name, String adress, String openingHours)
    {
        this.name = name;
        this.adress = adress;
        this.openingHours = openingHours;
    }


    public String getName()
    {
        return name;
    }

    public String getAdress()
    {
        return adress;
    }

    public String getOpeningHours()
    {
        return openingHours;
    }

    @NonNull
    public String toString()
    {
        return this.name;
    }
}