package co.com.sofka.utils;

import co.com.sofka.model.ListaUser;
import co.com.sofka.model.RegistroUsuarioPeticion;
import co.com.sofka.model.Support;
import co.com.sofka.model.UserCreac;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    public static ListaUser getDataListaUser() {

        List<UserCreac> data = new ArrayList<>();
        data.add(new UserCreac(1, "george.bluth@reqres.in", "George", "Bluth", "https://reqres.in/img/faces/1-image.jpg"));

        Support support = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");

        return ListaUser.builder()
                .page(1)
                .perPage(6)
                .total(12)
                .totalPages(2)
                .data(data)
                .support(support).build();
    }

    public static UserCreac getDataUserCreac() {
        return UserCreac.builder()
                .id(1)
                .email("george.bluth@reqres.in")
                .firstName("George")
                .lastName("Bluth")
                .avatar("https://reqres.in/img/faces/1-image.jpg")
                .build();


    }
    public static RegistroUsuarioPeticion getDataRegistroUsuarioPeticion (){
        return RegistroUsuarioPeticion.builder()
                .email("george.bluth@reqres.in")
                .password("123456")
                .build();

    }



}
