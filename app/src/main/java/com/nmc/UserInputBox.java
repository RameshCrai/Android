package com.nmc;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class UserInputBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_input_box);

        EditText nameInput = findViewById(R.id.input_name);
        EditText passwordInput = findViewById(R.id.input_password);
        EditText addressInput = findViewById(R.id.input_address);
        RadioGroup genderGroup = findViewById(R.id.radio_gender);
        EditText ageInput = findViewById(R.id.input_age);
        DatePicker datePicker = findViewById(R.id.date_picker);
        Spinner stateSpinner = findViewById(R.id.spinner_state);
        Button submitButton = findViewById(R.id.submit_button);
        TextView displayData = findViewById(R.id.display_data);

        // Set a click listener on the Submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text entered in the input fields
                String name = nameInput.getText().toString();
                String password = passwordInput.getText().toString();
                String address = addressInput.getText().toString();

                // Get the selected gender
                int selectedGenderId = genderGroup.getCheckedRadioButtonId();
                RadioButton selectedGender = findViewById(selectedGenderId);
                String gender = selectedGender != null ? selectedGender.getText().toString() : "Not specified";

                // Get the age
                String age = ageInput.getText().toString();

                // Get the date of birth
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1; // Month is 0-indexed
                int year = datePicker.getYear();
                String dob = day + "/" + month + "/" + year;

                // Get the selected state
                Spinner stateSpinner = findViewById(R.id.spinner_state);
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(UserInputBox.this,
                        R.array.states_array, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                stateSpinner.setAdapter(adapter);

                // Get the selected state
                String state = stateSpinner.getSelectedItem().toString();



                // Display the captured data
                String displayText = "Name: " + name + "\n" +
                        "Password: " + password + "\n" +
                        "Address: " + address + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age + "\n" +
                        "Date of Birth: " + dob + "\n" +
                        "State: " + state;

                displayData.setText(displayText);
            }
        });
    }
}