package com.hcac.thecricketway.ui.drills;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hcac.thecricketway.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DrillsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DrillsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DrillsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DrillsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DrillsFragment newInstance(String param1, String param2) {
        DrillsFragment fragment = new DrillsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_drills, container, false);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);

        TextView drillsholder1;
        drillsholder1 = (TextView) root.findViewById(R.id.drills1);
        String dr1 = "Major parts two by two (with glove) stand 10m separated \n" +
                "\n" +
                "Chest on to join forces with feet square \n" +
                "\n" +
                "20 simple tosses to accomplice's glove \n" +
                "\n" +
                "Guarantee competitors are tossing over the crease and that the ball pivots with genuine reverse-pivot \n" +
                "\n" +
                "(straight all over) ";
        drillsholder1.setText(dr1);
        // dr1

        TextView drillsholder2;
        drillsholder2 = (TextView) root.findViewById(R.id.drills2);
        String dr2 = "Players stay in chest on position with feet square 10m separated \n" +
                "\n" +
                "Utilizing the front elbow like seeing a weapon, adjust shoulders towards target \n" +
                "\n" +
                "10-15 tosses to accomplice's glove \n";
        drillsholder2.setText(dr2);

        TextView drillsholder3;
        drillsholder3 = (TextView) root.findViewById(R.id.drills3);
        String dr3 = "Players stay in chest on position with feet square increment separation to 15m separated \n" +
                "\n" +
                "Guarantee the front side is dynamic (palm of glove to target, palm of glove to chest) to help create both \n" +
                "\n" +
                "bearing and rotational speed. The thumbs (of two hands) should point towards the ground \n" +
                "\n" +
                "during this development \n" +
                "\n" +
                "10-15 tosses to accomplice's glove ";
        drillsholder3.setText(dr3);

        TextView drillsholder4;
        drillsholder4 = (TextView) root.findViewById(R.id.drills4);
        String dr4 = "Tap and Go \n" +
                "\n" +
                "Competitors complete similar development as the past drills, however the attention is currently on the musicality \n" +
                "\n" +
                "furthermore, timing \n" +
                "\n" +
                "Players stay in chest on position with feet square (15m separated) \n" +
                "\n" +
                "Present 'tap and go' tosses to accomplice's glove \n" +
                "\n" +
                "Hold ball before chest with hands 10cm separated tap ball to front hand (glove) and proceed to a \n" +
                "\n" +
                "smooth tossing activity with front hand to chest \n" +
                "\n" +
                "When the ball leaves the glove it begins quickening towards the toss ceaselessly.";
        drillsholder4.setText(dr4);

        TextView drillsholder5;
        drillsholder5 = (TextView) root.findViewById(R.id.drills5);
        String dr5 = "Single leg tosses with tap and go \n" +
                "\n" +
                "Players remain on left foot just (right hand toss) tap and proceed to deliver the toss concentrating \n" +
                "\n" +
                "on smooth nonstop activity while holding equilibrium and exactness. \n" +
                "\n" +
                "Change to remaining on right foot just (right hand toss) and rehash \n" +
                "\n" +
                "Switch for left hand hurlers";
        drillsholder5.setText(dr5);



        return root;
    }
}