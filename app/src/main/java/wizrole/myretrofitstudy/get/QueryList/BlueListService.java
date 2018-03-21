package wizrole.myretrofitstudy.get.QueryList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by liushengping on 2018/3/20.
 * 何人执笔？
 */

public interface BlueListService {
    @GET("book/search")
    Call<BookSearchListResponse> getSearchBooks(@Query("name") List<String> name);
}
