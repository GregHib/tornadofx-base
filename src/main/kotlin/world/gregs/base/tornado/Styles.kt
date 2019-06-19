package world.gregs.base.tornado

import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val header by cssid()
    }

    init {
        label {
            fontSize = 3.em
            textFill = c(175, 47, 47, 0.5)
        }
    }
}