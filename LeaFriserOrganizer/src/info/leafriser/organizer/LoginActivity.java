package info.leafriser.organizer;



import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText userName;
	EditText password;
	String uName;
	String pass;
	String trueUser="jas";
	String userPass="fabs";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		userName= (EditText)findViewById(R.id.username);
		password= (EditText)findViewById(R.id.password);
		
		//uName= userName.getText().toString().trim();
		//pass= password.getText().toString();
	}
	
	public void loginClicked(View v){
		
		uName= userName.getText().toString().trim();
		pass= password.getText().toString();
		Log.v("loginClicked", "correct username and password");
		
		//both username and password is correct
		if(uName.equals(trueUser) && pass.equals(userPass)){
			
			Toast.makeText(this, "Welcome Back Jasmine!", Toast.LENGTH_SHORT).show();
			
			 Intent i= new Intent (this, MainActivity.class);
			 startActivity(i);
			
		}
	
		else if(uName.equals("") || pass.equals("")){
				Toast.makeText(getBaseContext(), "Please fill in Username and/or Password", Toast.LENGTH_SHORT).show();			
		}
	
		//empty or wrong username and correct password
		else if( pass.equals(userPass) && !uName.equals(trueUser)){
			Toast.makeText(getBaseContext(), "Invalid Username", Toast.LENGTH_SHORT).show();
		}					
		//correct username and password is empty or incorrect
		else if(uName.equals(trueUser) &&!pass.equals(userPass) ){
			Toast.makeText(getBaseContext(), "Invalid Password", Toast.LENGTH_SHORT).show();
		}
		//both username and password are incorrect
		else{			
					Toast.makeText(getBaseContext(), "Wrong Username and Password!", Toast.LENGTH_SHORT).show();					}
		
		Log.v("loginClicked", "[end]");
	
}
	public void forgotClicked(View v){
		  Intent i= new Intent (this, ForgotPasswordActivity.class);
		  startActivity(i);
		  this.finish();
		  
		}
	
	public void registerClicked(View v){
		  Intent i= new Intent (this, RegisterActivity.class);
		  startActivity(i);
		  this.finish();
		  
		}
	
}
