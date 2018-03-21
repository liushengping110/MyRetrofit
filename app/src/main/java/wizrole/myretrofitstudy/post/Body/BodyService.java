package wizrole.myretrofitstudy.post.Body;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 */

public interface BodyService {

    @FormUrlEncoded
    @POST("book/reviews")
    Call<String> addReviews(@Body Reviews reviews);

}
