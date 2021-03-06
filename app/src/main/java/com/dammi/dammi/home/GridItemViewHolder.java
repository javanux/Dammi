package com.dammi.dammi.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dammi.dammi.R;
import com.dammi.dammi.activitylist.ListActivity;
import com.dammi.dammi.hosts.HostActivity;

/**
 * Created by script on 11/25/15.
 */
public class GridItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    ImageView image;
    TextView title;
    Context context;
//    TextView arrow;
    public GridItemViewHolder(View itemView)
    {
        super(itemView);

        itemView.setOnClickListener(this);
        image=(ImageView)itemView.findViewById(R.id.item_image);
        title=(TextView)itemView.findViewById(R.id.item_title);
        context=itemView.getContext();
//        arrow=(TextView)itemView.findViewById(R.id.item_arrow);
    }

    @Override
    public void onClick(View v)
    {
        switch (getAdapterPosition())
        {
            case 2:
                context.startActivity(new Intent(context, HostActivity.class));
                break;

            case 1:
                context.startActivity(new Intent(context, ListActivity.class));
                break;
        }


    }
}
