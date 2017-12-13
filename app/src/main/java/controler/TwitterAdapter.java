package controler;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.twitter.MyModel;
import nyc.c4q.twitter.R;
import view.TwitterViewHolder;

/**
 * Created by muridjonrahimov on 12/12/17.
 */

public class TwitterAdapter extends RecyclerView.Adapter<TwitterViewHolder> {

    Context c;
    List<MyModel> myModel;


    public Context getC() {
        return c;
    }

    public TwitterAdapter(Context c, ArrayList<MyModel> myModel) {
        this.c = c;
        this.myModel = myModel;

    }

    @Override
    public TwitterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.item_view, parent, false);
        return new TwitterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TwitterViewHolder holder, int position) {

        MyModel m = myModel.get(position);
        holder.textView01_1.setText(m.getTextView01_1());
        holder.textView01_2.setText(m.getTextView01_2());
//        holder.textView02_1.setText(m.getTextView02_1());
//        holder.textView02_2.setText(m.getTextView02_2());
//        holder.textView03_1.setText(m.getTextView03_1());
//        holder.textView03_2.setText(m.getTextView03_2());
        holder.imageView01.setImageResource(m.getImageView01());
//        holder.imageView02.setImageResource(m.getImageView02());
//        holder.imageView03.setImageResource(m.getImageView03());

    }

    @Override
    public int getItemCount() {
        return myModel.size();
    }
}
