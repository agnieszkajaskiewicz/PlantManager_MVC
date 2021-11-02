package com.ajaskiewicz.PlantManager.service;

import com.ajaskiewicz.PlantManager.model.WateringSchedule;
import com.ajaskiewicz.PlantManager.repository.WateringScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wateringScheduleService")
public class WateringScheduleServiceImpl implements WateringScheduleService {

    private WateringScheduleRepository wateringScheduleRepository;

    @Autowired
    public WateringScheduleServiceImpl(WateringScheduleRepository wateringScheduleRepository) {
        this.wateringScheduleRepository = wateringScheduleRepository;
    }

    @Override
    public List<WateringSchedule> findAll() {
        return wateringScheduleRepository.findAll();
    }

    @Override
    public WateringSchedule find(Integer id) {
        return wateringScheduleRepository.findById(id).get();
    }

    @Override
    public WateringSchedule save(WateringSchedule wateringSchedule) {
        return wateringScheduleRepository.save(wateringSchedule);
    }
}
