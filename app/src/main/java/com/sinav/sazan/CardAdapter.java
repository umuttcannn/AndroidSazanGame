package com.sinav.sazan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CardAdapter extends ArrayAdapter<Card> {
    public CardAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public CardAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CardAdapter(@NonNull Context context, int resource, @NonNull Card[] objects) {
        super(context, resource, objects);
    }

    public CardAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Card[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CardAdapter(@NonNull Context context, int resource, @NonNull List<Card> objects) {
        super(context, resource, objects);
    }

    public CardAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Card> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.adapter_card,
                    null);
        }
        Card c = getItem(position);

        if (c != null) {
            TextView textView1 = (TextView)v.findViewById(R.id.adapterTextView);
            TextView textView2 = (TextView)v.findViewById(R.id.adapterTextView2);

            if(textView1 != null && textView2 != null){
                textView1.setText(c.card_name);
                textView2.setText(c.cards.get(1));
            }
        }
        return v;
    }
}
