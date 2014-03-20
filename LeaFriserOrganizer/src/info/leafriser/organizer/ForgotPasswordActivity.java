package info.leafriser.organizer;



import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPasswordActivity extends Activity{

	TextView validation;
	Button subLog;
	EditText answerEdit;
	String valmsg="";
	String answer;
	String correctAnswer="fabs";
	String correctValidation="Your password is: fabs.\n Please Log In again.";
	String wrongValidation="Please Try Again.";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgotpassword);
		
		answerEdit= (EditText)findViewById(R.id.editText1);
		validation= (TextView)findViewById(R.id.msg);
		subLog=(Button)findViewById(R.id.button1) ;
		
		
	}
	
	public void submitClicked(View v){
		
		answer=answerEdit.getText().toString().trim();
		
		if(answer.equals(correctAnswer)){
			
			validation.setText(correctValidation);
			
		}
		else
			validation.setText(wrongValidation);
	}
	
	public void backClicked(View v){
		  Intent i= new Intent (this, LoginActivity.class);
		  startActivity(i);
		  this.finish();
		  
		}
}
