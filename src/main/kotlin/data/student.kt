package data

data class Student (
    val surname: String,
    val firstname: String
)

val studentList =
    arrayListOf(
        Student("Жестовский", "Ян"),
        Student("Дёмина", "Анастасия"),
        Student("Бейсембаев", "Имир"),
        Student("Жараспаева", "Джанна"),
        Student("Буйволова", "Екатерина"),
        Student("Воробьёв", "Данила"),
        Student("Купряков", "Даниил"),
        Student("Султанов", "Алмат"),
        Student("Сексембаев", "Тимур")
    )