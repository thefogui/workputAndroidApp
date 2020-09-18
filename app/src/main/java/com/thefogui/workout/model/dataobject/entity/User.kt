package com.thefogui.workout.model.dataobject.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "user_data")
data class User(
    @PrimaryKey(autoGenerate = true) var id: Long?,
    var firstName: String?,
    var lastName: String?,
    var email: String?,
    var passwordAuthentication: String,
    var dateOfBirth: String,
    var lastLoggedIn: String?,
    var accessTokenizer: String?,
    var receiverNotifications: Boolean? = true
)