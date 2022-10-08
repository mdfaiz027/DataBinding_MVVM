package com.example.databinding_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding_mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ClickHandler clickHandler;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //getting the data from the mainviewmodel and giving it to the binding
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setCustomer(mainViewModel.getCustomer());

        //click handler
        clickHandler = new ClickHandler();
        binding.setClickHandler(clickHandler);
    }

    public class ClickHandler{

        public void simpleClick(View view){
            Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
        }
    }

}