package lab4.cafe_terra;


import androidx.annotation.NonNull;

public class Drink
{
    private final String name;
    private final String description;
    private final int imageResourceId;

    public static final Drink[] drinks =
            {
            new Drink("Latte", "Czarne espresso z gorącym mlekiem i mleczną pianką.",
                    R.drawable.latte),
            new Drink("Cappuccino", "Czarne espresso z dużą ilością spienionego mleka.",
                    R.drawable.cappuccino),
            new Drink("Espresso", "Czarna kawa ze świeżo mielonych ziaren najwyższej jakości.",
                    R.drawable.filter)
    };


    private Drink(String name, String description, int imageResourceId)
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