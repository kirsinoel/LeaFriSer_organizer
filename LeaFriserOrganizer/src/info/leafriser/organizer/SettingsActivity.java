package info.leafriser.organizer;

import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends Activity {

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_settings);
	 
	 }
		 
	public void changeUsername(View v){
			 		 
			Intent i= new Intent (this,ChangeUsernameActivity.class);
			  startActivity(i);
			  
			  
			 
	}
	
	public void changePass(View v){
		 
		Intent i= new Intent (this,ChangePassword.class);
		  startActivity(i);
		  
		  
		 
   } 
	
 
		
	 
	
	public void changeSec(View v){
			 
			 
			Intent i= new Intent (this,ChangeSecurityActivity.class);
			  startActivity(i);
			  
			  
			 
			}
		 
		 public void saveClicked(View v){
			 Toast.makeText(getBaseContext(), "Changes Saved", Toast.LENGTH_SHORT).show();
			 Intent i= new Intent (this,MainActivity.class);
			  startActivity(i);
			  this.finish();
			  		  
			}
	      
		 public void cancelClicked(View v){
			  Intent i= new Intent (this, MainActivity.class);
			  startActivity(i);
			  this.finish();
			  		  
			}
	      
}
