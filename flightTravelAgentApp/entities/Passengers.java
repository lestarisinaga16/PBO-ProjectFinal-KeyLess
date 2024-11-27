package flightTravelAgentApp.entities;

public class Passengers {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String birthDate;
    private String passportNumber;
    private String idNumber;

    // Constructor kosong
    public Passengers() {
    }

    // Constructor dengan parameter
    public Passengers(Integer id, String name, Integer age, String gender, String birthDate, String passportNumber, String idNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.passportNumber = passportNumber;
        this.idNumber = idNumber;
    }

    // Getter dan Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
