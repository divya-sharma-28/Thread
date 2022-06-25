package com.thread.thread

import android.util.Log
import com.thread.util.Constants.TAG

class MyThread : Thread() {

    override fun run() {
        someOperation()
    }

    private fun someOperation() {
        for (i in 0..10) {
            Log.d(TAG, "background thread: $i")
        }
    }
}