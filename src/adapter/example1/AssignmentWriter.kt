package adapter.example1

class AssignmentWriter {
    lateinit var pen: Pen

    fun writeAssignment(str: String) {
        pen.write(str)
    }
}