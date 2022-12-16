package password_manager;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class UserInterfaceTest {
    @Test
    void initialize_inputIsBlanc_emptyString() {
        UserInterface userInterface = new UserInterface();

        String message = userInterface.generateMessage("");

        assertThat(message).isEqualTo("");
    }

    @Test
    void initialize_noCommand_unknownCommandMessage() {
        UserInterface userInterface = new UserInterface();

        String message = userInterface.generateMessage("some random input");

        assertThat(message).isEqualTo("Unknown command!");
    }
}
