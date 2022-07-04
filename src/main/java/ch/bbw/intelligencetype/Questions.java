package ch.bbw.intelligencetype;

public enum Questions {

    KINAESTHETIC1("Ich bin ein Ass im Multitasking.", 1),
    KINAESTHETIC2("Ich bin ein Ass im Multitasking.", 1),
    KINAESTHETIC3("Ich fühle mich im Gleichgewicht mit meinem Körper.", 1),
    KINAESTHETIC4("Nichts kann mich schnell aus der Fassung bringen.", 1),
    KINAESTHETIC5("Sport ist ein wichtiger Teil meines Lebens.", 1),

    LINGUISTIC1("Ich kann mehrere Sprachen sprechen.", 2),
    LINGUISTIC2("Wenn ich eine Geschichte schreiben muss, fällt mir das einfach.", 2),
    LINGUISTIC3("Ich lese gerne Bücher.", 2),
    LINGUISTIC4("Menschen um mich bezeichnen mich manchmal als laufendes Wörterbuch.", 2),
    LINGUISTIC5("Ich benutze gerne synonyme für Wörter.", 2),

    NATURALISTIC1("Ich mag Tiere.", 3),
    NATURALISTIC2("Meine Freizeit verbringe ich oft in der Natur.", 3),
    NATURALISTIC3("Ich liebe es zu gärtnern.", 3),
    NATURALISTIC4("In der Natur fühle ich mich wohler als in der Stadt.", 3),
    NATURALISTIC5("Mein Traum ist es ländlich zu leben.", 3),

    MUSICAL1("Ich habe ein gutes Rythmusgefühl.", 4),
    MUSICAL2("Ich singe gerne oder spiele ein Instrument.", 4),
    MUSICAL3("Auf töne reagiere ich sensibel.", 4),
    MUSICAL4("Oft laufen mir Lieder nach.", 4),
    MUSICAL5("Ich bin / war in einem Chor, Band oder andere Musik Gruppe.", 4),

    VISUAL1("Meine Vorstellungskraft ist höher als bei anderen.", 5),
    VISUAL2("Ich bin sehr kreativ.", 5),
    VISUAL3("Oft finde ich mich in Tagträumen wieder.", 5),
    VISUAL4("Mir fällt es leicht mich an neuen Orten schnell zurecht zu finden.", 5),
    VISUAL5("In meiner Freizeit verbringe ich oft Zeit mit Zeichnen, Malen oder einer anderen Kunstform.", 5),

    INTRAPERSONAL1("Ich kann mich gut selbst einschätzen", 6),
    INTRAPERSONAL2("In grösseren Menschen Massen fühle ich mich unwohl.", 6),
    INTRAPERSONAL3("Ich reflektiere meine Handlungen.", 6),
    INTRAPERSONAL4("Gegenüber von Menschen die ich kenne reagiere ich Empathisch.", 6),
    INTRAPERSONAL5("Ich habe meine Gefühle unter Kontrolle.", 6),

    INTERPERSONAL1("Auf einer Party mit vielen Leuten fühle ich mich wohl.", 7),
    INTERPERSONAL2("Ich kann die Gefühle von Menschen gut erkennen und darauf reagieren.", 7),
    INTERPERSONAL3("Wenn sich jemand schlecht fühlt, versuche ich, dass es ihm besser geht.", 7),
    INTERPERSONAL4("Ich fühle mich wohler in Gesellschaft von anderen.", 7),
    INTERPERSONAL5("Ich kann gut verhandeln.", 7),

    LOGICAL1("Bevor ich Handle überdenke ich die Situation genau.", 8),
    LOGICAL2("Ich mag Logikrätsel.", 8),
    LOGICAL3("Mathe, Chemie oder Physik waren Lieblingsfächer von mir während der Schulzeit.", 8),
    LOGICAL4("Mit Zahlen zu Arbeiten fällt mir leichter als mit Menschen zu kommunizieren.", 8),
    LOGICAL5("Mir fällt es einfach Probleme zu lösen.", 8);


    private final String question;
    private final int type;

    Questions(String question, int type) {
        this.question = question;
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public int Type() {
        return type;
    }

}

