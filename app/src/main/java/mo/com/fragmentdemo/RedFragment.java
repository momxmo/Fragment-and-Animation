package mo.com.fragmentdemo;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 红色碎片
 *
 * Created by Administrator on 2015/8/26.
 */
public class RedFragment extends Fragment {

    EditText et_main;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.red_fragment,null);
            //调用者Activity的属性
        et_main = (EditText) getActivity().findViewById(R.id.et_main);
        view.findViewById(R.id.bt_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Activity中的内容是：" + et_main.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}
