package com.aossie.myapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aossie.myapplication.db.dao.UserDao
import com.aossie.myapplication.db.entitities.User

@Database(
    entities = [User::class],
    version=1
)
abstract class MyDatabase:RoomDatabase() {

    abstract fun getUserDao():UserDao


    companion object{

        @Volatile private var instance : MyDatabase?=null
        private val LOCK = Any()
        operator  fun invoke(context: Context) =
            instance ?: synchronized(LOCK){

                instance?: buildDatabase(context).also {
                    instance = it
                }
            }
        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                MyDatabase::class.java,"myDatabase").build()
    }


}