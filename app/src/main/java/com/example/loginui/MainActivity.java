package com.example.loginui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
//Monu Kumar Srivastava
public class MainActivity extends AppCompatActivity {
    private ArrayList<ModalClass> modalClasses;

    private RecyclerView recyclerView;
    private LoginListAdapter mAdapter;

    private String Name[] = {"1. Login 1 Activity ",
            "2. Login 2 Activity ",
            "3. Login 3 Activity "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //use recycleview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //use arraylist
        modalClasses = new ArrayList<>();
        for (int i = 0; i < Name.length; i++) {
            ModalClass navigationList_modalClass = new ModalClass(Name[i]);

            modalClasses.add(navigationList_modalClass);
        }

        // Use of  Login List Adapter
        mAdapter = new LoginListAdapter(MainActivity.this,modalClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }

}
