package hangman.setup.factoryMethod;

import hangman.setup.guice.*;
import hangman.model.*;
import hangman.model.dictionary.*;
import hangman.view.*;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


import static sun.misc.Version.print;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(Language.class);
        //return new English();
    }

    @Override
    public HangmanDictionary createDictionary() {
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(HangmanDictionary.class);
        //return new EnglishDictionaryDataSource();
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(HangmanPanel.class);
        //return new HangmanStickmanPanel();
    }
}
