package com.example.notesappusingjetpackcompose.feature_note.domain.usecases

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getIndividualNote : GetNote
)
