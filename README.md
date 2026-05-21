# RetrofitMVVM

RetrofitMVVM is a modern Android application that demonstrates the implementation of the MVVM architectural pattern using Kotlin, Retrofit for networking, and Dagger 2 for dependency injection. The app fetches and displays news articles from the NewsAPI.

## Screenshots

| News Feed (Bitcoin) | News Feed (Pixel) |
| :---: | :---: |
| <img src="docs/images/Screenshot_WorkingApp_bitcoinArticles.png" width="320" alt="Bitcoin News Feed" /> | <img src="docs/images/Screenshot_WorkingApp_PixelPhones.png" width="320" alt="Pixel News Feed" /> |

## Features

- **News Fetching**: Fetches the latest news articles using the NewsAPI "everything" endpoint.
- **Search Functionality**: Allows searching for specific topics via query parameters.
- **Reactive UI**: Uses StateFlow and Coroutines for a reactive and efficient data flow.
- **Modern UI**: Built with RecyclerView, ConstraintLayout, and Material Design components.
- **Dependency Injection**: Decoupled architecture using Dagger 2.

## Tech Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **Networking**: [Retrofit](https://square.github.io/retrofit/) & [Gson](https://github.com/google/gson)
- **Dependency Injection**: [Dagger 2](https://dagger.dev/)
- **Image Loading**: [Glide](https://github.com/bumptech/glide)
- **Architecture**: MVVM (Model-View-ViewModel)
- **Concurrency**: [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)
- **UI Components**: ViewBinding, RecyclerView, Material Components

## Architecture

The project follows the **Clean Architecture** principles within the MVVM pattern:

- **Model**: Data structures and Repository pattern for data handling.
- **View**: Activities and Adapters that handle UI rendering and user interactions.
- **ViewModel**: Acts as a bridge between the View and the Model, managing UI state and business logic.
- **DI (Dependency Injection)**: Centralized dependency management using Dagger modules and components.

## Getting Started

### Prerequisites

- Android Studio Iguana or newer.
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
- `ui/`: Feature-specific UI components (Activity, ViewModel, Adapter).
- `utils/`: Constants and helper classes.
