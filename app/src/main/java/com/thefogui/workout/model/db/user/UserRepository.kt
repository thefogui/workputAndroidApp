package com.thefogui.workout.model.db.user

import androidx.lifecycle.LiveData
import com.thefogui.workout.model.dataobject.entity.User

class UserRepository(private val userDao : UserDAO) {

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }
}