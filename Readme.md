# CurrencyDemo

1. Data Retrieval: I have successfully implemented data retrieval by fetching exchange rate data from the [ExchangeRatesAPI](http://api.exchangeratesapi.io/v1/latest?access_key='key') using Retrofit2.
2. API Integration: The app is fully integrated with the [ExchangeRatesAPI](https://exchangeratesapi.io/) to ensure up-to-date and accurate currency exchange information.
3. Architecture: I've used the MVVM (Model-View-ViewModel) architecture, incorporating StateFlow and custom app state to manage data flow efficiently. Additionally, a ViewModel is employed to handle user interface-related data.
4. Dependency Injection: Hilt Dagger has been employed for dependency injection, ensuring that the code remains modular and maintainable.
5. Offline Caching: The app features offline caching to enhance user experience by providing access to previously fetched exchange rates even when the user is offline.
6. Scheduled Tasks: To keep the currency data up to date, I've implemented a Worker to schedule tasks, such as updating the currency exchange rates in the local database every 24 hours.
7. UI Design: I've created fully functional user interface components using Jetpack Compose, including LazyColumn, Row, Column, and ConstraintLayout, to ensure a smooth and visually appealing user experience.
8. Navigation: Navigation components have been integrated to facilitate seamless navigation between different screens within the app, following best practices for a single-activity, multiple-fragment architecture.
9. Local Caching: Shared Preferences are utilized for local caching within the app, ensuring that user preferences and settings are saved and loaded efficiently.


<img src="https://github.com/MuhammadAliGhaffar/CurrencyDemo/blob/master/screenshots/homescreen.png" width="200">
<img src="https://github.com/MuhammadAliGhaffar/CurrencyDemo/blob/master/screenshots/currencyscreen.png" width="200">
