package entities;

public class Hotel {
    public String nome;
    public String email;

public Hotel(){

}public Hotel (String nome,String email){
    this.nome = nome;
    this.email = email;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}

}
