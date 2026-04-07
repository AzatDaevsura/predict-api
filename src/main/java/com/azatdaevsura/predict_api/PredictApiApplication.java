package com.azatdaevsura.predict_api;

import com.azatdaevsura.predict_api.model.UserModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class PredictApiApplication {

    private static HashMap<Integer,UserModel> ListOfUsers = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(PredictApiApplication.class, args);
	}


    public static HashMap<Integer, UserModel> getListOfUsers() {
        return ListOfUsers;
    }
}
