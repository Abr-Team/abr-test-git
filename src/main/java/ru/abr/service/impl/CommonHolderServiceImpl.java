package ru.abr.service.impl;

import org.springframework.stereotype.Service;
import ru.abr.service.CommonHolderService;
import ru.abr.service.dto.CommonHolderDto;

import java.util.List;
import java.util.Optional;

@Service
public class CommonHolderServiceImpl implements CommonHolderService {

    @Override
    public Object getIncomeAsyncReq(String apiKey, Long id) {
        return null;
    }

    @Override
    public CommonHolderDto addAnswer(CommonHolderDto dto, String apiKey) {
        return null;
    }

    @Override
    public Optional<CommonHolderDto> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CommonHolderDto> getAllBy(String apiKey, String endpoint) {
        return null;
    }

    @Override
    public CommonHolderDto updateAnswer(CommonHolderDto dto) {
        return null;
    }

    @Override
    public void deleteAnswer(Long id) {

    }

    @Override
    public String getExchangeInfo() {
        return null;
    }

    @Override
    public String getLeverage(String apiKey) {
        return null;
    }
}