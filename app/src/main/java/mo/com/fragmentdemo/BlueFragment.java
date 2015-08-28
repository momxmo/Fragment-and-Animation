package mo.com.fragmentdemo;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 蓝色碎片
 *
 * Created by Administrator on 2015/8/26.
 */
public class BlueFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.blue_fragment,null);

        return view;

    }
}
