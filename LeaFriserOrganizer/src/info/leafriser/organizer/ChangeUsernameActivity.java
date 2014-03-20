package info.leafriser.organizer;



import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ChangeUsernameActivity  extends Activity{
	
	 EditText username;
	 String uName;
	 @Override
	   protected void onCreate(Bundle savedInstanceState) {
		
		  super.onCreate(savedInstanceState);        
	       setContentView(R.layout.activity_change_user);
	 
	       username= (EditText)findViewById(R.id.uname);
	       
	 }
	 
public void saveClicked(View v){
	      uName=username.getText().toString().trim();
		 
		 if(uName.equals(""))
		 {
			 Toast.makeText(this, "Please fill in blank field(s)", Toast.LENGTH_SHORT).show();
		 }
			 
		 else{	 
		  Toast.makeText(getBaseContext(), "Username Changed", Toast.LENGTH_SHORT).show();
		 
		  this.finish();
		 }
		}
	 
	 
	 public void cancelClicked(View v){
		
		  this.finish();
		  
		}
}