package com.jain.samkit.cdfapp;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Cdf_omob extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cdf_omob, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        TextView cd = (TextView) getActivity().findViewById(R.id.cdf1);
        TextView mb = (TextView) getActivity().findViewById(R.id.mb);

        cd.setClickable(true);
        mb.setClickable(true);

        cd.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://connecting-dreams.org/'>CDF Website</a>";
        cd.setText(Html.fromHtml(text));
        mb.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://activate1m1b.org/'>1M1B Website</a>";
        mb.setText(Html.fromHtml(text1));
    }
}
