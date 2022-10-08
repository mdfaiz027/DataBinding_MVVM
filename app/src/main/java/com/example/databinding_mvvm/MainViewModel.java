package com.example.databinding_mvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

//provider class
public class MainViewModel extends AndroidViewModel {

    Customer customer;

    public MainViewModel(@NonNull Application application) {
        super(application);

        //initialize
        customer = new Customer("Md Faiz");
    }

    //provide customer
    public Customer getCustomer() {
        return this.customer;
    }
}
