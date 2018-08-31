package com.example.divinkas.cursapps;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.divinkas.cursapps.Adapter.P24_Recycler_Adapter;
import com.example.divinkas.cursapps.Model.ExchangeRate;
import com.example.divinkas.cursapps.Model.P24;
import com.example.divinkas.cursapps.Retrofit.IMyApi_P24;
import com.example.divinkas.cursapps.Retrofit.RetrofitClient;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {
    RecyclerView rvCurs;
    IMyApi_P24 iMyApi_p24;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        rvCurs = findViewById(R.id.rvContainerCurs);
        rvCurs.setLayoutManager(new LinearLayoutManager(this));
        Retrofit retrofit = RetrofitClient.getInstance();
        iMyApi_p24 = retrofit.create(IMyApi_P24.class);
        loadData();
    }

    private void loadData() {
        Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat mdformat = new SimpleDateFormat("dd.MM.yyyy");
        String currDate = mdformat.format(calendar.getTime());

        compositeDisposable.add(iMyApi_p24.getCurses(currDate, "")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer <P24>() {
                    @Override
                    public void accept(P24 p24) throws Exception {
                        displayData(checkListP24(p24));
                    }
                }));
    }

    private void displayData(P24 p24) {
        rvCurs.setAdapter(new P24_Recycler_Adapter(p24, this));
    }
    private P24 checkListP24(P24 obj){
        List<ExchangeRate> lst = new ArrayList<>();
        for(int i = 0; i < obj.getExchangeRate().size(); i++){
            if(obj.exchangeRate.get(i).saleRate != 0){
                lst.add(obj.exchangeRate.get(i));
            }
        }
        obj.setExchangeRate(lst);
        return obj;
    }
    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }
}
