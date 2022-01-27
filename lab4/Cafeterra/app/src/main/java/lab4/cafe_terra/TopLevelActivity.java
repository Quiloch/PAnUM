package lab4.cafe_terra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;


public class TopLevelActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener =
                (listView, v, position, id) ->
                {
                    if (position == 0)
                    {
                        Intent intent = new Intent(TopLevelActivity.this,
                                DrinkCategoryActivity.class);
                        startActivity(intent);
                    }

                    if (position == 1)
                    {
                        Intent intent = new Intent(TopLevelActivity.this,
                                SnackCategoryActivity.class);
                        startActivity(intent);
                    }

                    if (position == 2)
                    {
                        Intent intent = new Intent(TopLevelActivity.this,
                                CafeCategoryActivity.class);
                        startActivity(intent);
                    }

                };

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}