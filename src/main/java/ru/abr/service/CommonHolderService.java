package ru.abr.service;


import java.util.List;

public interface CommonHolderService {

    Object getIncomeAsyncReq(String apiKey, Long id);

    List<Object> getPositionRisk(String symbol, String apiKey);

    Object getAccount(String apiKey);

    Object getRestrictions(String apiKey);

    Object getIncomeAsyncByIdReq(String apiKey, Long id);

}