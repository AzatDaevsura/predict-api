package com.azatdaevsura.predict_api.logic;

import com.azatdaevsura.predict_api.model.Prediction_Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface PredictionService_Interface {

    abstract Prediction_Results predict_results();
    abstract void savePrediction(String prediction);
    abstract void loadModel(String modelPath);
}
