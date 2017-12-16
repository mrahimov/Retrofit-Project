package network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by muridjonrahimov on 12/15/17.
 */

public interface TwitterService {


    String access_token = "https://api.twitter.com/1.1/users/search.json";


    @GET ("users/search.json?q=Twitter%20API&page=1&count=3" + access_token)
    Call<Twitter> getRecentMedia();

    class Twitter {

        String name;
        String created_at;
        int profile_image_url;
        
    }
}
