package info.leafriser.organizer;

import java.util.Calendar;

import com.example.leafriserorganizer.R;


import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;



public class EventView extends Activity {

	    static final int TIME_DIALOG_ID = 999;
	    static final int DATE_DIALOG_ID = 100;
	    
		String etitle;
		
		private int hour;
		private int minute;
		private int year;
		private int month;
		private int day;
	 
		TextView textViewTime;
		TextView text_date;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
	
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.activity_eventview);
			
			final Calendar c = Calendar.getInstance();
			hour = c.get(Calendar.HOUR_OF_DAY);
			minute = c.get(Calendar.MINUTE);
			
			text_date = (TextView) findViewById(R.id.txtDate);
			textViewTime = (TextView) findViewById(R.id.txtTime);
			
			final Calendar calendar = Calendar.getInstance();
			
			year = calendar.get(Calendar.YEAR);
			month = calendar.get(Calendar.MONTH);
			day = calendar.get(Calendar.DAY_OF_MONTH);
			
			addListenerOnButton();
				
			Bundle msg = getIntent().getExtras();
		
			etitle = msg.getString("title");
			EditText title = (EditText) findViewById(R.id.editTitle);
		
			title.setText(etitle);
			
		
			
		}
		
		
		public void timepick(View v) {
			
			Log.v("timepick", "clicktimepick");
			 
			//Button timeb = (Button) findViewById(R.id.timebtn);
	 
				 
					showDialog(TIME_DIALOG_ID);
	 
				}
	 
		public void calendarpick(View v){
			
			showDialog(DATE_DIALOG_ID);
	 
		}
	 
		@Override
		protected Dialog onCreateDialog(int id) {
			switch (id) {
			
			case DATE_DIALOG_ID:
				   // set date picker as current date
				   return new DatePickerDialog(this, datePickerListener, year, month,day);
				
			
			case TIME_DIALOG_ID:
				// set time picker as current time
				return new TimePickerDialog(this, timePickerListener, hour, minute,false);
	 
			}
			return null;
		}


private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
	 
	// when dialog box is closed, below method will be called.
	public void onDateSet(DatePicker view, int selectedYear,int selectedMonth, int selectedDay) {
		year = selectedYear;
		month = selectedMonth;
		day = selectedDay;

		// set selected date into Text View
		text_date.setText(new StringBuilder().append(month + 1)
		   .append("-").append(day).append("-").append(year).append(" "));

		

	}
};

	 
		private TimePickerDialog.OnTimeSetListener timePickerListener =  new TimePickerDialog.OnTimeSetListener() {
			public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
				hour = selectedHour;
				minute = selectedMinute;
	 
				// set current time into textview
				textViewTime.setText(new StringBuilder().append(padding_str(hour)).append(":").append(padding_str(minute)));
	 
			
	 
			}
		};
	 
		private static String padding_str(int c) {
			if (c >= 10)
			   return String.valueOf(c);
			else
			   return "0" + String.valueOf(c);
		}
		
		public void updateClicked(View v)
		{
			Toast.makeText(this, "Updated successfully", Toast.LENGTH_LONG).show();
		}
		
		public void cancelClicked(View v){
			this.finish();
		}
		
		

		public void addListenerOnButton() {

			Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
	}
}
