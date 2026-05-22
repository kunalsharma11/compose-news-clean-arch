# Daily Headlines

**Daily Headlines** is a high-performance Android news application built with **Jetpack Compose**, **Retrofit**, and **Dagger 2**. It demonstrates modern Android development best practices, featuring a clean MVVM architecture and a sleek, professional UI for consuming news from the NewsAPI.

## Screenshots

| News Feed (Bitcoin) | Search Results (Pixel) |
| :---: | :---: |
| <img src="docs/images/Screenshot_WorkingApp_bitcoinArticles.png" width="320" alt="Bitcoin News Feed" /> | <img src="docs/images/Screenshot_WorkingApp_PixelPhones.png" width="320" alt="Pixel Search Results" /> |

## Key Features

- **Jetpack Compose UI**: A fully declarative UI implementation using Material 3 components.
- **Dynamic Search**: Integrated search bar in the TopAppBar allowing users to fetch news by keywords.
- **Professional Theming**: Custom-designed Material 3 theme with professional Navy/Blue branding and support for **Dark Mode**.
- **Reactive State Management**: Leverages `StateFlow` and `Coroutines` to manage UI state seamlessly.
- **In-App Browsing**: Opens full articles using **Android Custom Tabs** for a premium user experience.
- **Dependency Injection**: Robust architecture powered by Dagger 2 for decoupled and testable code.

## Tech Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose) (Material 3)
- **Networking**: [Retrofit](https://square.github.io/retrofit/) & [Gson](https://github.com/google/gson)
- **Dependency Injection**: [Dagger 2](https://dagger.dev/)
- **Image Loading**: [Coil](https://coil-kt.github.io/coil/compose/)
- **Architecture**: MVVM (Model-View-ViewModel) + Repository Pattern
- **Concurrency**: [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)

## Architecture

The project adheres to **Clean Architecture** principles within the MVVM pattern:

- **Data Layer**: Handles networking (`Retrofit`), data models, and the `Repository` pattern.
- **UI Layer**: Composable functions that observe state and react to user inputs.
- **ViewModel Layer**: Manages the business logic and exposes a lifecycle-aware `UiState` via `StateFlow`.
- **DI Layer**: Manages object lifecycles and dependency graph using Dagger.

## Getting Started

### Prerequisites

- Android Studio Ladybug or newer.
- Minimum SDK Level 31.
- An API Key from [NewsAPI.org](https://newsapi.org/).

### Installation

1. Clone the repository.
2. Open the project in Android Studio.
3. Add your NewsAPI key to `local.properties` (this file is git-ignored for security):
   ```properties
   NEWS_API_KEY=your_api_key_here
   ```
4. Sync the project with Gradle files.
5. Build and run the app.

## Project Structure

- `data/`: Network services and repositories.
- `di/`: Dagger components, scopes, and modules.
- `ui/`: 
    - `newsapi/`: Compose screens and ViewModels.
    - `theme/`: Professional branding (Color, Typography, Theme).
    - `base/`: Common UI utilities like `UiState`.
- `utils/`: Constants and helper classes.
