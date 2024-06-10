package com.example.notesappusingjetpackcompose.feature_note.navigation

sealed class NavScreen(val route: String) {
    object NotesScreen : NavScreen("notes_screen")
    object AddEditNoteScreen : NavScreen("add_edit_note_screen")
}