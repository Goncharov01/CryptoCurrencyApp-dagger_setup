package co.cdmunoz.cryptocurrencyapp.di.modules

import co.cdmunoz.cryptocurrencyapp.CryptocurrenciesActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
//анатация @Module предоставляет нам зависимость
@Module
abstract class BuildersModule {
//сгенерирует AndroidInjector для CryptocurrenciesInjector
  @ContributesAndroidInjector
  abstract fun contributeCryptocurrenciesActivity(): CryptocurrenciesActivity
}