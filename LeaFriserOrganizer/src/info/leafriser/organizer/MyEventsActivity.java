package info.leafriser.organizer;

import com.example.leafriserorganizer.R;

import android.app.TabActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

 @SuppressWarnings("deprecation")
public class MyEventsActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myeventstab);
		
		Resources res = getResources(); 
		TabHost tabHost = getTabHost();
		
		TabSpec leadSpec = tabHost.newTabSpec("Leadership");
        Intent leadIntent = new Intent(this, Leadership.class);
        leadSpec.setContent(leadIntent);
		
        TabSpec friendSpec = tabHost.newTabSpec("Friendship");
        Intent friendIntent = new Intent(this, Friendship.class);
        friendSpec.setContent(friendIntent);
		
        TabSpec serviceSpec = tabHost.newTabSpec("Service");
        Intent serveIntent = new Intent(this, ServiceEvent.class);
        serviceSpec.setContent(serveIntent);
		
		
        TabSpec othersSpec = tabHost.newTabSpec("Others");
        Intent otherIntent = new Intent(this, Others.class);
        othersSpec.setContent(otherIntent);
		
        
      //adding tabs to tabhost
       
        leadSpec =tabHost.newTabSpec("leadership").setIndicator("Leadership", null).setContent(leadIntent);
        tabHost.addTab(leadSpec); 
        
        
        
        friendSpec =tabHost.newTabSpec("friendship").setIndicator("Friendship", null).setContent(friendIntent);
        tabHost.addTab(friendSpec);
        
        serviceSpec =tabHost.newTabSpec("service").setIndicator("Service", null).setContent(serveIntent);
        tabHost.addTab(serviceSpec); 
        
        othersSpec =tabHost.newTabSpec("others").setIndicator("Others", null).setContent(otherIntent);
        tabHost.addTab(othersSpec);
        
        tabHost.setCurrentTab(0);
        
        
     
	}

}