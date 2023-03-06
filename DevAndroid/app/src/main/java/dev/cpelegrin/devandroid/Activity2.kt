package dev.cpelegrin.devandroid

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.Menu
import android.view.MenuItem
import dev.cpelegrin.devandroid.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        Log.i("Activity2", "onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity2", "onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.wtf("Activity2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Activity2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Activity2", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity2", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity2", "onDestroy")
    }
}