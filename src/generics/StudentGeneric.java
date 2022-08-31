package generics;

public class StudentGeneric<T,S>{

    private T rollNumber;
    private S name;

    public StudentGeneric(T rollNumber, S name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(T rollNumber) {
        this.rollNumber = rollNumber;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentGeneric{" +
                "rollNumber=" + rollNumber +
                ", name=" + name +
                '}';
    }
}
