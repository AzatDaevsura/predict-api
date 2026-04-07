package com.azatdaevsura.predict_api.logic;
import com.azatdaevsura.predict_api.PredictApiApplication;
import com.azatdaevsura.predict_api.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {

        public String createUser(String userName, double studyHours, double attendanceRate, double previousGrades, int parentsEducationLevel) {
            // Here you would typically add logic to save the user to a database
            // For this example, we'll just return a success message

            //temporary logic to simulate user creation
            UserModel user = new UserModel(userName, studyHours, attendanceRate, previousGrades, parentsEducationLevel);
            PredictApiApplication.getListOfUsers().put(UserModel.userIdCounter, user);
            return "User '" + userName + "with UserID: " + user.getUserId() + "' created successfully.";
        }

        public String getAllUsers() {
            StringBuilder sb = new StringBuilder();
            for (UserModel user : PredictApiApplication.getListOfUsers().values()) {
                sb.append(user.toString()).append("\n").append(System.lineSeparator());
            }
            return sb.toString();
        }

        public UserModel getUserById(int userId) {
            return PredictApiApplication.getListOfUsers().get(userId);
        }

        public String deleteUser(int userId) {
            return (PredictApiApplication.getListOfUsers().remove(userId)).getUserId();
        }
}
