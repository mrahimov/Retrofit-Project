package nyc.c4q.twitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import controler.TwitterAdapter;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview_layout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TwitterAdapter(this, getData()));




    }

    private ArrayList getData() {

        ArrayList<MyModel> myModels = new ArrayList<>();

        MyModel m = new MyModel();
        m.setTextView01_1("card 1");
        m.setTextView01_2("card 1.2");
        m.setImageView01(R.drawable.twitter);
        myModels.add(m);

        m = new MyModel();
        m.setTextView01_1("card 2");
        m.setTextView01_2("card 2.2");
        m.setImageView01(R.drawable.twitter);
        myModels.add(m);

        m = new MyModel();
        m.setTextView01_1("card 3");
        m.setTextView01_2("card 3.2");
        m.setImageView01(R.drawable.twitter);
        myModels.add(m);

        return myModels;
    }
}
