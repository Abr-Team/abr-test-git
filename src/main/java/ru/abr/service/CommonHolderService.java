package ru.abr.service;


import ru.abr.service.dto.CommonHolderDto;

import java.util.List;
import java.util.Optional;

public interface CommonHolderService {

    Object getIncomeAsyncReq(String apiKey, Long id);

    CommonHolderDto addAnswer(CommonHolderDto dto, String apiKey);

    Optional<CommonHolderDto> get(Long id);

    List<CommonHolderDto> getAllBy(String apiKey, String endpoint);

    CommonHolderDto updateAnswer(CommonHolderDto dto);

    void deleteAnswer(Long id);

    String getExchangeInfo();

    String getLeverage(String apiKey);

}