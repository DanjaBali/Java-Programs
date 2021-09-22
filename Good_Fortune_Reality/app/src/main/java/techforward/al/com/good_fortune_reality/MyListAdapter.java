package techforward.al.com.good_fortune_reality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.app.Activity;
import android.text.util.Linkify;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ArrayAdapter;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] url;
    private final String[] email;

    public MyListAdapter(Activity context, String[] url, String[] email) {
        super(context, R.layout.list_view, url);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.url = url;
        this.email = email;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_view, null, true);

        TextView titleText = (TextView) rowView.findViewById(R.id.url);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.email);

        titleText.setText(url[position]);
        subtitleText.setText(email[position]);

        return rowView;
    }

    ;

}