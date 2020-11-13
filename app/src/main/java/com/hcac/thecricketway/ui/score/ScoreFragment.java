package com.hcac.thecricketway.ui.score;

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
 * Use the {@link ScoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScoreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScoreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScoreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScoreFragment newInstance(String param1, String param2) {
        ScoreFragment fragment = new ScoreFragment();
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
        View root = inflater.inflate(R.layout.fragment_score, container, false);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);

        TextView scoreHolder1;
        scoreHolder1 = (TextView) root.findViewById(R.id.score1);
        String shc1 = "A NO BALL - can be pronounced for some reasons: If the bowler bowls the ball from some unacceptable spot, the ball is announced hazardous (regularly happens when bowled at the batsmen's body on the full), skips more than twice or moves prior to arriving at the batsman or if defenders are remaining in unlawful positions. The batsman can hit a no ball and score runs off it yet can't be out from a no ball with the exception of in the event that they are ran out, hit the ball twice, handle the ball or deter the field. The batsman increases any runs scored off the no ball for his shot while the group additionally increases one run for the no ball itself.";
        SpannableString sh1 = new SpannableString(shc1);
        sh1.setSpan(boldSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scoreHolder1.setText(sh1);

        TextView scoreHolder2;
        scoreHolder2 = (TextView) root.findViewById(R.id.score2);
        String shc2 = "A Wide Ball - will be proclaimed if the umpire figures the batsman didn't have a sensible occasion to score off the conveyance. Be that as it may if the conveyance is dumbfounded the batsmen's head it won't be announced a wide however a no ball. Umpires are a lot stricter on wide conveyances in the more limited arrangement of the game while being considerably more loose in test cricket. A wide conveyance will add one rush to the batting group and any runs scored by the batsman. The batsman can't get out off a wide conveyance aside from on the off chance that they are puzzled, run out, handle the ball, hit their wicket or discourage the field.";
        SpannableString sh2 = new SpannableString(shc2);
        sh2.setSpan(boldSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scoreHolder2.setText(sh2);

        TextView scoreHolder3;
        scoreHolder3 = (TextView) root.findViewById(R.id.score3);
        String shc3 = "A Bye - is the place where a ball that is definitely not a no ball or wide passes the striking batsman and runs are scored without the batsman hitting the ball.";
        SpannableString sh3 = new SpannableString(shc3);
        sh3.setSpan(boldSpan, 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scoreHolder3.setText(sh3);

        TextView scoreHolder4;
        scoreHolder4 = (TextView) root.findViewById(R.id.score4);
        String shc4 = "A Leg Bye - is the place where runs are scored by hitting the batsman, however not the bat and the ball is anything but a no ball or wide. Anyway no runs can be scored if the striking batsman didn't endeavor to play a shot or on the off chance that he was keeping away from the ball.";
        SpannableString sh4 = new SpannableString(shc4);
        sh4.setSpan(boldSpan, 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scoreHolder4.setText(sh4);



        return root;
    }
}