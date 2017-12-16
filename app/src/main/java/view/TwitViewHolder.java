package view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.twitter.R;

/**
 * Created by muridjonrahimov on 12/15/17.
 */

public class TwitViewHolder extends RecyclerView.ViewHolder {
    ImageView twitterImageView;
    TextView twitterTextView01, twitterTextView02;

    public TwitViewHolder(View itemView) {
        super(itemView);
        twitterTextView01 = itemView.findViewById(R.id.twitter_text_view01_1);
        twitterTextView02 = itemView.findViewById(R.id.twitter_text_view01_2);
    }
}
