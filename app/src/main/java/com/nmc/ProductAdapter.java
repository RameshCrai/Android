package com.nmc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private List<Product> productList;
    private LayoutInflater inflater;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.product_item, parent, false);
        }

        ImageView productImage = convertView.findViewById(R.id.productImage);
        TextView productTitle = convertView.findViewById(R.id.productTitle);
        TextView productPrice = convertView.findViewById(R.id.productPrice);

        Product product = productList.get(position);

        productImage.setImageResource(product.getImageResId());
        productTitle.setText(product.getTitle());
        productPrice.setText(product.getPrice());

        return convertView;
    }
}