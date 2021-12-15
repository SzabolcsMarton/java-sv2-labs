package virtualmetod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb verbOne = new PhrasalVerb("terjeszt","ki");
        System.out.println(verbOne.getWord());

        Verb verbTwo = new PhrasalVerbWithSuffix("terjeszt", "ki", "és");
        System.out.println(verbOne.getWord());



        Preposition prepositionOne = new PhrasalVerb("terjeszt","ki");
        System.out.println(prepositionOne.getPreposition());
        System.out.println(prepositionOne.getWholeWord());

        Preposition prepositionTwo = new PhrasalVerbWithSuffix("terjeszt", "ki", "és");
        System.out.println(prepositionTwo.getPreposition());
        System.out.println(prepositionTwo.getWholeWord());


        PhrasalVerb phrasalVerbOne = new PhrasalVerb("terjeszt","ki");
        System.out.println(phrasalVerbOne.getWord());
        System.out.println(phrasalVerbOne.getPreposition());
        System.out.println(phrasalVerbOne.getWholeWord());

        PhrasalVerb phrasalVerbTwo = new PhrasalVerbWithSuffix("terjeszt","ki","és");
        System.out.println(phrasalVerbTwo.getWord());
        System.out.println(phrasalVerbTwo.getPreposition());
        System.out.println(phrasalVerbTwo.getWholeWord());


        Suffix suffix = new PhrasalVerbWithSuffix("terjeszt","ki","és");
        System.out.println(suffix.getSuffix());


        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("terjeszt","ki","és");
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
