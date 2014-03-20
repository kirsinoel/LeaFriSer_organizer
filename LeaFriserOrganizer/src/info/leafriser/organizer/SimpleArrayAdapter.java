package info.leafriser.organizer;

import com.example.leafriserorganizer.R;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleArrayAdapter extends ArrayAdapter<String>{

	private final Context context;
	private final String[] values;
	
	public SimpleArrayAdapter(Context context, String[] values){
		super(context, R.layout.list, values);
		this.context = context;
		this.values = values;
		
		  
		
	}
	
	    
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView;
		
		if(convertView == null){
			rowView = inflater.inflate(R.layout.list, parent, false);
			
		} else{
			rowView = convertView;	
		}	
		
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		TextView title = (TextView) rowView.findViewById(R.id.title);
		title.setText(values[position]);
		
		
		
		String s = values[position];
		
		
		if(s.startsWith("Study")){
			textView.setText(R.string.date);
						
		} else if(s.startsWith("River Trek")){
			textView.setText(R.string.date);
			
		} else if(s.startsWith("Mountain Climbing")){
			textView.setText(R.string.date);
			
		} else if(s.startsWith("Beach Party")){
			textView.setText(R.string.date);
			
		} else if(s.startsWith("Ziplining")){
			textView.setText(R.string.date);
			
		} else if(s.startsWith("Wall Climbing")){
			textView.setText(R.string.date);
			
		} else if(s.startsWith("Strolling")){
			textView.setText(R.string.date);
		
		} else if(s.startsWith("Kayaking")){
			textView.setText(R.string.date);
			
		} else if(s.startsWith("Sleeping")){
			textView.setText(R.string.date);
		
		} else if(s.startsWith("Out of town")){
			textView.setText(R.string.date);
	
		}
		
		
		
		return rowView;
	}
	

	
	    
}
