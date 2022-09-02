package Clase1Asinc;

public class Persona {
    private String name;
    private String lastname;
    private String email;
    private int age;

    public Persona(String name, String lastname, String email, int age) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    //metodo que muestre nombre y apellido

    public void showFullName () {
        System.out.println("El nombre completo es: " + name + " " + lastname);
    }

    //Metodo para calcular si la persona es mayor a 18 años

    public boolean isOlder () {
        return (2022 - age) >= 18;
    }

    //getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
