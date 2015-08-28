package mo.com.view_animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private static final String TAG = "MainActivity";
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);

        findViewById(R.id.bt_alpha).setOnClickListener(this);
        findViewById(R.id.bt_translate).setOnClickListener(this);
        findViewById(R.id.bt_rotate).setOnClickListener(this);
        findViewById(R.id.bt_scale).setOnClickListener(this);
        findViewById(R.id.bt_set).setOnClickListener(this);
        findViewById(R.id.bt_vision2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bt_alpha: //透明化

                final Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_demo);
                iv.startAnimation(animation);

                break;


            case R.id.bt_translate: //平移
                final Animation translate = AnimationUtils.loadAnimation(this, R.anim.translate_demo);
                iv.startAnimation(translate);
                break;



            case R.id.bt_rotate: //旋转
               Animation rotate = AnimationUtils.loadAnimation(this,R.anim.rotate_demo);
                iv.startAnimation(rotate);
                break;


            case R.id.bt_scale: //缩放
                final Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale_demo);
                iv.startAnimation(scale);
                break;
            case R.id.bt_set: //集合
                final Animation set_demo = AnimationUtils.loadAnimation(this, R.anim.set_demo);
                iv.startAnimation(set_demo);
                break;
            case R.id.bt_vision2: //集合
                Intent intent = new Intent(this,ViewCodeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
