package world.gregs.base.tornado

import tornadofx.View
import tornadofx.borderpane

class MainView : View("App") {
    override val root = borderpane {
        top(Header::class)
    }
}