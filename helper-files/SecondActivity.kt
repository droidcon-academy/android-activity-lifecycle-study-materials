package com.droidcon.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.droidcon.activitylifecycle.ui.theme.ActivityLifecycleTheme

class SecondActivity : ComponentActivity() {

	companion object {
		private val TAG: String = SecondActivity::class.java.simpleName    // TAG = "SecondActivity"
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setContent {
			ActivityLifecycleTheme {
				Row(
					modifier = Modifier.fillMaxSize().background(Color.DarkGray),
					horizontalArrangement = Arrangement.Center,
					verticalAlignment = Alignment.CenterVertically
				) {
					Text(color = Color.White, text = "This is Second Activity")
				}
			}
		}

		Log.d(TAG, "onCreate")
	}

	override fun onStart() {
		super.onStart()
		Log.d(TAG, "onStart")
	}

	override fun onResume() {
		super.onResume()
		Log.d(TAG, "onResume")
	}

	override fun onPause() {
		super.onPause()
		Log.d(TAG, "onPause")
	}

	override fun onStop() {
		super.onStop()
		Log.d(TAG, "onStop")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d(TAG, "onDestroy")
	}
}
