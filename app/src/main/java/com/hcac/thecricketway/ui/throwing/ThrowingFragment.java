package com.hcac.thecricketway.ui.throwing;

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
 * Use the {@link ThrowingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThrowingFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ThrowingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThrowingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThrowingFragment newInstance(String param1, String param2) {
        ThrowingFragment fragment = new ThrowingFragment();
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
        View root = inflater.inflate(R.layout.fragment_throwing, container, false);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);


        TextView descText;
        String  desc ="the nonappearance of expansive or unequivocal throwing capacity, tutors can help contenders with working up their ability to throw if they grasp essential learning speculation and reformist over-trouble. As we all in all know, contenders learn through the going with ";
        descText = (TextView) root.findViewById(R.id.throwing_tips);
        descText.setText(desc);
        // description

        TextView tips1holder;
        tips1holder = (TextView) root.findViewById(R.id.throwing_tips1);
        String tips1 = "o Hearing an explanation of a fitness/development o Seeing a presentation of a skill/development ";
        SpannableString ss1 = new SpannableString(tips1);
        ss1.setSpan(boldSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tips1holder.setText(ss1);
        // tips 1

        TextView tips2holder;
        tips2holder = (TextView) root.findViewById(R.id.throwing_tips2);
        String tips2 = "o Being permitted an opportunity to practice Competitors are right now entering cricket programs with lower levels of real ability than they actually have beforehand, so even without clear explanations, or extreme throwing drills, contenders will improve their throwing at whatever point offered events to practice. Using an outcome based learning approach (eg. ceaselessly endeavor to hit somewhat goal) and giving analysis on their results is more than agreeable. \\n Tossing regardless, can be incredibly troubling on the body, so doing an inordinate measure of too soon can cause injury. Introducing moderate proportions of throwing, and a while later growing this (both volume and power) after some time will develop the advancement viability, extending both power creation and injury resistance similarly as the level of capacity of the contender. To improve the throwing of their rivals, coaches must: ";
        SpannableString ss2 = new SpannableString(tips2);
        ss2.setSpan(boldSpan, 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tips2holder.setText(ss2);
        // tips 2

        TextView tips3holder;
        tips3holder = (TextView) root.findViewById(R.id.throwing_tips3);
        String tips3 = "o Provide contenders events to throw ";
        SpannableString ss3 = new SpannableString(tips3);
        ss3.setSpan(boldSpan, 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tips3holder.setText(ss3);
        // tips 3

        TextView tips4holder;
        tips4holder = (TextView) root.findViewById(R.id.throwing_tips4);
        String tips4 = "o Use reformist over-weight to grow their volume and power after some time";
        SpannableString ss4 = new SpannableString(tips4);
        ss4.setSpan(boldSpan, 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tips4holder.setText(ss4);
        // tips 4


        return root;
    }
}