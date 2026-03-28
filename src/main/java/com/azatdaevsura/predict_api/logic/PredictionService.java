package com.azatdaevsura.predict_api.logic;

import com.azatdaevsura.predict_api.model.Prediction_Results;
import org.springframework.stereotype.Service;

@Service
public class PredictionService implements PredictionService_Interface {
    @Override
    public Prediction_Results predict_results() {
        return null;
    }

    @Override
    public void savePrediction(String prediction) {

    }

    @Override
    public void loadModel(String modelPath) {

    }
}
