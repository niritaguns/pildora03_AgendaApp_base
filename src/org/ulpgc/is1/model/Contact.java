package org.ulpgc.is1.model;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    protected Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public String getTelephone() { return telephone; }
    public String getEmail() { return email; }

    public void setTelephone(String telephone) { this.telephone = telephone; }
    public void setEmail(String email) { this.email = email; }

    // f) setAddress
    public void setAddress(Address address) { this.address = address; }
    public Address getAddress() { return address; }

    // h) getter abstracto para el nombre (varía según subtipo)
    public abstract String getName();
}
