import SwiftUI
import UIKit
import Shared

/// El puente Swift ↔ Compose: mete el `UIViewController` de Compose (`MainViewController.kt`)
/// dentro de SwiftUI. La pantalla en sí es Kotlin, la misma que ve Android.
struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        ComposeView()
            .ignoresSafeArea()
    }
}
