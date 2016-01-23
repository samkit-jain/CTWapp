package com.jain.samkit.cdfapp;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Links extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.links, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        TextView fb = (TextView) getActivity().findViewById(R.id.facebook);
        TextView yt = (TextView) getActivity().findViewById(R.id.youtube);

        fb.setClickable(true);
        yt.setClickable(true);

        fb.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.facebook.com/ConnectingDreamsFoundation'>Facebook</a>";
        fb.setText(Html.fromHtml(text));
        yt.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='https://www.youtube.com/channel/UCc3UTpfWDgI2rEnJjn7l8cA/videos'>YouTube</a>";
        yt.setText(Html.fromHtml(text1));
    }
}