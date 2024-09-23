package net.ausiasmarch.control.api;

import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.control.model.NumAdivinar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class Adivinar {

    NumAdivinar numAdivinar = new NumAdivinar();
    int intentos = 0;

    @PostMapping("/random")
    public ResponseEntity<Integer> getRandom() {
        numAdivinar = new NumAdivinar();
        intentos = 0;
        return new ResponseEntity<>(0, HttpStatus.OK);
    }

    @PostMapping("/adivinar")
    public ResponseEntity<String> adivinar(@RequestBody Integer numero) {
        String res = "";
        intentos++;
        if (numAdivinar.getNumAdivinar() == numero) {
            res = "FELICITACIONES GANASTE !!! <br>" + intentos+" INITENTOS";
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else if (numAdivinar.getNumAdivinar() < numero) {
            res = "MAS BAJO";
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else {
            res = "MAS ALTO";
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
       
    }
}