package com.example.amit.android5778_8690_8052_01.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.example.amit.android5778_8690_8052_01.R;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private ScrollView rootView;
    private Button addCustomerButton;
    private Button addCarButton;
    private Button addBranchButton;
    private Button addCarModelButton;
    private Button showCustomerlistButton;
    private Button showCarlistButton;
    private Button showBranchlistButton;
    private Button showCarmodelList;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-06 22:51:24 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        addCustomerButton = (Button)findViewById( R.id.addCustomerButton );
        addCarButton = (Button)findViewById( R.id.addCarButton );
        addBranchButton = (Button)findViewById( R.id.addBranchButton );
        addCarModelButton = (Button)findViewById( R.id.addCarModelButton );
        showCustomerlistButton = (Button)findViewById( R.id.showCustomerlistButton );
        showCarlistButton = (Button)findViewById( R.id.showCarlistButton );
        showBranchlistButton = (Button)findViewById( R.id.showBranchlistButton );
        showCarmodelList = (Button)findViewById( R.id.showCarmodelList );

        addCustomerButton.setOnClickListener( this );
        addCarButton.setOnClickListener( this );
        addBranchButton.setOnClickListener( this );
        addCarModelButton.setOnClickListener( this );
        showCustomerlistButton.setOnClickListener( this );
        showCarlistButton.setOnClickListener( this );
        showBranchlistButton.setOnClickListener( this );
        showCarmodelList.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-06 22:51:24 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    public void AddCustomer()
    {
        Intent intent = new Intent(this,AddCustomerActivity.class);
        startActivity(intent);
    }
    public void AddCar()
    {
        Intent intent = new Intent(this,AddCarActivity.class);
        startActivity(intent);
    }
    public void AddBranch()
    {
        Intent intent = new Intent(this,AddBranchActivity.class);
        startActivity(intent);
    }
    public void AddCarModel()
    {
        Intent intent = new Intent(this,AddCarModelActivity.class);
        startActivity(intent);
    }
    public void ShowCustomerlist()
    {
        Intent intent = new Intent(this,ShowCustomerlistActivity.class);
        startActivity(intent);
    }
    public void ShowCarlist()
    {
        Intent intent = new Intent(this,ShowCarlistActivity.class);
        startActivity(intent);
    }
    public void ShowBranchlist()
    {
        Intent intent = new Intent(this,ShowBranchlistActivity.class);
        startActivity(intent);
    }
    public void ShowCarmodelList()
    {
        Intent intent = new Intent(this,ShowCarmodelListActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if ( v == addCustomerButton ) {
           AddCustomer();
            // Handle clicks for addCustomerButton
        } else if ( v == addCarButton ) {
            AddCar();
            // Handle clicks for addCarButton
        } else if ( v == addBranchButton ) {
            AddBranch();
            // Handle clicks for addBrachButton
        } else if ( v == addCarModelButton ) {
            AddCarModel();
            // Handle clicks for addCarModelButton
        } else if ( v == showCustomerlistButton ) {
            ShowCustomerlist();
            // Handle clicks for showCustomerlistButton
        } else if ( v == showCarlistButton ) {
            ShowCarlist();
            // Handle clicks for showCarlistButton
        } else if ( v == showBranchlistButton ) {
            ShowBranchlist();
            // Handle clicks for showBranchlistButton
        } else if ( v == showCarmodelList ) {
            ShowCarmodelList();
            // Handle clicks for showCarmodelList
        }
    }


}
