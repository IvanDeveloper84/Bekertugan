package kz.rbots.bekertugan.telegrambot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TelegramBotRepositoryProvider {

    private static ButtonRepository buttonRepository;

    private static MessageRepository messageRepository;

    private static CommandCallRepository commandCallRepository;

    private static KeyboardRepository keyboardRepository;

    @Autowired
    public TelegramBotRepositoryProvider(
            ButtonRepository buttonRepository,
            MessageRepository messageRepository,
            CommandCallRepository commandCallRepository,
            KeyboardRepository keyboardRepository) {

        setButtonRepository(buttonRepository);

        setMessageRepository(messageRepository);

        setCommandCallRepository(commandCallRepository);

        setKeyboardRepository(keyboardRepository);
    }

    private static void setButtonRepository(ButtonRepository buttonRepository) {
        TelegramBotRepositoryProvider.buttonRepository = buttonRepository;
    }

    private static void setMessageRepository(MessageRepository messageRepository) {
        TelegramBotRepositoryProvider.messageRepository = messageRepository;
    }

    private static void setCommandCallRepository(CommandCallRepository commandCallRepository) {
        TelegramBotRepositoryProvider.commandCallRepository = commandCallRepository;
    }

    private static void setKeyboardRepository(KeyboardRepository keyboardRepository) {
        TelegramBotRepositoryProvider.keyboardRepository = keyboardRepository;
    }

    public static ButtonRepository getButtonRepository() {
        return buttonRepository;
    }

    public static MessageRepository getMessageRepository() {
        return messageRepository;
    }

    public static CommandCallRepository getCommandCallRepository() {
        return commandCallRepository;
    }

    public static KeyboardRepository getKeyboardRepository() {
        return keyboardRepository;
    }
}
