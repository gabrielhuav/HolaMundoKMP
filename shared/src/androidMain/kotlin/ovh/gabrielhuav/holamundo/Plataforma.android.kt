package ovh.gabrielhuav.holamundo

import android.os.Build

actual fun plataforma(): String = "Android ${Build.VERSION.RELEASE}"
