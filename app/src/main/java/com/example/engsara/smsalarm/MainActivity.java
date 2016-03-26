package com.example.engsara.smsalarm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button shareIntent;
   // private Button send;
  //  private EditText phoneNo; // relatives numbers
    //private EditText messageBody;  //massage

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
      //      phoneNo = (EditText) findViewById(R.id.mobileNumber);
        //    messageBody = (EditText) findViewById(R.id.smsBody);

            //send = (Button) findViewById(R.id.send);
            /*send.setOnClickListener(new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    String number = phoneNo.getText().toString();
                    String sms = messageBody.getText().toString();

                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(number, null, sms, null, null);
                        Toast.makeText(getApplicationContext(), "SMS Sent!",
                                Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(),
                                "SMS faild, please try again later!",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
            });


            shareIntent = (Button) findViewById(R.id.sendViaIntent);
            shareIntent.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage("", null, "", null, null);
                        Toast.makeText(getApplicationContext(), "SMS Sent!",
                                Toast.LENGTH_LONG).show();

                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(),
                                "SMS faild, please try again later!",
                                Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }*/

                }
    public void sendSMS(View v)
    {
        try {
        String phoneNumberReciver="0000000000"; //my phone number usually entered here
        String message="Hi I will be there later, See You soon";
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumberReciver, null, message, null, null);
            Toast.makeText(getApplicationContext(),
                    "SMS success!",
                    Toast.LENGTH_LONG).show();
    }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),
                    "SMS faild, please try again later!",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }}

}