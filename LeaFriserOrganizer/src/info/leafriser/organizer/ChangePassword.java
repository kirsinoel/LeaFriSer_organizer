package info.leafriser.organizer;


import com.example.leafriserorganizer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ChangePassword extends Activity{
		 EditText curPass;
		 EditText newPass, RetypePass;
		 String cP, nP, rP;
		 String truePass="fabs";
		 
		 @Override
		   protected void onCreate(Bundle savedInstanceState) {
			
			   super.onCreate(savedInstanceState);        
		       setContentView(R.layout.activity_change_pass);
		        
		        curPass= (EditText)findViewById(R.id.oldPass);
				newPass= (EditText)findViewById(R.id.newPass);
				RetypePass= (EditText)findViewById(R.id.renPass);
			
				
				cP= curPass.getText().toString();
				nP= newPass.getText().toString();
				rP= RetypePass.getText().toString();
           }
		 
public void saveClicked(View v){
			 
			 
			 if(cP.equals(nP))
			 {
				 Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
			 }
				
			 else if( cP.equals(truePass) && nP.equals(rP))
			 {
				 Toast.makeText(this, "Successfully change password", Toast.LENGTH_SHORT).show();
				 this.finish();
			 }
			 
			 else if ( cP.equals("") && nP.equals(rP))
				 Toast.makeText(this, "Please put current password", Toast.LENGTH_SHORT).show();
			 
			 else if ( cP.equals(truePass) && !nP.equals(rP))
				 Toast.makeText(this, "Password Mismatch", Toast.LENGTH_SHORT).show();
			 
			
			 
			}
		 
		 
		 public void cancelClicked(View v){
			  
			  this.finish();
			  
			}
}
