package Data;

final public class Password {

    private final int myPassword;

    public Password(int myPassword) {
        this.myPassword = myPassword;
    }

    public int getMyPassword() {
        return myPassword;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return password.equals(password.myPassword);
    }
}
