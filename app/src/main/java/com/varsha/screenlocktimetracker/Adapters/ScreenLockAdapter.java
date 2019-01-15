package com.varsha.screenlocktimetracker.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.varsha.screenlocktimetracker.R;

import java.util.ArrayList;

/**
 * Created by Varsha on 15-01-2019.
 */

public class ScreenLockAdapter extends RecyclerView.Adapter<ScreenLockAdapter.ViewHolder> {
    private final Context context;
    private ArrayList<String> mItemsList;

    public ScreenLockAdapter(Context context, ArrayList<String> mItemsList) {
        this.context = context;
        this.mItemsList = mItemsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);

        ScreenLockAdapter.ViewHolder vh = new ScreenLockAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mLabel.setText(mItemsList.get(position));
    }

    @Override
    public int getItemCount() {
        return mItemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mLabel;
        public ViewHolder(View itemView) {
            super(itemView);

            mLabel = (TextView) itemView.findViewById(R.id.label);

        }
    }
}
