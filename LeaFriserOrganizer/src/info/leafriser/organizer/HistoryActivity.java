package info.leafriser.organizer;


import com.example.leafriserorganizer.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class HistoryActivity extends ListActivity {
Intent intent;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.header);	
		TextView header = (TextView) findViewById(R.id.header_title);			
		header.setText("create an event");
		
		
		String[] event = getResources().getStringArray(R.array.karaan);		
		SimpleArrayAdapter adapter = new SimpleArrayAdapter(this,event);       
		setListAdapter(adapter);
        
       		
	}
	
	
	public void addButton (View v){
		Intent intent = new Intent (this, AddEventActivity.class);
		startActivity(intent);
	}
	
	


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String item = (String) getListAdapter().getItem(position);
		Intent intent = new Intent().setClass(this, EventView.class);
		intent.putExtra("title", item);
		startActivity(intent);
	}

}

