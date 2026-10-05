package ovh.gabrielhuav.holamundo

import androidx.compose.ui.window.ComposeUIViewController

/** Lo que llama Swift (`MainViewControllerKt.MainViewController()`) para meter Compose en la app iOS. */
fun MainViewController() = ComposeUIViewController { App() }
