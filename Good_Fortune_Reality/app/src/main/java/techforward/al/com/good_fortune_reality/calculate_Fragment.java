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

public class calculate_Fragment extends Fragment {
    View view;
    private Intent mortgageCalculator;
    private Intent chooser;
    private LinearLayout myLanding;
    private WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_calculate_margins, container, false);

        init();
        // MortgageCalculator();
        webView();

        return view;
    }

    public void init() {
        web = view.findViewById(R.id.myView);

    }

    public void webView() {
        WebSettings weSettings = web.getSettings();
        weSettings.setJavaScriptEnabled(true);

        web.setWebViewClient(new callback());
        web.loadUrl("https://www.bankrate.com/calculators/mortgages/mortgage-calculator.aspx");
    }

    private class callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            //return super.shouldOverrideKeyEvent(view, event);
            return false;
        }
    }

}