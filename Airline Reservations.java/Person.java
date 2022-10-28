import java.util.Arrays;

public class Person {
    
    private String name;
    private String nationlity;
    private String dateOfBirth;
    private int seatnumber;
    private String[] passport;

    public Person(String name,String nationlaity,String dateOfBirth,int seatnumber){
        this.name=name;
        this.nationlity=nationlaity;
        this.dateOfBirth=dateOfBirth;
        this.seatnumber=seatnumber;
        this.passport=new String[3];
    }

    public Person(Person source){
        this.name=source.name;
        this.nationlity=source.nationlity;
        this.dateOfBirth=source.dateOfBirth;
        this.seatnumber=source.seatnumber;
        this.passport=Arrays.copyOf(source.passport, source.passport.length);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationlity() {
        return this.nationlity;
    }

    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatnumber() {
        return this.seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }
    public void setPassport() {
        this.passport = new String[] {this.name, this.nationlity, this.dateOfBirth};
    }

  
    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);  
        if (number == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void chooseSeat() {
        this.seatnumber = (int) (Math.random() * 11 + 1); 
    }


    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", nationlity='" + getNationlity() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", seatnumber='" + getSeatnumber() + "'" +
            ", passport='" + Arrays.toString(this.passport)  + "'" +
            "}";
    }

}
