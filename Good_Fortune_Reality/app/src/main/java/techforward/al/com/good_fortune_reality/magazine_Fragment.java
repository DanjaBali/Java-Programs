package techforward.al.com.good_fortune_reality;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

public class magazine_Fragment extends Fragment {
    View view;

    private Intent magazine;
    private Intent choose;
    private LinearLayout realEstateMagazine;
    private WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_real_estate_magazine, container, false);

        init();
        // RealEstateMagazine();
        webView();

        return view;
    }

    public void init() {
        web = view.findViewById(R.id.myView);

    }

    public void webView() {
        WebSettings weSettings = web.getSettings();
        weSettings.setJavaScriptEnabled(true);

        web.setWebViewClient(new magazine_Fragment.callback());
        web.loadUrl("https://magazine.realtor/");
    }

    private class callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            //return super.shouldOverrideKeyEvent(view, event);
            return false;
        }
    }
}




/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_chat_box_, container, false);
        return view;
    }
}*/