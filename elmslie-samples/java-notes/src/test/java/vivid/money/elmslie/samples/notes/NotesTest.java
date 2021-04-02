package vivid.money.elmslie.samples.notes;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotesTest {

    @Test
    public void notesAreEmptyInitially() {
        Notes notes = new Notes();
        assertEquals(Collections.emptyList(), notes.getAll());
    }
}
