public class ChallengePerson {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 100) {
            this.age = age;
        } else
        {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if(this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        String fullName;
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
           fullName = "";
        } else if(this.firstName.isEmpty()) {
            fullName = this.lastName;
        } else if(this.lastName.isEmpty()){
            fullName = this.firstName;
        } else {
            fullName = this.firstName + " " + this.lastName;
        }
        return fullName;
    }


}
