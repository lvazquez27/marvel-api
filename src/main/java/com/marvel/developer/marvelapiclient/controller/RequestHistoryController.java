package com.marvel.developer.marvelapiclient.controller;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import com.marvel.developer.marvelapiclient.model.requesthistory.dto.RequestHistoryDto;
import com.marvel.developer.marvelapiclient.service.AuthManager;
import com.marvel.developer.marvelapiclient.service.RequestHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/history/v1")
@RequiredArgsConstructor
@CrossOrigin
public class RequestHistoryController {
    private final RequestHistoryService historyService;
    private final AuthManager authManager;

    @GetMapping("/history")
    public ResponseEntity<List<RequestHistoryDto>> listAllCharacters(
            @RequestHeader (name="Authorization", required = false) String token){
        this.authManager.authenticateRequest(token);
        List<RequestHistoryDto> response = this.historyService.getHistory();
        return ResponseEntity.ok(response);
    }
}
