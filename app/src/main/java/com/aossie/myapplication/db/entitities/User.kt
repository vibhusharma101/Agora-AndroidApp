package com.aossie.myapplication.db.entitities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class User(val username:String,val name:String,val email:String,val password:String,val tokenKey:String,val expiresOn:String)
    :Serializable{

    @PrimaryKey(autoGenerate = true)
    var id:Int=0

}