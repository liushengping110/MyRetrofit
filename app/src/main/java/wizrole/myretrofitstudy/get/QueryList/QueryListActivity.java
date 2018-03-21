//package wizrole.myretrofitstudy.Get.QueryList;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import okhttp3.OkHttpClient;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
//import retrofit2.converter.gson.GsonConverterFactory;
//import wizrole.taskthree.R;
//
///**
// * Created by liushengping on 2018/3/20.
// * 何人执笔？
// *
// * Query集合
// 假如你需要添加相同Key值，但是value却有多个的情况，
// 一种方式是添加多个@Query参数，
// 还有一种简便的方式是将所有的value放置在列表中，然后在同一个@Query下完成添加，实例代码如下：
// */
//
//public class QueryListActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_querymap);
//        httpTest();
//    }
//
//    public void httpTest(){
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
////                .addInterceptor(new CustomInterceptor())//适用于所有的请求添加参数
//                .connectTimeout(5, TimeUnit.SECONDS)
//                .readTimeout(5, TimeUnit.SECONDS)
//                .writeTimeout(5, TimeUnit.SECONDS)
//                .build();
//
//        String baseUrl="https://api.douban.com/v2/movie/";
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .client(okHttpClient)
//                .build();
//
//        List<String> stringList=new ArrayList<>();
//        stringList.add("张三");
//        stringList.add("李四");
//        stringList.add("王五");
//        stringList.add("麻子");
//        BlueListService service = retrofit.create(BlueListService.class);
//        Call<BookSearchListResponse> call = service.getSearchBooks(stringList);
//        //最后得到的url地址为：https://api.douban.com/v2/book/search?name=张三&name=李四&name=王五&name=麻子
//        call.enqueue(new Callback<BookSearchListResponse>() {
//            @Override
//            public void onResponse(Call<BookSearchListResponse> call, Response<BookSearchListResponse> response) {
//                BookSearchListResponse body = response.body();
//                Log.e("----",body.toString());
//            }
//
//            @Override
//            public void onFailure(Call<BookSearchListResponse> call, Throwable t) {
//                Log.e("----",t.toString());
//            }
//        });
//    }
//}
