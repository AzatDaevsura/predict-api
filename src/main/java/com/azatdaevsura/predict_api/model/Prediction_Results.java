package com.azatdaevsura.predict_api.model;

public record Prediction_Results(double prediction_result, ResultType result_Type, String message) {

}

enum ResultType {
PASS, FAIL
}