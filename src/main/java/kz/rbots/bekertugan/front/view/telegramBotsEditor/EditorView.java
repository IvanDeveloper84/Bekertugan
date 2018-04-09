package kz.rbots.bekertugan.front.view.telegramBotsEditor;

import com.vaadin.navigator.View;
import com.vaadin.ui.*;
import kz.rbots.bekertugan.telegrambot.data.*;


public final class EditorView extends GridLayout implements View {

    private Panel buttonsPanel     = new ButtonEditor();

    private Panel keyboardsPanel   = new Panel("Keyboards info");

    private Panel messagesPanel    = new Panel("Messages info");

    private Panel commandCallPanel = new Panel("Commands call info");

    private KeyboardRepository    keyRepo = TelegramBotRepositoryProvider.getKeyboardRepository();

    private MessageRepository     msgRepo = TelegramBotRepositoryProvider.getMessageRepository();

    private CommandCallRepository cmdRepo = TelegramBotRepositoryProvider.getCommandCallRepository();


    public EditorView() {

        super(2,2);

        setSizeFull();

        init();


    }

    private void init(){

        addComponent(buttonsPanel);


    }





}