package com.example.codetribe.deidrekhumbudzo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class TourGuidepage extends AppCompatActivity {
    //ImageButton imageButton;
    ImageButton Buttonclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guidepage);
//        imageButton = (ImageButton) findViewById(R.id.imageButton);
        Buttonclick = (ImageButton) findViewById(R.id.Buttonclick);
        // Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/grid-bb443.appspot.com/o/Limpopo.jpg?alt=media&token=daca40e9-a253-42b9-8c42-ae331529e118").into(imageButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menuAdmin:

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                return true;
            case R.id.menuAdmins:

                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, ImageListActivity.class);
        startActivity(intent);
        Toast.makeText(this, "The Best Place To Be", Toast.LENGTH_SHORT).show();
    }


}