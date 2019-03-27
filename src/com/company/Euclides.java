package com.company;

public class Euclides {

public int euclides(int numberA, int numberB){
//    int result = 0;
    int result = numberA + numberB;

    while(result > 1){
    if(numberA > numberB) {
        result = numberA - numberB;
        numberA = result;
    }
    else if(numberA < numberB){
        result = numberB - numberA;
        numberB = result;
    }
    else{
        break;
    }
    }


    return result;
}

}
