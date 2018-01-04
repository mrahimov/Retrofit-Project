package nyc.c4q.twitter;

/**
 * Created by muridjonrahimov on 1/3/18.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import static nyc.c4q.twitter.NewsActivity.KEY_IMAGE_URL;


/**
 * Created by muridjonrahimov on 1/3/18.
 */

public class NewsAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;

    NewsAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data = d;
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        NewsViewHolder holder = null;
        if (convertView == null) {
            holder = new NewsViewHolder();
            convertView = LayoutInflater.from(activity).inflate(R.layout.news_view, parent, false);
            holder.galleryImage = convertView.findViewById(R.id.galleryImage);
            holder.author = convertView.findViewById(R.id.author);
            holder.title = convertView.findViewById(R.id.title);
            holder.sdetails = convertView.findViewById(R.id.sdetails);
            holder.time = convertView.findViewById(R.id.time);
            convertView.setTag(holder);

        } else {
            holder = (NewsViewHolder) convertView.getTag();
        }
        holder.galleryImage.setId(position);
        holder.author.setId(position);
        holder.title.setId(position);
        holder.sdetails.setId(position);
        holder.time.setId(position);

        HashMap<String, String> song;
        song = data.get(position);

        try {
            holder.author.setText(song.get(NewsActivity.KEY_AUTHOR));
            holder.title.setText(song.get(NewsActivity.KEY_TITLE));
            holder.time.setText(song.get(NewsActivity.KEY_PUBLISHED));
            holder.sdetails.setText(song.get(NewsActivity.KEY_DESCRIPTION));

            if (song.get(KEY_IMAGE_URL).length() < 5) {
                holder.galleryImage.setVisibility(View.GONE);
            } else {
                Picasso.with(activity)
                        .load(song.get(KEY_IMAGE_URL))
                        .resize(350, 250)
                        .into(holder.galleryImage);
            }
        } catch (Exception e) {
        }
        return convertView;
    }
}



