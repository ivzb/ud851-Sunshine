package com.example.android.sunshine.utilities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

/**
 * Created by Admin on 7/19/17.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter() {

    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutToInflate = R.layout.forecast_list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        boolean shouldAttachToParentImmediately = false;

        View inflatedView = inflater.inflate(layoutToInflate, viewGroup, shouldAttachToParentImmediately);

        ForecastViewHolder viewHolder = new ForecastViewHolder(inflatedView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null) return 0;

        return mWeatherData.length;
    }

    public void setWeatherData(String[] weatherData) {
        this.mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    class ForecastViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        public ForecastViewHolder(View view) {
            super(view);

            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }

    }

}
