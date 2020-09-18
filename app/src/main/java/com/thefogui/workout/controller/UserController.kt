package com.thefogui.workout.controller

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.thefogui.workout.model.dataobject.entity.User
import com.thefogui.workout.model.db.user.UserDatabase
import com.thefogui.workout.model.db.user.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserController(application : Application) : AndroidViewModel(application) {

    private val repository : UserRepository

    init {
        val userDAO = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDAO)
        //todo: read post
    }

    fun addUser(user : User) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(user)
        }
    }
}