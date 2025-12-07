# NoteAppCA

NoteAppCA is a modern Android note-taking application built using Kotlin and Jetpack Compose. It follows Clean Architecture principles and the MVVM design pattern to ensure scalability and testability.

## Features

- **Create and Edit Notes**: Add new notes with a title and content. Edit existing notes.
- **Color Coding**: Assign different colors to notes for better organization.
- **Sorting**: Order notes by title, date, or color (Ascending/Descending).
- **Clean Architecture**: Separation of concerns into Data, Domain, and Presentation layers.

## Tech Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Toolkit**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Architecture**: Clean Architecture + MVVM
- **Dependency Injection**: [Hilt](https://dagger.dev/hilt/)
- **Local Database**: [Room](https://developer.android.com/training/data-storage/room)
- **Asynchronous Programming**: [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)
- **Navigation**: [Compose Navigation](https://developer.android.com/jetpack/compose/navigation)

## Project Structure

The project is modularized by feature. The main feature `feature_note` is structured as follows:

- **data**: Contains the implementation of the repository, data sources (Room DAO/Database).
- **domain**: Contains the business logic, use cases, repository interfaces, and model classes.
- **presentation**: Contains the UI (Compose screens), ViewModels, and state management.

## Setup

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync Gradle files.
4. Run the app on an emulator or physical device.

## License

[Add License Here]
