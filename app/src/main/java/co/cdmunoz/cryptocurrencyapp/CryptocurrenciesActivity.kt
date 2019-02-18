package co.cdmunoz.cryptocurrencyapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import javax.inject.Inject

class CryptocurrenciesActivity : AppCompatActivity() {
    //с помощью анатации Inject запрашиваем зависимость
@Inject
lateinit var context:Context
  override fun onCreate(savedInstanceState: Bundle?) {
    //иньекция зависимости для активити
      AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    println(context)
  }
}
