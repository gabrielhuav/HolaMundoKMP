package ovh.gabrielhuav.holamundo

import platform.UIKit.UIDevice

actual fun plataforma(): String =
    "${UIDevice.currentDevice.systemName()} ${UIDevice.currentDevice.systemVersion}"
