package co.cdmunoz.cryptocurrencyapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import javax.inject.Inject

class CryptocurrenciesActivity : AppCompatActivity() {
@Inject
lateinit var context:Context
  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    println(context)
  }
}
