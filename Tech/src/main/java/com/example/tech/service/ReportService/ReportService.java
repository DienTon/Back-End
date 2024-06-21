package com.example.tech.service.ReportService;

import com.example.tech.repository.ReportRepo.IReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService implements IReportService{
    @Autowired
    private IReportRepo iReportRepo;
}
