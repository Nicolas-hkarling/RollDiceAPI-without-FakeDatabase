package karling.nicolas.RollDice.Controller;

import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class RollDice {

    @GetMapping("/d20")
    public ResponseEntity<Object> Dice20(){
        ArrayList<Integer> dice20 = new ArrayList<Integer>();
        dice20.add(1);
        dice20.add(2);
        dice20.add(3);
        dice20.add(4);
        dice20.add(5);
        dice20.add(6);
        dice20.add(7);
        dice20.add(8);
        dice20.add(9);
        dice20.add(10);
        dice20.add(11);
        dice20.add(12);
        dice20.add(13);
        dice20.add(14);
        dice20.add(15);
        dice20.add(16);
        dice20.add(17);
        dice20.add(18);
        dice20.add(19);
        dice20.add(20);

        Random number = new Random();
        int generateNumber = number.nextInt(20);

        JSONObject entity = new JSONObject();
        entity.put("resultado", dice20.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d12")
    public ResponseEntity<Object> ice12(){
        ArrayList<Integer> dice12 = new ArrayList<Integer>();
        dice12.add(1);
        dice12.add(2);
        dice12.add(3);
        dice12.add(4);
        dice12.add(5);
        dice12.add(6);
        dice12.add(7);
        dice12.add(8);
        dice12.add(9);
        dice12.add(10);
        dice12.add(11);
        dice12.add(12);

        Random number = new Random();
        int generateNumber = number.nextInt(12);

        JSONObject entity = new JSONObject();
        entity.put("resultado", dice12.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping ("/d10")
    public ResponseEntity<Object> Dice10() {
        ArrayList<Integer> dice10 = new ArrayList<Integer>();
        dice10.add(1);
        dice10.add(2);
        dice10.add(3);
        dice10.add(4);
        dice10.add(5);
        dice10.add(6);
        dice10.add(7);
        dice10.add(8);
        dice10.add(9);
        dice10.add(10);


        Random number = new Random();
        int generateNumber = number.nextInt(10);

        JSONObject entity = new JSONObject();
        entity.put("resultado", dice10.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d8")
    public ResponseEntity<Object> Dice8() {
        ArrayList<Integer> dice8 = new ArrayList<Integer>();
        dice8.add(1);
        dice8.add(2);
        dice8.add(3);
        dice8.add(4);
        dice8.add(5);
        dice8.add(6);
        dice8.add(7);
        dice8.add(8);


        Random number = new Random();
        int generateNumber = number.nextInt(8);

        JSONObject entity = new JSONObject();
        entity.put("resultado", dice8.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d6")
    public ResponseEntity<Object> Dice6() {

        ArrayList<Integer> dice6 = new ArrayList<Integer>();
        dice6.add(1);
        dice6.add(2);
        dice6.add(3);
        dice6.add(4);
        dice6.add(5);
        dice6.add(6);


        Random number = new Random();
        int generateNumber = number.nextInt(6);

        JSONObject entity = new JSONObject();
        entity.put("resultado", dice6.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d4")
    public ResponseEntity<Object> Dice4() {

        ArrayList<Integer> dice4 = new ArrayList<Integer>();
        dice4.add(1);
        dice4.add(2);
        dice4.add(3);
        dice4.add(4);


        Random number = new Random();
        int generateNumber = number.nextInt(4);

        JSONObject entity = new JSONObject();
        entity.put("resultado", dice4.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }
}

