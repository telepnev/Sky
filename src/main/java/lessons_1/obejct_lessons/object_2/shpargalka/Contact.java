package lessons_1.obejct_lessons.object_2.shpargalka;

public class Contact {
    private final String nick;
    private String phone;

    public Contact(String nick, String phone) {
        this.nick = nick;
        this.phone = phone;
    }

    public String getNick() {
        return nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return nick +" : " + phone;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Contact c2 = (Contact) other;
        return nick.equals(c2.nick);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nick);
    }
}
