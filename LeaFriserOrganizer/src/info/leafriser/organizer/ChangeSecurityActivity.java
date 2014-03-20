package info.leafriser.organizer;



import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ChangeSecurityActivity extends Activity {

	 EditText question;
	 EditText answer;
	 String secQues, secAns;
	
	 @Override
	   protected void onCreate(Bundle savedInstanceState) {
		
		  super.onCreate(savedInstanceState);        
	       setContentView(R.layout.activity_changeques);
	 
	       question= (EditText)findViewById(R.id.ques);
		answer= (EditText)findViewById(R.id.ans);
		
		
		secQues= question.getText().toString().trim();
		secAns= answer.getText().toString().trim();
	 }
	 
	 public void saveClicked(View v){
		 
		 if(!secQues.equals("") && !secAns.equals("")){
		 Toast.makeText(getBaseContext(), "Changes Saved", Toast.LENGTH_SHORT).show();
		 this.finish();
		 }
		 else{
			 Toast.makeText(getBaseContext(), "PLease fill in blank field(s)", Toast.LENGTH_SHORT).show();
		 }
		 
		  		  
		}
		public void cancelClicked(View v){
			  Intent i= new Intent (this, SettingsActivity.class);
			  startActivity(i);
			  this.finish();
			  
			}
	 
}
