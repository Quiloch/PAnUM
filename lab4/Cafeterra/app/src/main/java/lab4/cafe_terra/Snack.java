package lab4.cafe_terra;

import androidx.annotation.NonNull;

public class Snack
{
    private final String name;
    private final String description;
    private final int imageResourceId;

    public static final Snack[] snacks =
            {
                    new Snack("Nachos", "Nachos to nic innego jak małe i mega chrupkie kawałki tortilli, zapieczonej z wszelkiego rodzaju przyprawami i dodatkami.",
                            R.drawable.nachos),
                    new Snack("Babeczki", "Serwowane z polewą, posypką oraz innymi dekoracjami i dodatkami.",
                            R.drawable.babeczki),
            };


    private Snack(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    @NonNull
    public String toString()
    {
        return this.name;
    }
}