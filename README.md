# RetrofitMVVM

RetrofitMVVM is a modern Android application that demonstrates the implementation of the MVVM architectural pattern using Kotlin, **Jetpack Compose** for UI, Retrofit for networking, and Dagger 2 for dependency injection. The app fetches and displays news articles from the NewsAPI.

## Screenshots

| News Feed (Bitcoin) | News Feed (Pixel) |
| :---: | :---: |
| <img src="docs/images/Screenshot_WorkingApp_bitcoinArticles.png" width="320" alt="Bitcoin News Feed" /> | <img src="docs/images/Screenshot_WorkingApp_PixelPhones.png" width="320" alt="Pixel News Feed" /> |

## Features

- **Jetpack Compose UI**: Entirely built with modern declarative UI components.
- **News Fetching**: Fetches the latest news articles using the NewsAPI "everything" endpoint.
- **Search Functionality**: Allows searching for specific topics via query parameters.
- **Reactive UI**: Uses StateFlow and Coroutines for a reactive and efficient data flow.
- **Modern Architecture**: Clean separation of concerns using MVVM.
- **Dependency Injection**: Decoupled architecture using Dagger 2.

## Tech Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Networking**: [Retrofit](https://square.github.io/retrofit/) & [Gson](https://github.com/google/gson)
- **Dependency Injection**: [Dagger 2](https://dagger.dev/)
- **Image Loading**: [Coil](https://coil-kt.github.io/coil/compose/)
- **Architecture**: MVVM (Model-View-ViewModel)
- **Concurrency**: [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)
- **UI Components**: Material 3, Scaffold, LazyColumn, Cards

## Architecture

The project follows the **Clean Architecture** principles within the MVVM pattern:

- **Model**: Data structures and Repository pattern for data handling.
- **View (Compose)**: Composable functions that define the UI based on the state.
- **ViewModel**: Manages UI state and business logic, exposing data via StateFlow.
- **DI (Dependency Injection)**: Centralized dependency management using Dagger modules and components.

## Getting Started

### Prerequisites

- Android Studio Ladybug or newer.
- Minimum SDK Level 31.
- An API Key from [NewsAPI.org](https://newsapi.org/).

### Installation

1. Clone the repository.
2. Open the project in Android Studio.
3. Create or open the `local.properties` file in the root directory.
4. Add your NewsAPI key:
   ```properties
   NEWS_API_KEY=your_api_key_here
   ```
5. Sync the project with Gradle files.
6. Build and run the app.

## Project Structure

- `data/`: API services, models, and data repositories.
- `di/`: Dagger components and modules.
- `ui/`: 
    - `newsapi/`: Compose screens and ViewModels.
    - `theme/`: Theme definitions (Color, Type, Theme).
- `utils/`: Constants and helper classes.
