package com.example.constructionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main class
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Buttons declaration
     */
    private Button btnProducts, btnServices, btnBranchOffices;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo_app);
        setContentView(R.layout.activity_main);
        btnProducts = (Button) findViewById(R.id.btnProducts);
        btnServices = (Button) findViewById(R.id.btnServices);
        btnBranchOffices = (Button) findViewById(R.id.btnBranchOffices);

        /**
         * Products button click listener method
         */
        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Products button future action will be" +
                        " implemented in the next version", Toast.LENGTH_SHORT).show();
            }
        });
        /**
         * Services button click listener method
         */
        btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Service button future action will be" +
                        " implemented in the next version", Toast.LENGTH_SHORT).show();
            }
        });
        /**
         * Branch offices click listener method
         */
        btnBranchOffices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Branch offices button future action will be" +
                        " implemented in the next version", Toast.LENGTH_SHORT).show();
            }
        });

    }

    /**
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu01,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        /**
         * Switch for the actions of the menu
         */
        switch(item.getItemId()){
            case R.id.products_menu:
                Toast.makeText(getApplicationContext(), "Products future action will be " +
                        "implemented in the next version", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.services_menu:
                Toast.makeText(getApplicationContext(), "Services future action will be" +
                        " implemented in the next version ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.branch_offices_menu:
                Toast.makeText(getApplicationContext(), "Branch offices future action will be " +
                        "implemented in the next version ", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}