package view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.twitter.R;

/**
 * Created by muridjonrahimov on 12/12/17.
 */

public class TwitterViewHolder extends RecyclerView.ViewHolder {
    public TextView textView01_1, textView01_2, textView02_1, textView02_2, textView03_1, textView03_2;
    public ImageView imageView01, imageView02, imageView03;

    public TwitterViewHolder(View itemView) {
        super(itemView);

        imageView01 = itemView.findViewById(R.id.image_view01);
//        imageView02 = itemView.findViewById(R.id.image_view02);
//        imageView03 = itemView.findViewById(R.id.image_view03);
        textView01_1 = itemView.findViewById(R.id.text_view01_1);
        textView01_2 = itemView.findViewById(R.id.text_view01_2);
//        textView02_1 = itemView.findViewById(R.id.text_view02_1);
//        textView02_2 = itemView.findViewById(R.id.text_view02_2);
//        textView03_1 = itemView.findViewById(R.id.text_view03_1);
//        textView03_2 = itemView.findViewById(R.id.text_view03_2);

    }
}
