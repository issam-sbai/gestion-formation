package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Participant;
import com.codingtech.gestionformation.repo.ParticipantRepo;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelExportService {

    @Autowired
    private ParticipantRepo participantRepository;

    public byte[] exportParticipantsToExcel() throws IOException {
        List<Participant> participants = participantRepository.findAll();

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Participants");

            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("ID");
            headerRow.createCell(1).setCellValue("Nom");
            headerRow.createCell(2).setCellValue("Prenom");
            headerRow.createCell(3).setCellValue("Telephone");
            headerRow.createCell(4).setCellValue("Email");
            headerRow.createCell(5).setCellValue("Username");

            // Populate data
            int rowNum = 1;
            for (Participant participant : participants) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(participant.getId());
                row.createCell(1).setCellValue(participant.getNom());
                row.createCell(2).setCellValue(participant.getPrenom());
                row.createCell(3).setCellValue(participant.getTelephone());
                row.createCell(4).setCellValue(participant.getEmail());
                row.createCell(5).setCellValue(participant.getUsername());
            }

            // Write to ByteArrayOutputStream
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            workbook.write(outputStream);
            return outputStream.toByteArray();
        }
    }
}
