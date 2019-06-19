package world.gregs.base.tornado

import tornadofx.View
import tornadofx.addClass
import tornadofx.label
import tornadofx.vbox

class Header : View() {
    override val root = vbox {
        addClass(Styles.header)
        label("Hello, World!")
    }
}