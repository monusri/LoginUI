package com.example.loginui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LoginListAdapter extends RecyclerView.Adapter<LoginListAdapter.MyViewHolder> {
    Context context;

    private List<ModalClass> modalClasses;




    public LoginListAdapter(MainActivity mainActivity, List<ModalClass> modalClassList) {
        this.modalClasses = modalClassList;
        this.context = mainActivity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_login_list, parent, false);



        return new MyViewHolder(itemView);


    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        ModalClass modalClass = modalClasses.get(position);
        holder.name.setText(modalClass.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0)
                {
                    Intent i = new Intent(context, LoginActivity1.class);
                    context.startActivity(i);
                }
                else if (position == 1) {

                    Intent i = new Intent(context, LoginActivity2.class);
                    context.startActivity(i);

                }   else if (position == 2)

            {

                Intent i = new Intent(context, LoginActivity3.class);
                context.startActivity(i);
            }
//                }else if (position == 3){
//
//                    Intent i = new Intent(context, LoginActivity4.class);
//                    context.startActivity(i);
//
//                }else if (position == 4){
//
//                    Intent i = new Intent(context, LoginActivity5.class);
//                    context.startActivity(i);
//
//                }



            }
        });
    }

    @Override
    public int getItemCount() {
        return modalClasses.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView name;


        public MyViewHolder(View view) {
            super(view);


            name = (TextView) view.findViewById(R.id.txt);

        }

    }






}




