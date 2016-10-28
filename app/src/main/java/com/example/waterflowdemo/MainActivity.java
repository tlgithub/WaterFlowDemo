package com.example.waterflowdemo;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private DressBean db;
    private List<DressBean.ResultsBean> results;
    private List<String> imagepaths;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.main_recyclerview);

        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1){
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(new MyAdapter(getApplicationContext(),imagepaths));
                }
            }
        };


        new Thread(){
            @Override
            public void run() {
                try {
                    String jsonresoult = HttpGet.getJsonResoult("http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1");
                    Gson gson = new Gson();
                    db = gson.fromJson(jsonresoult,DressBean.class);
                    results = db.getResults();
                    imagepaths = new ArrayList<String>();
                    String dress;
                    for (int i = 0;i <results.size();i++){
                        dress = results.get(i).getUrl();
                        imagepaths.add(dress);
                        Log.e("data",imagepaths.get(i));
                    }
                    Message message = new Message();
                    message.what = 1;
                    handler.sendMessage(message);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.start();


    }
}

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private Context mContext;
    private List<String> mDatas;
    private static int SCREE_WIDTH = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public MyViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.item_image);
        }
    }

    public MyAdapter(Context context,List<String> imagepaths){
        this.mContext = context;
        this.mDatas = imagepaths;
        SCREE_WIDTH = mContext.getResources().getDisplayMetrics().widthPixels;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(mContext).
                load(mDatas.get(position)).
                centerCrop().
                placeholder(R.mipmap.ic_launcher).
                into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_image);
        CardView cardView = (CardView)view.findViewById(R.id.item_cardview);
        cardView.getLayoutParams().height = (int)(new Random().nextInt(150)+600);
        cardView.getLayoutParams().width = SCREE_WIDTH/2;
        /*imageView.getLayoutParams().height = (int)(new Random().nextInt(150)+600);
        imageView.getLayoutParams().width = SCREE_WIDTH/2;*/
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }
}
