import data.Student
import data.studentList
import react.*
import react.dom.li
import react.dom.ol


interface RStudentListState : RState {
    var listStudent: ArrayList<Student>
}

class RStudentList : RComponent<RProps, RStudentListState>() {

    init {
        state.apply {
            listStudent = studentList
        }
    }

    override fun RBuilder.render() {
        ol {
            state.listStudent.map { student ->
                li {
                    rstudent(student)
                }
            }
        }
    }
}

fun RBuilder.rstudentList() =
    child(RStudentList::class) { }