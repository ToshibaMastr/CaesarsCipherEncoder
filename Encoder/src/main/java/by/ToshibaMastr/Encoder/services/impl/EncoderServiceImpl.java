package by.ToshibaMastr.Encoder.services.impl;

import by.ToshibaMastr.Encoder.services.EncoderService;
import org.springframework.stereotype.Service;

@Service
public class EncoderServiceImpl implements EncoderService {

    @Override
    public String CaesarsCipher(String string, Integer shift) {
        String processedString = "";
        for(char i : string.toCharArray()) {
            processedString = processedString + shift(i, shift%26);
        }
        return processedString;
    }
    private char shift(char Char, Integer shift){
        return (char) ('a' + (Char + shift - 'a')%26);
    }
}
