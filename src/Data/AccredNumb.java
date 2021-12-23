package Data;

final public class AccredNumb {

    private final int numAccred;

    public AccredNumb(int numAccred) {
        this.numAccred = numAccred;
    }

    public int getNumAccred() {
        return numAccred;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccredNumb accreditNumber = (AccredNumb) o;
        return accreditNumber.equals(accreditNumber.numAccred);
    }
}
