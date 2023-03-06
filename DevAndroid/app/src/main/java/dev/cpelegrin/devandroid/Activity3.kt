package dev.cpelegrin.devandroid

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import dev.cpelegrin.devandroid.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_3)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            val data = Intent()
            data.putExtra("toPast", "Dados da activity 3" );

            setResult(Activity.RESULT_OK, data);
            finish()
        }
        Log.e("Activity3", "onCreate");
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_3)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity3", "onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity3", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity3", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity3", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity3", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity3", "onDestroy")
    }
}