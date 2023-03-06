package dev.cpelegrin.devandroid

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.Menu
import android.view.MenuItem
import dev.cpelegrin.devandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

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
        val extraData = intent.getStringExtra("chave")
        binding.conteudo.texto.setText("Conteúdo enviado: " + extraData )

        Log.i("Nome da Activity", "onCreate")
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
        Log.e("Nome da Activity", "onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.wtf("Nome da Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Nome da Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Nome da Activity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Nome da Activity", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Nome da Activity", "onDestroy")
    }
}