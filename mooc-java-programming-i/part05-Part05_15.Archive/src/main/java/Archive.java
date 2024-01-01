public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean equals (Object compared){
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // convert the object to a Bird object
        Archive comparedBook = (Archive) compared;

        // if the values of the object variables are equal, the objects are, to
        if (this.identifier.equals(comparedBook.identifier)) {
            return true;
        }



        return false;

    }

    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
