package matchwear.com.matchwearapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuetBox extends Fragment {


    public LuetBox() {
        // Required empty public constructor
    }

    private Button LuetButton;
    private String hi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_luet_box, container, false);//when wrking with fragments create a view
        // Inflate the layout for this fragment

        final PopupWindow popup = new PopupWindow(getActivity());
        Button LuetButton = (Button) view.findViewById(R.id.mbutton);//referencing from fragment_luet_box
        final LinearLayout mainlayout = new LinearLayout(getActivity());
        LuetButton.setOnClickListener(new View.OnClickListener() {
            boolean clicked=true;
            @Override
            public void onClick(View v) {
                if (clicked){
                    clicked=false;
                    popup.showAtLocation(mainlayout, Gravity.CENTER,20,20);
                    popup.update(50,50,100,100);
                }
                else{
                    clicked=true;
                    popup.dismiss();
                }


            }
        });


        return view;

    }

}
