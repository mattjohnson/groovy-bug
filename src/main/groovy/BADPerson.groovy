class BADPerson {

    Class<BADPerson> returnMyClass() {
        return BADPerson
    }

    Class<BADPerson> returnMyClassExplicitly() {
        return BADPerson.class
    }

    String getBADPerson() {
        return "I'm a bad person"
    }
}
