package world.gregs.base.tornado

import tornadofx.App
import tornadofx.launch

class TornadoApp : App(MainView::class, Styles::class)

fun main(args: Array<String>) {
    launch<TornadoApp>(*args)
}