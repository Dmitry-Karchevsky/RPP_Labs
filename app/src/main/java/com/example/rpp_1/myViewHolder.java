package com.example.rpp_1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class myViewHolder extends RecyclerView.ViewHolder {

    private TextView myText;

    public myViewHolder(View itemView) {
        super(itemView);
        myText = (TextView) itemView.findViewById(R.id.text);
    }

    public void setItemText(String text) {
        myText.setText(text);
    }
}

