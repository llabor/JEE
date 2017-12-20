package util;

//import java.io.Serializable;
import java.util.*;

public class JuegoNumBean {
    
        int respuesta;
        boolean exito;
        String pista;
        int numIntentos;
        
        public JuegoNumBean() {
            reset();
        }
        
        public void setGuess(String guess) {
            numIntentos++;
            int g;
            try {
                g = Integer.parseInt(guess);
            } catch (NumberFormatException e) {
                g = -1;
            }
            if (g == respuesta) {
                exito = true;
            } else if (g == -1) {
                pista = "un n&uacute;mero la pr&oacute;xima vez";
            } else if (g < respuesta) {
                pista = "un n&uacute;mero mayor";
            } else if (g > respuesta) {
                pista = "un n&uacute;mero menor";
            }
        }
        
        public boolean getExito() {
            return exito;
        }
        
        public String getPista() {
            return "" + pista;
        }
        
        public int getNumIntentos() {
            return numIntentos;
        }
        
        public void reset() {
            respuesta = Math.abs(new Random().nextInt() % 100)
            + 1;
            exito = false;
            numIntentos = 0;
        }
    }