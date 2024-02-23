package revision.android;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

class CitiesHolder {
    ListView citiesView;
    public CitiesHolder(View view){
        citiesView = (ListView) view.findViewById(R.id.List);
    }
}

public class CitiesAdapter extends BaseAdapter {

    String[] data = new String[]{};
    public CitiesAdapter(String[] cities){
        this.data = cities;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView;
    }
}
