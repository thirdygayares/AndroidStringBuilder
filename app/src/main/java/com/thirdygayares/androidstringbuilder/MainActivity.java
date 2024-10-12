package com.thirdygayares.androidstringbuilder;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editTextId, editTextName, editTextCategory, editTextPrice;
    TextView textViewResults;
    Button buttonAddProduct, buttonGetProduct;

    List<Product> productList = new ArrayList<>();
    Product productObject;


    StringBuilder stringBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        stringBuilder = new StringBuilder();
        productObject = new Product();

        editTextId= findViewById(R.id.editTextId);
        editTextName= findViewById(R.id.editTextName);
        editTextCategory= findViewById(R.id.editTextCategory);
        editTextPrice= findViewById(R.id.editTextPrice);
        textViewResults= findViewById(R.id.textViewResults);
        buttonAddProduct= findViewById(R.id.buttonAddProduct);
        buttonGetProduct= findViewById(R.id.buttonGetProducts);




        //listener for buttonAddProduct
        buttonAddProduct.setOnClickListener(v-> addFunction());


    }




    //TODO add FUNCTION
    private void addFunction(){

        productObject.setId(Integer.parseInt(editTextId.getText().toString()));
        productObject.setName(editTextName.getText().toString());
        productObject.setCategory(editTextCategory.getText().toString());
        productObject.setPrice(Integer.parseInt(editTextPrice.getText().toString()));

        Log.d("MAIN",  "id" + productObject.getId() + " name: " + productObject.getName() + " category: " + productObject.getCategory() +  "PRICE:" + productObject.getPrice()) ;

        stringBuilder.append("\n\n Name:" + productObject.getName());
        stringBuilder.append("\n id:" + productObject.getId());
        stringBuilder.append("\n category:" + productObject.getCategory());
        stringBuilder.append("\n price:" + productObject.getPrice());

        textViewResults.setText(stringBuilder.toString());
    }


}