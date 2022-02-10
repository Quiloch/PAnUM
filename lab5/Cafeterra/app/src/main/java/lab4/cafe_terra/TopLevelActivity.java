package lab4.cafe_terra;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class TopLevelActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.action_create_order) {
            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}