package wizrole.myretrofitstudy.get.QueryNull;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 */

public interface QueryNullService {
        @GET("book/search")
        Call<BookSearchNullResponse> getSearchBooks(@Query("q") String name,
                                                    @Query("tag") String tag, @Query("start") int start,
                                                    @Query("count") int count);
}
