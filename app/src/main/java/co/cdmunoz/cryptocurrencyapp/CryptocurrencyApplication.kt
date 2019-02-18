package co.cdmunoz.cryptocurrencyapp

import android.app.Activity
import android.app.Application
import co.cdmunoz.cryptocurrencyapp.di.component.DaggerAppComponent
import co.cdmunoz.cryptocurrencyapp.di.modules.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class CryptocurrencyApplication: Application(), HasActivityInjector {
//  с помощью @Inject запрашиваем зависимость 
  @Inject
  lateinit var activityInjector: DispatchingAndroidInjector<Activity>

  override fun onCreate() {
    super.onCreate()

    DaggerAppComponent.builder().appModule(AppModule(this)).build().inject(this)
  }

  override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}