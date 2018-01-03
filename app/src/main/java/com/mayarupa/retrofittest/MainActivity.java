package com.mayarupa.retrofittest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.mayarupa.retrofittest.ApiClient;
import com.mayarupa.retrofittest.ApiInterface;
import com.mayarupa.retrofittest.Image;
import com.mayarupa.retrofittest.R;
import com.mayarupa.retrofittest.RecyclerAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerAdapter mAdapter;
    private List<Image> images;
    private ApiInterface mApiInterface;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView =(RecyclerView)findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        mApiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Image>> call = mApiInterface.getImage();

        call.enqueue(new Callback<List<Image>>() {
            @Override
            public void onResponse(Call<List<Image>> call, Response<List<Image>> response) {
                images =response.body();
                mAdapter = new RecyclerAdapter(images);

            }

            @Override
            public void onFailure(Call<List<Image>> call, Throwable t) {

            }
        });

    }

}
