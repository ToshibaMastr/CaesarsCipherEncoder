package by.ToshibaMastr.Encoder.services;

import org.springframework.stereotype.Service;

@Service
public interface EncoderService {

    String CaesarsCipher(String string, Integer shift);

}
