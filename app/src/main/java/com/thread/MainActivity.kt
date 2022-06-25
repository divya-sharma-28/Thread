package com.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.thread.thread.MyThread
import com.thread.util.Constants.TAG

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialized()
    }

    private fun initialized() {
        /**start a thread------------------*/
        MyThread().start()

        for (i in 1..20) {
            Log.d(TAG, "main thread: $i")
        }
    }
}