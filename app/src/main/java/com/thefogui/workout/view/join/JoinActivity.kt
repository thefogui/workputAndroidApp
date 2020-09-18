package com.thefogui.workout.view.join

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.thefogui.workout.R
import com.thefogui.workout.controller.UserController
import com.thefogui.workout.model.dataobject.entity.User
import kotlinx.android.synthetic.main.activity_join.*

class JoinActivity : AppCompatActivity() {

    private lateinit var userController: UserController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        userController = ViewModelProvider(this).get(userController::class.java)

        setOnClickListenerBtnJoin()
        //TODO: setOnClickButtonLogin()
    }

    private fun setOnClickListenerBtnJoin() {
        val buttonJoin : Button = findViewById<Button>(R.id.btnJoin)

        buttonJoin.setOnClickListener() {
            insertUserInDatabase()
        }
    }

    private fun insertUserInDatabase() {
        val firstName = editTextPersonFirstName.text.toString()
        val lastName = editTextPersonLastName.text.toString()
        val email = editTextEmailAddress.text.toString()
        val password = editTextPassword.text.toString()
        val dateOfBirth = editTextDateOfBirth.text.toString()

        val user = User (0, firstName, lastName, email, password, dateOfBirth, null, null, true)
        userController.addUser(user)
        Toast.makeText(this, "Successfully added!", Toast.LENGTH_LONG).show()
    }

    private fun inputCheck() : Boolean {
        TODO("CHeck inputs")
    }
}