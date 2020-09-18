package com.thefogui.workout.model.db.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.thefogui.workout.model.dataobject.entity.User

@Dao
interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user : User)
}