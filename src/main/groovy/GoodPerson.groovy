class GoodPerson {

    Class<GoodPerson> returnMyClass() {
        return GoodPerson
    }

    Class<GoodPerson> returnMyClassExplicitly() {
        return GoodPerson.class
    }

    String getGoodPerson() {
        return "I'm a good person"
    }
}
