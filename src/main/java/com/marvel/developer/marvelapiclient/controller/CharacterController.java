package com.marvel.developer.marvelapiclient.controller;

import com.marvel.developer.marvelapiclient.model.characters.dto.CharacterDto;
import com.marvel.developer.marvelapiclient.service.AuthManager;
import com.marvel.developer.marvelapiclient.service.CharacterService;
import com.marvel.developer.marvelapiclient.service.RequestHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/character/v1")
@RequiredArgsConstructor
@CrossOrigin
public class CharacterController {

    private final CharacterService characterService;
    private final RequestHistoryService historyService;
    private final AuthManager authManager;

    @GetMapping("/character")
    public ResponseEntity<List<CharacterDto>> listAllCharacters(
            @RequestHeader(name="Authorization", required = false) String token){
        this.authManager.authenticateRequest(token);
        List<CharacterDto> response = this.characterService.listCharacters();
        this.historyService.writeRequest("/character");
        return ResponseEntity.ok(response);
    }
    @GetMapping("/character/{characterId}")
    public ResponseEntity<CharacterDto> getCharacterById(
            @RequestHeader(name="Authorization", required = false) String token,
            @PathVariable Integer characterId){
        this.authManager.authenticateRequest(token);
        CharacterDto response = this.characterService.getById(characterId);
        if (response==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Character Not found");
        }
        this.historyService.writeRequest("/character/"+characterId);
        return ResponseEntity.ok(response);
    }
}
