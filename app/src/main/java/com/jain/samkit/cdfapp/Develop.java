package com.jain.samkit.cdfapp;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Develop extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.develop, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        TextView de = (TextView) getActivity().findViewById(R.id.dev);

        de.setClickable(true);

        de.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://twitter.com/_samkitjain'>Samkit Jain</a>";
        de.setText(Html.fromHtml(text));
    }
}
