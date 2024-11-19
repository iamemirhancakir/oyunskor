# skoroyun 🎮

This Android application integrates two different games into a single app. The user can open the games by pressing the corresponding buttons on the main screen.

## 🚀 Features
- **Two integrated games**: Easily accessible through buttons on the main app screen.
- **Smooth navigation**: Simple and user-friendly interface.
- **Compact design**: Lightweight app focusing on functionality.

## 🛠️ Technologies Used
- **Android Studio**
- **Java**: Primary language for app and game integration.
- **XML**: For designing the UI.

## 🎮 How It Works
- The app displays two buttons on the main screen, one for each game.
- When a user presses a button, the corresponding game opens in a new activity.

## 🖥️ Setup and Run
- Clone the repository:
- git clone https://github.com/iamemirhancakir/oyunskor.git
- Open the project in Android Studio.
- Build and run the app on an emulator or physical device.

## 📚 Key Learning Points
- Activity transitions in Android.
- Integrating separate Java files into a single application.
- Designing a minimalistic user interface with XML.

## 🤝 Contributions
- Contributions and feedback are welcome! If you'd like to add more games or improve the app, feel free to submit a pull request.

## ✨ Author
- Emirhan
- GitHub:https://github.com/iamemirhancakir

## 📂 Project Structure
```plaintext
├── MainActivity.java       # Main screen with buttons to launch games
├── Game1Activity.java      # First game implementation
├── Game2Activity.java      # Second game implementation
├── res/
│   ├── layout/
│   │   ├── activity_main.xml       # Layout for main screen
│   │   ├── activity_game1.xml      # Layout for Game 1
│   │   └── activity_game2.xml      # Layout for Game 2
│   └── drawable/                   # Images and icons
├── AndroidManifest.xml     # App configuration
└── README.md               # Project documentation
'
