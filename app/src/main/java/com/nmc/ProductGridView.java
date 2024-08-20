package com.nmc;

import android.widget.GridView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProductGridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_grid_view);

        List<Product> productList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            productList.add(new Product("Product " + i, "$" + (i * 10), R.drawable.physics));
        }

        ProductAdapter adapter = new ProductAdapter(this, productList);

        GridView productGridView = findViewById(R.id.productGridView);
        productGridView.setAdapter(adapter);

        ListView productListView = findViewById(R.id.productListView);
        productListView.setAdapter(adapter);
    }
}