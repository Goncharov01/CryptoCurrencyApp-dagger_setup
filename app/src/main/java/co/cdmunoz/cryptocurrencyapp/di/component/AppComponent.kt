package co.cdmunoz.cryptocurrencyapp.di.component

import android.app.Application
import co.cdmunoz.cryptocurrencyapp.di.modules.AppModule
import co.cdmunoz.cryptocurrencyapp.di.modules.BuildersModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton
// анатацией @Singleton помечаем что это будет "Одиночка"
@Singleton
//анатация @Component это мост между @Inject и @Module
@Component(
    modules = arrayOf(AndroidInjectionModule::class, BuildersModule::class, AppModule::class)
)
interface AppComponent {
  //создастся класс DaggerAppComponent который сделает иньекцию в Application
  fun inject(app: Application)
}