package info.leafriser.organizer;



import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class RegisterActivity extends Activity{
	 EditText userName;
	 EditText password; 
	 EditText question;
	 EditText answer;
	 String uName, pass, secQues, secAns;
	
	@Override
	   protected void onCreate(Bundle savedInstanceState) {
		
		   super.onCreate(savedInstanceState);        
	       setContentView(R.layout.activity_register);
	        
	        userName= (EditText)findViewById(R.id.username);
			password= (EditText)findViewById(R.id.password);
			question= (EditText)findViewById(R.id.ques);
			answer= (EditText)findViewById(R.id.ans);
			
			uName= userName.getText().toString().trim();
			pass= password.getText().toString();
			secQues= question.getText().toString().trim();
			secAns= answer.getText().toString().trim();
	     }
	 
	 public void registerClicked(View v){
		 
		 
		 if(uName.equals("") || pass.equals("") || secQues.equals("") || secAns.equals(""))
		 {
			 Toast.makeText(this, "Please fill in blank field(s)", Toast.LENGTH_LONG).show();
		 }
			 
		 else{	 
		  Toast.makeText(getBaseContext(), "Successfully Registered!", Toast.LENGTH_LONG).show();
		 
		  Intent i= new Intent (this, HomeActivity.class);
		  startActivity(i);
		  this.finish();
		 }
		}
	 
	 
	 public void cancelClicked(View v){
		  Intent i= new Intent (this, LoginActivity.class);
		  startActivity(i);
		  this.finish();
		  
		}
}
