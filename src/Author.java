public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!this.firstName.equals(other.firstName)) {
            return false;
        }
        if (!this.lastName.equals(other.lastName)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }
}
