package adapter.example1

fun main() {
    val pen = PilotPenAdapter()
    val assignment = AssignmentWriter()
    assignment.pen = pen
    assignment.writeAssignment("Hello world")
}