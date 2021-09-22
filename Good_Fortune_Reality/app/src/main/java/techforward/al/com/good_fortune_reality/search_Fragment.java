package techforward.al.com.good_fortune_reality;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;

public class search_Fragment extends Fragment {
    private ListView listview;
    View view;
    private WebView WebView;
    List<String> list;
    ArrayAdapter arrayAdapter;

    public search_Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_navigate, container, false);
        listview = (ListView) view.findViewById(R.id.listview);
        WebView = (WebView) view.findViewById(R.id.WebView);


        final ArrayList<Object> list = new ArrayList<Object>();
        list.add("Zillow ");
        list.add("Trulia ");
        list.add("Realtor ");
        list.add("Redfin ");
        list.add("Mls ");
        list.add("Century21");
        list.add("Remax ");
        list.add("Propertyrecord ");
        list.add("Coldwellbanker ");

        arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, list);
        listview.setAdapter(arrayAdapter);
        Initlistener();
        return view;
    }

    public void Initlistener() {
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0)
                    WebView.loadUrl("https://www.zillow.com/ ");
                else if (i == 1)
                    WebView.loadUrl("https://www.trulia.com/");
                else if (i == 2)
                    WebView.loadUrl("https://www.realtor.com/");
                else if (i == 3)
                    WebView.loadUrl("https://www.redfin.com/ ");
                else if (i == 4)
                    WebView.loadUrl("http://www.mls.com/ ");
                else if (i == 5)
                    WebView.loadUrl("https://www.century21.com/ ");
                else if (i == 6)
                    WebView.loadUrl("https://www.remax.com/ ");
                else if (i == 7)
                    WebView.loadUrl("https://www.propertyrecord.com/ ");
                else if (i == 8)
                    WebView.loadUrl("https://www.coldwellbanker.com/ ");

            }
        });
    }
}
