package com.example.amit.android5778_8690_8052_01.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.amit.android5778_8690_8052_01.R;
import com.example.amit.android5778_8690_8052_01.model.backend.DBManagerFactory;
import com.example.amit.android5778_8690_8052_01.model.backend.ModelConst;
import com.example.amit.android5778_8690_8052_01.model.entities.Car;

public class AddCarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
    }

    private EditText BranchNumber;
    private EditText Kilometerage;
    private EditText CarNumber;
    private EditText ModelCode;
    private Button AddCar;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-10 19:42:02 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        BranchNumber = (EditText)findViewById( R.id.BranchNumber );
        Kilometerage = (EditText)findViewById( R.id.Kilometerage );
        CarNumber = (EditText)findViewById( R.id.CarNumber );
        ModelCode = (EditText)findViewById( R.id.ModelCode );
        AddCar = (Button)findViewById( R.id.AddCar );

        AddCar.setOnClickListener((View.OnClickListener) this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-10 19:42:02 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddCar ) {
           addCar();
        }
    }

    private void addCar() {
        final ContentValues contentValues = new ContentValues();

        try {
            int bNumber = Integer.valueOf(this.BranchNumber.getText().toString());
            contentValues.put(ModelConst.CarConst.BRANCH_NUMBER, bNumber);
            int km = Integer.valueOf(this.Kilometerage.getText().toString());
            contentValues.put(ModelConst.CarConst.KILOMETERAGE, km);
            final int carnum = Integer.valueOf(this.CarNumber.getText().toString());
            contentValues.put(ModelConst.CarConst.CAR_NUMBER, carnum);
            int model = Integer.valueOf(this.ModelCode.getText().toString());
            contentValues.put(ModelConst.CarConst.CODEMODEL, model);

            new AsyncTask<Void, Void, Integer>() {
                @Override
                protected void onPostExecute(Integer idResult) {
                    super.onPostExecute(idResult);
                    if (idResult != null)
                        Toast.makeText(getBaseContext(), "Car Added Successfully" + idResult, Toast.LENGTH_LONG).show();
                }

                @Override
                protected Integer doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addCar(contentValues);

                  //  return Integer.valueOf(this.CarNumber.getText());
                }

            }.execute();

        } catch (Exception e) {
        }
    }

}

