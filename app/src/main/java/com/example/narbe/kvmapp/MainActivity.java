package com.example.narbe.kvmapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayName[] = {"łóżko",
            "śniadanie",
            "prysznic",
            "Pobiad",
            "kolacja"};
    private String studnia = "Studnia";
    private String slup = "Słup";
    private String skrzynka = "Skrzynka";
    private String punkt = "Punkt";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        CircleMenu circleMenu = (CircleMenu) findViewById( R.id.circle_menu );
        circleMenu.setMainMenu( Color.parseColor("#FF6600"), R.drawable.add, R.drawable.cancel)
                .addSubMenu( Color.parseColor("#ff0204"), R.drawable.add )
                .addSubMenu( Color.parseColor( "#F8FE00" ), R.drawable.add )
                .addSubMenu( Color.parseColor("#b41eb3" ), R.drawable.add )
                .addSubMenu( Color.parseColor("#46e800" ), R.drawable.add )
                .setOnMenuSelectedListener( new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText( MainActivity.this, "Wybrałeś" + arrayName[index], Toast.LENGTH_SHORT ).show();
                    }
                } );
    }
}
