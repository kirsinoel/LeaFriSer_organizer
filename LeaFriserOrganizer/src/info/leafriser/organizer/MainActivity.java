package info.leafriser.organizer;

import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class MainActivity extends FragmentActivity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}
	
	public void homeClicked(View v){
		  Intent i= new Intent (this, HomeActivity.class);
		  startActivity(i);
		
		  		  
		}
	
	   public void calendarClicked(View v){
			
			Intent intent = new Intent(this, CalendarActivity.class);
			startActivity(intent);
		}	
		
	   public void eventsClicked(View v){
			Intent intent = new Intent(this, MyEventsActivity.class);
			startActivity(intent);
			this.finish();
		}
		
		public void settingsClicked(View v){
			
			Intent intent = new Intent(this, SettingsActivity.class);
			startActivity(intent);
		}	
		
		public void historyClicked(View v){
			Intent intent = new Intent(this, HistoryActivity.class);
			startActivity(intent);
		}	
		
		public void logoutClicked(View v){
			Intent intent = new Intent(this,LoginActivity.class);
			startActivity(intent);
			this.finish();
		}	
}