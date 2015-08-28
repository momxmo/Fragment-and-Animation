package mo.com.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Fragment frament;
    FragmentManager fm;
    EditText et_main;
    FragmentTransaction tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_main = (EditText) findViewById(R.id.et_main);

        findViewById(R.id.tb_orange).setOnClickListener(this);
        findViewById(R.id.tb_blue).setOnClickListener(this);
        findViewById(R.id.tb_red).setOnClickListener(this);
        findViewById(R.id.tb_green).setOnClickListener(this);
        findViewById(R.id.get_fragmentArg).setOnClickListener(this);

        //获得碎片的管理者对象
        fm = getFragmentManager();

        //默认进入显示的是红色的Fragment
        red();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.tb_orange:    //点击显示橙色的画面
              orange();

                break;
            case R.id.tb_blue:

               blue();

                break;
            case R.id.tb_red:

               red();

                break;
            case R.id.tb_green:

                green();
                break;

            case R.id.get_fragmentArg:      //点击获取其他Fragment的参数

                final EditText et_red = (EditText) frament.getView().findViewById(R.id.et_fragment);

                Toast.makeText(MainActivity.this,"Fragment中的值:"+et_red.getText().toString(),Toast.LENGTH_SHORT).show();

                break;
        }
    }

    //红色的Frament
    public void red(){

        //2.打开事务
        tr = fm.beginTransaction();

        //3.创建爱你Fragmen对象
        frament = new RedFragment();

        //4.指定容器的位置，显示是那一个Fragment布局
        tr.replace(R.id.fl,frament);

        //5.提交事务
        tr.commit();

    }
    //绿色的Frament
    public void green(){
        //2.打开事务
        tr = fm.beginTransaction();

        //3.创建爱你Fragmen对象
        frament = new GreenFragment();

        //4.指定容器的位置，显示是那一个Fragment布局
        tr.replace(R.id.fl,frament);

        //5.提交事务
        tr.commit();

    }
    //橙色的Frament
    public void orange(){

        //2.打开事务
        tr = fm.beginTransaction();

        //3.创建爱你Fragmen对象

        frament = new OrangeFragment();

        //4.指定容器的位置，显示是那一个Fragment布局
        tr.replace(R.id.fl,frament);

        //5.提交事务
        tr.commit();

    }
    //蓝色的Frament
    public void blue(){

        //2.打开事务
        tr = fm.beginTransaction();

        //3.创建爱你Fragmen对象
        frament = new BlueFragment();

        //4.指定容器的位置，显示是那一个Fragment布局
        tr.replace(R.id.fl,frament);

        //5.提交事务
        tr.commit();

    }
}
