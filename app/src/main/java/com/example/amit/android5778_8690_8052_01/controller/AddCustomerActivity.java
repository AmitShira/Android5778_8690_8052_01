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

    public class AddCustomerActivity extends Activity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_add_customer);
        }

        private EditText LastName;
        private EditText FirstName;
        private EditText IdNumber;
        private EditText PhoneNumber;
        private EditText Email;
        private EditText CreditCardNumber;
        private Button addCustomerButton;

        /**
         * Find the Views in the layout<br />
         * <br />
         * Auto-created on 2017-12-07 16:49:06 by Android Layout Finder
         * (http://www.buzzingandroid.com/tools/android-layout-finder)
         */
        private void findViews() {
            LastName = (EditText) findViewById(R.id.LastName);
            FirstName = (EditText) findViewById(R.id.FirstName);
            IdNumber = (EditText) findViewById(R.id.IdNumber);
            PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);
            Email = (EditText) findViewById(R.id.Email);
            CreditCardNumber = (EditText) findViewById(R.id.CreditCardNumber);
            addCustomerButton = (Button) findViewById(R.id.addCustomerButton);

            addCustomerButton.setOnClickListener(this);
        }

        /**
         * Handle button click events<br />
         * <br />
         * Auto-created on 2017-12-07 16:49:06 by Android Layout Finder
         * (http://www.buzzingandroid.com/tools/android-layout-finder)
         */
        @Override
        public void onClick(View v) {
            if (v == addCustomerButton) {
                addCustomer();
                // Handle clicks for button
            }
        }

        private void addCustomer() {
            final ContentValues contentValues = new ContentValues();
            try {


                contentValues.put(ModelConst.CustomerConst.FAMILY_NAME, this.LastName.getText().toString());
                contentValues.put(ModelConst.CustomerConst.FIRST_NAME, this.FirstName.getText().toString());
                contentValues.put(ModelConst.CustomerConst.ID, this.IdNumber.getText().toString());
                contentValues.put(ModelConst.CustomerConst.PHONE_NUMBER, this.PhoneNumber.getText().toString());
                contentValues.put(ModelConst.CustomerConst.EMAIL_ADDRESS, this.Email.getText().toString());
                contentValues.put(ModelConst.CustomerConst.CREDIT_CARD_NUMBER, this.CreditCardNumber.getText().toString());

                new AsyncTask<Void, Void, String>() {
                    @Override
                    protected void onPostExecute(String idResult) {
                        super.onPostExecute(idResult);
                        if (idResult!=null)
                            Toast.makeText(getBaseContext(), "Customer Added Successfully" + idResult, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    protected String doInBackground(Void... params) {
                        try {
                            return DBManagerFactory.getManager().addCustomer(contentValues);
                        } catch (Exception e) {
                            Toast.makeText(getBaseContext(), e.getMessage() , Toast.LENGTH_LONG).show();
                        }
                        return String.valueOf(IdNumber);
                    }
                }.execute();

            } catch (Exception e) {}

        }
    }
