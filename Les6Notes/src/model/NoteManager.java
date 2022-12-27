package model;

import java.util.List;

public interface NoteManager {
    List<Note> getAllNotes();

    String CreateNote(Note note);

    Note updateNote(Note note);

    Note readNote(String Id);
}
