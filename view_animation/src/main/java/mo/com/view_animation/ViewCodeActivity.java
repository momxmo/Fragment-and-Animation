package mo.com.view_animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * 使用代码的方式进行补间动画的设置
 */

public class ViewCodeActivity extends AppCompatActivity implements OnClickListener {

    private static final String TAG = "MainActivity";
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcode_activity);
        iv = (ImageView) findViewById(R.id.iv);

        findViewById(R.id.bt_alpha).setOnClickListener(this);
        findViewById(R.id.bt_translate).setOnClickListener(this);
        findViewById(R.id.bt_rotate).setOnClickListener(this);
        findViewById(R.id.bt_scale).setOnClickListener(this);
        findViewById(R.id.bt_set).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Animation animation;

        switch(v.getId()){
            case R.id.bt_alpha: //透明化

                //设置透明状态到完全不透明的状态，0表示完全透明，1表示完全不透明

                animation = new AlphaAnimation(0,1.0f);

                //设置动画的执行时间
                animation.setDuration(2000);

                //设置动画的无限循环
                animation.setRepeatCount(AlphaAnimation.INFINITE);

                //设置动画的循环模式，播放完毕倒着播放
                animation.setRepeatMode(AlphaAnimation.REVERSE);

                //让指定控件播放这个动画
                iv.startAnimation(animation);

                break;


            case R.id.bt_translate: //平移
                //定义平移动画
                /**
                 * 从当前位置，向右边移动，并向下移动200距离，
                 */

                animation = new TranslateAnimation(
                        Animation.RELATIVE_TO_PARENT,0,
                        Animation.RELATIVE_TO_PARENT,0.5f,
                        Animation.RELATIVE_TO_PARENT,0,
                        Animation.RELATIVE_TO_PARENT,0.5f);

                //设置动画执行的世间
                animation.setDuration(2000);

                //设置动画无限循环
                animation.setRepeatCount(TranslateAnimation.INFINITE);

                //设置循环的模式，播放完毕后，倒着播放
                animation.setRepeatMode(TranslateAnimation.REVERSE);

                //让指定的控件播放这个动画
                iv.startAnimation(animation);

                break;



            case R.id.bt_rotate: //旋转

                //创建旋转动画的对象
                animation = new RotateAnimation(0,360,
                        Animation.RELATIVE_TO_SELF,0.5f,
                        Animation.RELATIVE_TO_SELF,0.5f);

                //设置旋转的时间
                animation.setDuration(2000);

                //设置无限旋转循环
                animation.setRepeatCount(RotateAnimation.INFINITE);

                //设置循环的模式，播放完毕后，倒着播放，或者重头播放()
                animation.setRepeatMode(RotateAnimation.REVERSE);

                iv.startAnimation(animation);

                break;


            case R.id.bt_scale: //缩放
                //创建缩放对象    public ScaleAnimation (float fromX, float toX, float fromY,
                // float toY, int pivotXType, float pivotXValue,
                // int pivotYType, float pivotYValue)   先对自己的大小进行缩放
                animation = new ScaleAnimation(2,1,2,1,Animation.RELATIVE_TO_SELF,
                        0.5f,Animation.RELATIVE_TO_SELF,0.5f);

                //设置缩放的时间
                animation.setDuration(2000);

                //设置无限循环的
                animation.setRepeatCount(ScaleAnimation.INFINITE);

                //设置循环的模式，播放完毕后，倒着播放，或者重头播放()
                animation.setRepeatMode(ScaleAnimation.REVERSE);

                //指定动画播放的控件
                iv.startAnimation(animation);
                break;

            case R.id.bt_set: //集合

                //1.定义一个动画集合false；每一个动画使用自己的插入qi
                AnimationSet set = new AnimationSet(false);

                //2.往这个集合里面填充动画

                /**
                 *设置透明状态到完全不透明的状态，0表示完全透明，1表示完全不透明
                 */

                AlphaAnimation alphaAnimation = new AlphaAnimation(0,1.0f);

                //设置动画的执行时间
                alphaAnimation.setDuration(2000);

                //设置动画的无限循环
                alphaAnimation.setRepeatCount(AlphaAnimation.INFINITE);

                //设置动画的循环模式，播放完毕倒着播放
                alphaAnimation.setRepeatMode(AlphaAnimation.REVERSE);

                /**
                 * 设置缩放
                 */

                ScaleAnimation  scaleAnimation = new ScaleAnimation(1,2,1,2,Animation.RELATIVE_TO_SELF,
                        0.5f,Animation.RELATIVE_TO_SELF,0.5f);

                //设置缩放的时间
                scaleAnimation.setDuration(2000);

                //设置无限循环的
                scaleAnimation.setRepeatCount(ScaleAnimation.INFINITE);

                //设置循环的模式，播放完毕后，倒着播放，或者重头播放()
                scaleAnimation.setRepeatMode(ScaleAnimation.REVERSE);


                set.addAnimation(scaleAnimation);
                set.addAnimation(alphaAnimation);

                //让控件播放这个动画
                iv.startAnimation(set);

                break;
        }
    }
}
