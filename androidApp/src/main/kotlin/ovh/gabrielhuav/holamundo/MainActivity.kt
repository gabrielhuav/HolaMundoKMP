package ovh.gabrielhuav.holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        // `App()` es la pantalla compartida de `:shared` (commonMain): la misma que ve iOS.
        setContent { App() }
    }
}
