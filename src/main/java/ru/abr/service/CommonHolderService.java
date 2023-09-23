package ru.abr.service;


import java.util.List;

public interface CommonHolderService {

    Object getIncomeAsyncReq(String apiKey, Long id);

    List<Object> getPositionRisk(String symbol, String apiKey);

}