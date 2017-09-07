package com.bawei.liujie.mifanliapp.control.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bawei.liujie.mifanliapp.model.net.NetCallBack;
import com.bawei.liujie.mifanliapp.R;
import com.bawei.liujie.mifanliapp.model.bean.MyData;
import com.bawei.liujie.mifanliapp.model.util.okHttpUtils;
import com.bawei.liujie.mifanliapp.view.adapter.MyRecyclerAdapter;
import com.bumptech.glide.Glide;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mGallery;
    private LayoutInflater mInflater;
    private HorizontalScrollView Horizontal;
    String[] title = {"今日上新", "最后疯抢", "即将上新", "美妆护肤", "食品保健", "美妆护肤", "食品保健"};
    private TextView txt;
    private String url = "http://apiv4.yangkeduo.com/v2/haitaov2?page=1&size=20&pdduid=";
    private static final String TAG = "MainActivity";
    private FrameLayout frameLayout;
    private RecyclerView mRecyclerView;
    private ImageView mainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInflater = LayoutInflater.from(this);
        initView();
    }


    private void initView() {

        mGallery = (LinearLayout) findViewById(R.id.id_gallery);

        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        for (int i = 0; i < title.length; i++) {
            View view = mInflater.inflate(R.layout.activity_horizontal_item, mGallery, false);
            txt = (TextView) view.findViewById(R.id.item_text);
            txt.setText(title[i]);
            txt.setId(i);
            mGallery.addView(view);
            txt.setOnClickListener(new OnClickListenerImpl());
        }

    }

    private class OnClickListenerImpl implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Log.i("------------", "onClick: " + "ccccccccccccccccccccccc");
            switch (v.getId()) {
                case 0:
                    frameLayout.addView(View.inflate(MainActivity.this, R.layout.recycler_first, null));
                    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                    mainImage = (ImageView) findViewById(R.id.main_image);
                    okHttpUtils utils = new okHttpUtils();
                    utils.LoadData(url, new NetCallBack() {
                        @Override
                        public void success(Object o) {
                            MyData myData = (MyData) o;
                            final List<MyData.GoodsListBeanX> goodsList = myData.getGoodsList();
                            Glide.with(MainActivity.this).load(goodsList.get(5).getHd_thumb_url()).into(mainImage);
                            Log.e(TAG, "success: " + goodsList.size());
                            LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                            mRecyclerView.setLayoutManager(manager);
                            MyRecyclerAdapter adapter = new MyRecyclerAdapter(MainActivity.this, goodsList);
                            mRecyclerView.setAdapter(adapter);
                            adapter.notifyDataSetChanged();
                        }

                        @Override
                        public void error(int code, String str) {

                        }
                    }, MyData.class);
                    Toast.makeText(MainActivity.this, "fwe", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(MainActivity.this, "bfdgs", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(MainActivity.this, "趁风使柁", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

    }
}