package adapter.example1

import adapter.example1.pilot.PilotPen

class PilotPenAdapter : Pen {
    private val pilotPen = PilotPen()

    override fun write(str: String) {
        pilotPen.mark(str)
    }
}
