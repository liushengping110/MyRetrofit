//package wizrole.myretrofitstudy.Get.QueryMap;
//
//import android.util.Log;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import okhttp3.OkHttpClient;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
///**
// * Created by liushengping on 2018/3/21.
// * 何人执笔？
// */
//
//public class Http {
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
//        Map<String, String> options = new HashMap<>();
//        options.put("q", "小王子");
//        options.put("tag", null);
//        options.put("start", "0");
//        options.put("count", "3");
//
//        BlueService service = retrofit.create(BlueService.class);
//        Call<BookSearchResponse> call = service.getSearchBooks(options);
//
//        call.enqueue(new Callback<BookSearchResponse>() {
//            @Override
//            public void onResponse(Call<BookSearchResponse> call, Response<BookSearchResponse> response) {
//                BookSearchResponse body = response.body();
//                Log.e("----",body.toString());
//            }
//
//            @Override
//            public void onFailure(Call<BookSearchResponse> call, Throwable t) {
//                Log.e("----",t.toString());
//            }
//        });
//    }
//
//}
