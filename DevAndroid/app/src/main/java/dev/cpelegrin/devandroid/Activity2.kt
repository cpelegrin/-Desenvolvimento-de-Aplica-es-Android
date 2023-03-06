package dev.cpelegrin.devandroid

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import dev.cpelegrin.devandroid.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val forResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK)
            Log.e("Activity2", "Dados: " + result.data?.getStringExtra("toPast"));
         else
            Toast.makeText(applicationContext, "Usuário pressionou o botão voltar no android", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->
            val intent = Intent(applicationContext, Activity3::class.java)
            forResult.launch(intent);
        }
        val extraData = intent.getStringExtra("key")
        binding.conteudo.texto.setText("Conteúdo enviado: " + extraData )

        Log.e("Activity2", "onCreate")
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
            R.id.action_settings -> {
                val intent = Intent(applicationContext, MainActivity::class.java)
                intent.putExtra("chave", "Valor no menu")
                startActivity(intent);
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity2", "onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity2", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity2", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity2", "onDestroy")
    }
}