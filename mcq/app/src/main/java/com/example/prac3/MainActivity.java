package com.example.prac3;

import android.app.Dialog;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,OnClickListener {
int count=0;
    private int[] cor=new int[]{0,0,0,0,0,0};
	private Button bu;
	private RadioGroup rg1;
	private RadioGroup rg2;
	private RadioGroup rg3;
	private RadioGroup rg4;
	private RadioGroup rg5,rg6,rg7,rg8,rg9,rg10;
	private RadioButton ra1,ra2,rb1,rb2,rc3,rd1,rc1,rc2,rd2,rd3,re1,re2,rf1,rf2;
	int flag=0;

	@Override  
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        flag = 0;
        count = 0;

       setContentView(R.layout.activity_main);
        func();
    }

	protected void onResume() {

		rg1.clearCheck();

		rg2.clearCheck();

		flag=0;
		count=0;

		rg3.clearCheck();

		rg4.clearCheck();

		rg5.clearCheck();

		rg6.clearCheck();

        Toast.makeText(this,"Quiz Started!\nAll the Best",Toast.LENGTH_LONG).show();
        super.onResume();
	}
	//function
    void func()
    {
    	bu=(Button)findViewById(R.id.button);
    	rg1=(RadioGroup)findViewById(R.id.rg1);
		rg1.clearCheck();
    	rg2=(RadioGroup)findViewById(R.id.rg2);
		rg2.clearCheck();
    	rg3=(RadioGroup)findViewById(R.id.rg3);
		rg3.clearCheck();
    	rg4=(RadioGroup)findViewById(R.id.rg4);
		rg4.clearCheck();
    	rg5=(RadioGroup)findViewById(R.id.rg5);
		rg5.clearCheck();
		rg6=(RadioGroup)findViewById(R.id.rg6);
		rg6.clearCheck();

    	
    /*	ra1=(RadioButton)findViewById(R.id.ra1);
    	ra2=(RadioButton)findViewById(R.id.ra1);
    	rb1=(RadioButton)findViewById(R.id.rb1);
    	rb2=(RadioButton)findViewById(R.id.rb2);
    	rc1=(RadioButton)findViewById(R.id.rc1);
    	rc2=(RadioButton)findViewById(R.id.rc2);
    	rc3=(RadioButton)findViewById(R.id.rc3);
    	rd1=(RadioButton)findViewById(R.id.rd1);
    	rd2=(RadioButton)findViewById(R.id.rd2);
    	rd3=(RadioButton)findViewById(R.id.rd2);
    	re1=(RadioButton)findViewById(R.id.re1);
    	re2=(RadioButton)findViewById(R.id.re2);
		rf1 = (RadioButton) findViewById(R.id.rf1);*/

        ArrayList<RadioButton> arr1=new ArrayList<>();

        ra1=new RadioButton(this);
         ra2=new RadioButton(this);

        ra1.setButtonDrawable(R.drawable.radio_selector);
        ra2.setButtonDrawable(R.drawable.radio_selector);

        ra1.setText("   World Wide Web  ");
        ra2.setText("   World Whole Web    ");


        arr1.add(ra1);
        arr1.add(ra2);

        Collections.shuffle(arr1);
        for(RadioButton r:arr1){
            rg1.addView(r);
        }
        arr1.clear();
        //for 2
        rb1=new RadioButton(this);
        rb2=new RadioButton(this);
        rb1.setButtonDrawable(R.drawable.radio_selector);
        rb2.setButtonDrawable(R.drawable.radio_selector);
        rb1.setText("   Mother Board   ");
        rb2.setText("   External Drive  ");


        arr1.add(rb1);
        arr1.add(rb2);

        Collections.shuffle(arr1);
        for(RadioButton r:arr1){
            rg2.addView(r);
        }
        arr1.clear();
        //for 3
        rc1=new RadioButton(this);
        rc2=new RadioButton(this);
        rc3=new RadioButton(this);
        rc1.setText("Uniprocess");
        rc2.setText("Multiprocessor");
        rc3.setText("Multithreaded");
        rc1.setButtonDrawable(R.drawable.radio_selector);
        rc2.setButtonDrawable(R.drawable.radio_selector);
        rc3.setButtonDrawable(R.drawable.radio_selector);

        arr1.add(rc1);
        arr1.add(rc2);
        arr1.add(rc3);

        Collections.shuffle(arr1);
        for(RadioButton r:arr1){
            rg3.addView(r);
        }
        arr1.clear();
        //for 4
        rd1=new RadioButton(this);
        rd2=new RadioButton(this);
        rd3=new RadioButton(this);
        rd1.setButtonDrawable(R.drawable.radio_selector);
        rd2.setButtonDrawable(R.drawable.radio_selector);
        rd3.setButtonDrawable(R.drawable.radio_selector);
        rd1.setText("Unified Resource Link");
        rd2.setText("Uniform Registered Link");
        rd3.setText("Uniform Resource Locator");

        arr1.add(rd1);
        arr1.add(rd2);
        arr1.add(rd3);

        Collections.shuffle(arr1);
        for(RadioButton r:arr1){
            rg4.addView(r);
        }
        arr1.clear();
        // for 5
        re1=new RadioButton(this);
        re2=new RadioButton(this);

        re1.setText("   Decimal ");
        re2.setText("  Binary   ");
        re1.setButtonDrawable(R.drawable.radio_selector);
        re2.setButtonDrawable(R.drawable.radio_selector);

        arr1.add(re1);
        arr1.add(re2);

        Collections.shuffle(arr1);
        for(RadioButton r:arr1){
            rg5.addView(r);
        }
        arr1.clear();
        //for 6
        rf1=new RadioButton(this);
        rf1.setButtonDrawable(R.drawable.radio_selector);
        rf2=new RadioButton(this);
        rf2.setButtonDrawable(R.drawable.radio_selector);
        rf1.setText("   DSL    ");
        rf2.setText("   Transmitter ");

        arr1.add(rf1);
        arr1.add(rf2);

        Collections.shuffle(arr1);
        for(RadioButton r:arr1){
            rg6.addView(r);
        }
        arr1.clear();



    	rg1.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);
		rg2.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);
		rg3.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);
		rg4.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);
		rg5.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);
		rg6.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);

    	bu.setOnClickListener(this);

    	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View arg0)
	{

		 if(flag>=6){
                count=0;
           //  ================================================================================================
             for(int i=0;i<6;i++)
             {
                 if(cor[i]==1)
                        count++;

             }
            // Toast.makeText(getApplicationContext(),"Dekh"+dummy+"\n",Toast.LENGTH_LONG).show();
             int re= count*100;
             float r=re/6;
             String res=String.valueOf(r+"%");
            // Toast.makeText(getApplicationContext(),"Percentage:"+res+"\n",Toast.LENGTH_SHORT).show();
             // custom dialog
             final Dialog dialog = new Dialog(this);
             dialog.setContentView(R.layout.custom);
             dialog.setTitle("Result");

             TextView text = (TextView) dialog.findViewById(R.id.text);
             text.setText("Result "+res);
             ImageView image = (ImageView) dialog.findViewById(R.id.image);
             image.setImageResource(R.drawable.icon);

             Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);

             dialogButton.setOnClickListener(new OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     dialog.dismiss();
                 }
             });

             dialog.show();




		}else
		{

			Toast.makeText(getApplicationContext(),"All are mandatory to attemp\n",Toast.LENGTH_SHORT).show();
		}

	}
	
    
	@Override
	public void onCheckedChanged(RadioGroup r, int arg1)
    {
		switch(r.getId())
		{
			case R.id.rg1: flag++;

							if(ra1.isChecked())
							{
                               // Toast.makeText(getApplicationContext(),ra1.getText().toString()+"selected",Toast.LENGTH_SHORT).show();
								//if(ra1.getText().toString().equals("World Wide Web"))
                                   cor[0]=1;
							}
                            else
                            {
                                cor[0]=0;
                            }

			break;
			case R.id.rg2:flag++;
							if(rb1.isChecked())
							{
                                //if(rb1.getText().toString().equals("Mother Board"))
                                    cor[1]=1;
							}
                             else
                            {
                                    cor[1]=0;
                            }
												
				break;
			case R.id.rg3:flag++;	
				            if(rc2.isChecked())
							{
                               // if(rc2.getText().toString().equals("Multiprocessor"))
                                        cor[2]=1;
							}
                        else
                            {
                                cor[2]=0;
                            }
				break;
			case R.id.rg4:
						if(rd3.isChecked())
						{
                           // if(rd2.getText().toString().equals("Uniform Registered Link"))
                                cor[3]=1;

						}
                else
                        {
                            cor[3]=0;
                        }
						flag++;
				break;   
			case R.id.rg5:
				if(re2.isChecked())
							{
                                //if(re2.getText().toString().equals("Binary"))
                                    cor[4]=1;
							}
                        else
                        {
                            cor[4]=0;
                        }
			flag++;
				
				break;

			case R.id.rg6: flag++;
						if(rf1.isChecked())
						{
                          //  if(rf1.getText().toString().equals("DSL"))
							        cor[5]=1;
						}
                else
                        {
                            cor[5]=0;

                        }

				break;

		}


	}
}

/*
*     </RadioGroup>

       <TextView
           android:id="@+id/t8"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="this is ankush "
           android:layout_marginTop="20dp"/>

       <RadioGroup
           android:id="@+id/rg8"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_marginTop="20dp"
           android:orientation="horizontal" >

           <RadioButton
               android:id="@+id/rh1"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:button="@drawable/radio_selector"
               android:text="Option 1" />

           <RadioButton
               android:id="@+id/rh2"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:layout_marginLeft="80dp"
               android:button="@drawable/radio_selector"
               android:text="Option 2"
               tools:ignore="RtlHardcoded" />

       </RadioGroup>

       <TextView
           android:id="@+id/t9"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="this is ankush "
           android:layout_marginTop="20dp"/>

       <RadioGroup
           android:id="@+id/rg9"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_marginTop="20dp"
           android:orientation="horizontal" >

           <RadioButton
               android:id="@+id/ri1"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:button="@drawable/radio_selector"
               android:text="Option 1" />

           <RadioButton
               android:id="@+id/ri2"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:layout_marginLeft="80dp"
               android:button="@drawable/radio_selector"
               android:text="Option 2"
               tools:ignore="RtlHardcoded" />

       </RadioGroup>

       <TextView
           android:id="@+id/t10"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="this is ankush "
           android:layout_marginTop="20dp"/>

       <RadioGroup
           android:id="@+id/rg10"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_marginTop="20dp"
           android:orientation="horizontal" >

           <RadioButton
               android:id="@+id/rj1"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:button="@drawable/radio_selector"
               android:text="Option 1" />

           <RadioButton
               android:id="@+id/rj2"
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:layout_marginLeft="80dp"
               android:button="@drawable/radio_selector"
               android:text="Option 2"
               tools:ignore="RtlHardcoded" />

       </RadioGroup>
*/