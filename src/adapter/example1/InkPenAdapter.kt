package adapter.example1

import adapter.example1.ink.InkPen

class InkPenAdapter: Pen {
    private val inkPen = InkPen()

    override fun write(str: String) {
        inkPen.writeInk(str)
    }
}