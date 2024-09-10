package chap08.test;

abstract class Creature {
    protected String name;
    protected String species;

    public Creature(String name, String species){
        this.name = name;
        this.species = species;
    }

    String getName() {
        return this.name;
    }

    String getSpecies() {
        return this.species;
    }

    public abstract void live();
}
