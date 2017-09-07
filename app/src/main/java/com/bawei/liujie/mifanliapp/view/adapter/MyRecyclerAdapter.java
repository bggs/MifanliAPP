package com.bawei.liujie.mifanliapp.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.liujie.mifanliapp.R;
import com.bawei.liujie.mifanliapp.model.bean.MyData;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * 类的作用:
 * author: 刘婕
 * date:2017/9/7
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
    private Context context;
    private List<MyData.GoodsListBeanX> list;
    private ViewHolder holder;

    public MyRecyclerAdapter(Context context, List<MyData.GoodsListBeanX> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.recycler_item_first, null);
        holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String goods_name = list.get(position).getGoods_name();
        String image_url = list.get(position).getImage_url();
        holder.txtFirst.setText(goods_name);
        Glide.with(context).load(image_url).into(holder.imageFirst);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtFirst;
        private ImageView imageFirst;
        public ViewHolder(View itemView) {
            super(itemView);
            txtFirst = (TextView) itemView.findViewById(R.id.txt_first);
            imageFirst = (ImageView) itemView.findViewById(R.id.image_first);
        }
    }
}
