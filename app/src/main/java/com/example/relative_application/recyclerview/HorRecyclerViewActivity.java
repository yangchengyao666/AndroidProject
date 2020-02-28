package com.example.relative_application.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.relative_application.R;

public class HorRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvHor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycler_view);
        mRvHor = (RecyclerView) findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecyclerViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//设置水平
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new MyDecoration());//添加分割线
        mRvHor.setAdapter(new HorAdapter(HorRecyclerViewActivity.this, new HorAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(HorRecyclerViewActivity.this,"click" + pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);

        }
    }
}
