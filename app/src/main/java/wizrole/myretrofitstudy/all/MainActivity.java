package wizrole.myretrofitstudy.all;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import wizrole.myretrofitstudy.R;
import wizrole.myretrofitstudy.demo.get.GetDemoActivity;
import wizrole.myretrofitstudy.demo.post.PostDemoActivity;

/**
 * Created by liushengping on 2018/3/21.
 * 何人执笔？
 * 此demo学习Retrofit
 * 感谢 CSDN的博主  地址为：http://blog.csdn.net/carson_ho/article/details/73732076
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GetDemoActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PostDemoActivity.class);
                startActivity(intent);
            }
        });

    }
}
