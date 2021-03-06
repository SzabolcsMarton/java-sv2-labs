package schoolrecords;

public class Mark {
    private final MarkType markType;
    private final Subject subject;
    private final Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        checkSubjectAndTutor(subject, tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this(MarkType.valueOf(markType), subject, tutor);
    }

    private void checkSubjectAndTutor(Subject subject, Tutor tutor) {
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }



    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return markType.getStringMarkType() + "(" + markType.getIntMarkType() + ")";
    }
}
