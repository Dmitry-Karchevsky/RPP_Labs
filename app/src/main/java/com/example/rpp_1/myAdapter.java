package com.example.rpp_1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ibm.icu.text.RuleBasedNumberFormat;
import java.util.Locale;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {
    private LayoutInflater inflater;
    private int myCount;

    public myAdapter(Context context, int count) {
        inflater = LayoutInflater.from(context);
        myCount = count;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new myViewHolder(inflater.inflate(R.layout.activity_second, parent, false));
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        if (position % 2 == 0) {
            holder.itemView.setBackgroundResource(R.color.even_color);
        } else {
            holder.itemView.setBackgroundResource(R.color.odd_color);
        }
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                RuleBasedNumberFormat.SPELLOUT);
        holder.setItemText(nf.format(position + 1));
    }

    @Override
    public int getItemCount() {
        return myCount;
    }
}
