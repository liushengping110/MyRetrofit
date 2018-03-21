package wizrole.myretrofitstudy.post.FieldMap;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 * Field包下请求有4个请求参数，假如说有更多的请求参数，
 * 那么通过一个一个的参数传递就显得很麻烦而且容易出错，这个时候就可以用FieldMap
 */

public interface FieldMapService {

    @FormUrlEncoded
    @POST("book/reviews")
    Call<String> addReviews(@FieldMap Map<String, String> fields);


}
