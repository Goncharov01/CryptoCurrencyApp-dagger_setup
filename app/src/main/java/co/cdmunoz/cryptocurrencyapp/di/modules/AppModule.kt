package co.cdmunoz.cryptocurrencyapp.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//анатация @Module предоставляет завизисмось
@Module
class AppModule(val app: Application){
// @Provides это метод внутри @Module конструирует и предоставляет зависимость
  @Provides
  // анатацией @Singleton помечаем что это будет "Одиночка"
  @Singleton
  fun provideApplication(): Application {
    return app
}
}