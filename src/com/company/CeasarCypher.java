package com.company;

import static java.lang.Math.abs;

public class CeasarCypher {

    String cypherEncrypt(String msg, int shift){


            String s = "";
            int len = msg.length();
            for(int x = 0; x < len; x++){
                char c = (char)(msg.charAt(x) + shift);
                if (c >= 'X')
                    s += (char)(msg.charAt(x) - (26-shift));

                else
                    s += (char)(msg.charAt(x) + shift);
            }
            s = s.replace('#', ' ');
            return s;
        }
    String cypherDecrypt(String msg, int shift){


        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) - shift);
            if (c <= '@')
                s += (char)(msg.charAt(x) + (26-shift));

            else
                s += (char)(msg.charAt(x) - shift);
        }
        s = s.replace('7', ' ');
        return s;
    }



    }


