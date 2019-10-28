package com.example.walrus.root

fun isEmailValid(email: String): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
}
fun isPasswordValid(password: String): Boolean {
//    val passwordRegex = Regex.fromLiteral("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!/-_?&]).{8,}")
//    return passwordRegex.matches(password)
    return password.length >= 8
}