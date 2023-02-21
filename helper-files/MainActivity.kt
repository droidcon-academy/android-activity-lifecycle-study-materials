package com.droidcon.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.droidcon.activitylifecycle.ui.theme.ActivityLifecycleTheme

class MainActivity : ComponentActivity() {

	companion object {
		private val TAG: String = MainActivity::class.java.simpleName   // TAG = "MainActivity"
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setContent {
			ActivityLifecycleTheme {

				val context = LocalContext.current

				Row(modifier = Modifier
					.fillMaxSize()
					.background(Color.Black),
					horizontalArrangement = Arrangement.Center,
					verticalAlignment = Alignment.CenterVertically
				) {
					Button(
						onClick = {
							context.startActivity(Intent(context, SecondActivity::class.java))
					}) {
						Text(text = "Go to Next Activity")
					}
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

	override fun onRestart() {
		super.onRestart()
		Log.d(TAG, "onRestart")
	}
}
